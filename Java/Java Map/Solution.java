import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.nextLine();
            if(n<1||n>100000)
            {
                while(n<1||n>100000)
                {
                    n = in.nextInt();
                    in.nextLine();
                }
            }
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            for(int i=0;i<n;i++)
            {
                String name=in.nextLine();
                int phone=in.nextInt();
                if(((int)(Math.log10(phone)+1))!=8)
                {
                    while(((int)(Math.log10(phone)+1))!=8)
                    {
                        phone =in.nextInt();
                    }
                }
                map.put(name.toLowerCase(), phone);
                in.nextLine();
            }
            while(in.hasNext())
            {
                String s=in.nextLine();
                if (map.containsKey(s)) {
                    System.out.println(s + "=" + map.get(s));
                } else {
                    System.out.println("Not found");
                }
            }
            in.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
