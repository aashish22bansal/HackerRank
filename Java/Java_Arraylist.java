import java.io.*;
import java.util.*;

public class Java_Arraylist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        if((n<0)&&(n>20000))
        {
            while((n<0)&&(n>20000))
            {
                n = sc.nextInt();
            }
        }
        
        System.out.println("Enter the value of d: ");
        int d = sc.nextInt();
        if((d<0)&&(d>50000))
        {
            while((d<0)&&(d>50000))
            {
                d = sc.nextInt();
            }
        }
        System.out.println("Enter the value of q: ");
        int q = sc.nextInt();
        if((q<1)&&(q>1000))
        {
            while((q<1)&&(q>1000))
            {
                q = sc.nextInt();
            }
        }
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        if((x<1)&&(x>n))
        {
            while((x<1)&&(x>n))
            {
                x = sc.nextInt()
            }
        }
    }
}