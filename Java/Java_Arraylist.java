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
        
        int d=0;

        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>(n);
        for(int i = 1;i <= n;i++){
            System.out.println("Enter the elements for the list "+(i)+": ");
            System.out.println("\tEnter the value of d: ");
            d = sc.nextInt();
            if((d<0)&&(d>50000))
            {
                while((d<0)&&(d>50000))
                {
                    d = sc.nextInt();
                }
            }
            ArrayList<Integer> tempArrayList = new ArrayList<Integer>(d);
            for(int j = 1;j <= d;j++){
                System.out.println("\t\tEnter the element "+j+": ");
                int temp = sc.nextInt();
                tempArrayList.add(temp);
            }
            arrayList.add(tempArrayList);
        }

        // Printing ArrayList of ArrayLists on screen
        for(int i=0; i<arrayList.size(); i++){
            System.out.println("List "+(i+1)+": ");
            for(int j=0; j<arrayList.get(i).size(); j++){
                System.out.println("\tElement "+(j+1)+": "+arrayList.get(i).get(j)+" ");
            }
        }

        // Taking input for the number of queries
        System.out.println("Enter the value of q: ");
        int q = sc.nextInt();
        if((q<1)&&(q>1000))
        {
            while((q<1)&&(q>1000))
            {
                q = sc.nextInt();
            }
        }
        
        // Taking input of the queries
        ArrayList<ArrayList<Integer>> queries = new ArrayList<ArrayList<Integer>>(q);
        for(int i=0;i<q;i++){
            ArrayList<Integer> tempQuery = new ArrayList<Integer>(2);
            System.out.print("\n\nEnter the values for the query "+(i+1)+": ");
            System.out.print("\n\tEnter the value of x: ");
            int x = sc.nextInt();
            if((x<1)&&(x>=n))
            {
                while((x<1)&&(x>=n))
                {
                    x = sc.nextInt();
                }
            }
            tempQuery.add(x);
            System.out.print("\tEnter the value of y: ");
            int y = sc.nextInt();
            tempQuery.add(y);
            System.out.print("Elements for the Temporary LIst "+(i+1)+" are: ");
            for(int b=0; b<2; b++){
                System.out.print(tempQuery.get(b)+" ");
            }
            queries.add(tempQuery);
        }

        // Printng all the queries
        for(int a=0; a<queries.size(); a++){
            System.out.print("\nQuery "+(a+1)+": ");
            for(int b=0; b<2; b++){
                System.out.print(queries.get(a).get(b)+" ");
            }
        }

        // Finding the elements in the ArrayList of ArrayLists according to the particular queries.
        System.out.print("\nSo, the number of queries is: "+queries.size()+"\n");
        for(int i=0;i<queries.size();i++){
            try{
                System.out.println(arrayList.get(queries.get(i).get(0)-1).get(queries.get(i).get(1)-1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
            
        }
    }
}