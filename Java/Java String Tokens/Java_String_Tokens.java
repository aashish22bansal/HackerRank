import java.io.*;
import java.util.*;

public class Java_String_Tokens 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        String temp_s = s.trim();
        System.out.println("The String after trimming is: "+temp_s);
        if(temp_s.length()==0)
        {
            System.out.println(0);
            return;
        }

        String[] tokens = temp_s.split("[^A-Za-z]+");
        System.out.println(tokens.length);
        for(String token:tokens){
            System.out.println(token);  
        }
    }
}
