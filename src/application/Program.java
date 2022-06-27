package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

       method1();

       System.out.println("end of program");


    }

    public static void method1() {
        System.out.println("**method1 start");
        method2();
        System.out.println("**method1 end");
    }

    public static void method2() {
        System.out.println("**method1 start");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
        }
        catch (InputMismatchException e) {
            System.out.println("input error");
        }
        System.out.println("**method1 end");

        sc.close();
    }
}
