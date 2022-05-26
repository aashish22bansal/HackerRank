import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            Scanner reader = new Scanner(System.in);
            Stack<Character> stack = new Stack<Character>();
            String input = null;
            while(reader.hasNext()){
                input = reader.nextLine();
                boolean balance = true;
                int len = input.length();
                if((len%2)==0){
                    for(int i=0;i<len;i++){
                        if(input.charAt(i)=='('){
                            stack.push('(');
                        }
                        else if(input.charAt(i)=='{'){
                            stack.push('{');
                        }
                        else if(input.charAt(i)=='['){
                            stack.push('[');
                        }
                        else if(input.charAt(i)==')'){
                            if(stack.isEmpty()){
                                balance=false;
                            }
                            else if(stack.pop()!='('){
                                balance=false;
                            }
                        }
                        else if(input.charAt(i)=='}'){
                            if(stack.isEmpty()){
                                balance=false;
                            }
                            else if(stack.pop()!='{'){
                                balance=false;
                            }
                        }
                        else if(input.charAt(i)==']'){
                            if(stack.isEmpty()){
                                balance = false;
                            }
                            else if(stack.pop()!='['){
                                balance = false;
                            }
                        }
                    }
                }
                else{
                    balance = false;
                }
                if(balance){
                    System.out.println("true");
                }
                else{
                    System.out.println("false");
                }
            }
            reader.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}