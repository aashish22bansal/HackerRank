import java.util.Scanner;

public class Java_Substring_Comparison {

    static long fac(long n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n*fac(n-1);
    }

    public static String getSmallestAndLargest(String s, int k) {
        String current_string = s.substring(0,k);
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for(int i=k;i<s.length();i++){
            current_string = current_string.substring(1,k)+s.charAt(i);
            if(largest.compareTo(current_string)<0){
                largest = current_string;
            }
            if(smallest.compareTo(current_string)>0){
                smallest = current_string;
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}