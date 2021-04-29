import java.util.*;
import java.io.*;
import java.lang.Math;

class Java_Loops_II{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of inputs you want to give: ");
        int number_of_inputs = in.nextInt();
        int[] a = new int[number_of_inputs];
        int[] b = new int[number_of_inputs];
        int[] n = new int[number_of_inputs];

        for(int i=0;i<number_of_inputs;i++){
            System.out.print("\nEnter the inputs for "+(i+1)+":\n\ta: ");
            a[i] = in.nextInt();
            System.out.print("\tb: ");
            b[i] = in.nextInt();
            System.out.print("\tn: ");
            n[i] = in.nextInt();
        }

        for(int i=0;i<number_of_inputs;i++){
            for(int k=1;k<=n[i];k++){
                int temp2 = 0;
                int sum = 0;
                for(int j=0;j<k;j++){
                    temp2 += Math.pow(2,j);
                }
                int temp_b = 0;
                temp_b = (b[i])*(temp2);
                sum = a[i] + temp_b;
                System.out.print(sum+" ");
            }
            System.out.println("\n");
        }
        in.close();
    }
}