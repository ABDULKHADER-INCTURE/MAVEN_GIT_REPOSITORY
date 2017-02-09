package TWENTYTHASSIGNMENT;

import java.util.*;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args)
    {
        System.out.println("Enter first and second number:");
        Scanner input= new Scanner(System.in);
        int num1,num2;
        num1 = input.nextInt();
        num2 = input.nextInt();
        int answer;
        System.out.println("Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication 4 for division and 5 for Modulo:");
        int choose;
        choose = input.nextInt();
        switch (choose){
        case 1:
            System.out.println(add( num1,num2));
            break;
        case 2:
            System.out.println(sub( num1,num2));
            break;      
        case 3:
            System.out.println(mult( num1,num2));
            break;
        case 4:
            System.out.println(div( num1,num2));
            break;
        case 5:
            System.out.println(mod( num1,num2));
            break;
                 }

    }
    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int sub(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static int div(int x, int y)
    {
        int result = x/y;
        return result;
    }
    public static int mod(int x, int y)
    {
        int result = x%y;
        return result;
    }
}