import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Day_3_Intro_to_Conditional_Statements {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if(N%2!=0){
            System.out.println("Weird");
        }
        else if(N%2==0){
            if(N>=2 && N<=5){
                System.out.println("Not Weird");
            }
            if(N>=6 && N<=20){
                System.out.println("Weird");
            }
            if(N>20){
                System.out.println("Not Weird");
            }
        }
        bufferedReader.close();
    }
}
