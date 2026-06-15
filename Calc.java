import java.io.*;
import java.util.Scanner;

public class Calc {
    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();

        System.out.println("和: " + add(a, b));
        System.out.println("差: " + sub(a, b));
    }
}