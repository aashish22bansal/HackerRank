import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_Exception_Handling {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a=0,b=0;
        try{
            System.out.print("\nEnter the First Operand: ");
            a = sc.nextInt();
            System.out.print("\nEnter the second Operand: ");
            b = sc.nextInt();
            System.out.println(a/b);
        }
        catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
        catch(ArithmeticException e){
            System.out.println(e.getClass().getName()+": / by zero");
        }
    }
}
