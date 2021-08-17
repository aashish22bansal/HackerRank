import java.util.*;

public class Java_1D_Array_Part_2 {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int flag=0;
        for(int i=0;i<game.length;){
            if(((i+leap)>=(game.length))||(i==(game.length)))
            { // Checking if we can directly reach the end
                flag=1;
                break;
            }
            else
            { // Checking other cases when we cannot reach the end directly
                if(game[i+leap]==0)
                { // Jump Comdition
                    i=i+leap;
                }
                else if(game[i+leap]==1)
                { // When jump is not possible
                    if(game[i+1]==0)
                    { // Taking a step forward
                        i++;
                    }
                    else if(game[i+1]==1)
                    { // if it is not possible to take a step forward
                        if((i-1)<0){
                            flag = 0;
                            break;
                        }
                        else{
                            if(game[i-1]==0)
                            { // Take a step back
                                if(i==1)
                                { // Checking if we back on start
                                    flag=0;
                                    break;
                                }
                                else{
                                    i--;
                                }
                            }
                            else if(game[i-1]==1){
                                flag=0;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if(flag==1){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}