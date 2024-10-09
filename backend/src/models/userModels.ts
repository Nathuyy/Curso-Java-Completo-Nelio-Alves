import { RowDataPacket } from "mysql2";
import express, { Request, Response } from "express";
import connection from "./connection"; 
import bcrypt from 'bcrypt';

interface User {
    name: string;
    email: string;
    password: string;
}

export class UserModelQueries {
    public static getAllUsers = async (
        req: Request,
        res: Response
    ): Promise<RowDataPacket[]> => {
        try {
            const [allUsers] = await connection.execute('SELECT * FROM users') as unknown as [RowDataPacket[], any]; 

            return allUsers; 
        } catch (error) {
            console.error('Error fetching users:', error);
            throw new Error('Error fetching users'); 
        }
    };

    public static registerUser = async (
        req: Request,
        res: Response
    ): Promise<void> => {
        const { name, email, password }: User = req.body;

        try {
            const hashedPassword = await bcrypt.hash(password, 10);

            await connection.execute(
                'INSERT INTO users (name, email, password) VALUES (?, ?, ?)', [name, email, hashedPassword]
            );
            
            res.status(201).json({ message: 'User registered successfully' });
        } catch (error) {
            console.error('Error registering user:', error);
            res.status(500).json({ error: 'Error registering user' });
        }
    };
}