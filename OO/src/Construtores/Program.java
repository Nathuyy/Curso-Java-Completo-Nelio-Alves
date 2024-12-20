package Construtores;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        System.out.println();
        Produto product = new Produto(name, price, quantity);
        System.out.println("Product data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int newQunatity = sc.nextInt();
        product.addProducts(newQunatity);
        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        newQunatity = sc.nextInt();
        product.removeProducts(newQunatity);
        System.out.println();
        System.out.println("Updated data: " + product);
        sc.close();
    }
}