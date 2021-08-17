import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_List {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n=0, q=0, position=0, element=0;
        String query = "";
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        System.out.print("Enter the values of the list:\n");
        for(int i=0;i<n;i++){
            System.out.print("Enter the element "+i+": ");
            list.add(sc.nextInt());
        }
        System.out.print("\nThe elements of the list are: ");
        for(int i=0;i<n;i++){
            System.out.print("\nList Element "+i+": "+list.get(i));
        }

        System.out.print("\nEnter the number of queries: ");
        q = sc.nextInt();

        for(int i=0;i<q;i++){
            System.out.println("Enter the query[\"Insert\"/\"Delete\"]: ");
            query = sc.next();
            if(query.equals("Insert")){
                System.out.print("Enter the position for Insertion: ");
                position = sc.nextInt();
                System.out.print("Enter the Element value for Insertion: ");
                element = sc.nextInt();
                list.add(position,element);
            }
            else if(query.equals("Delete")){
                System.out.print("Enter the position for Insertion: ");
                position = sc.nextInt();
                list.remove(position);
            }
        }

        System.out.print("\nThe elements of the list are: ");
        for(int i=0;i<list.size();i++){
            System.out.print("\nList Element "+i+": "+list.get(i));
        }
    }
}