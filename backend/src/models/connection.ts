import mysql from 'mysql2/promise'; 
import dotenv from 'dotenv';

dotenv.config();

const connection = mysql.createPool({
    host: process.env.DB_HOST,
    user: process.env.USER_DB,
    password: process.env.PASSWORD_DB,
    database: process.env.DB_NAME,
});

const checkConnection = async () => {
    try {
        const conn = await connection.getConnection();
        console.log('Connected to the database successfully!');
        conn.release(); 
    } catch (err) {
        console.error('Error connecting to the database:', err);
    }
};

checkConnection();

export default connection;
