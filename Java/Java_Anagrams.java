import java.util.*;

public class Java_Anagrams
{
    public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        //sorting logic  
        for (int i = 0; i < tempArray.length; i++)
        {
            for (int j = i + 1; j < tempArray.length; j++)
            {
                char tmp;
                if (tempArray[i] > tempArray[j])
                {
                    tmp = tempArray[i];
                    tempArray[i] = tempArray[j];
                    tempArray[j] = tmp;
                }
            }
        }
        return new String(tempArray);
    }
    public static boolean isAnagram(String a, String b)
    {
        // Complete the function
        String tempA = sortString(a.toLowerCase()), tempB = sortString(b.toLowerCase());
        // Converting String A to Char Array
        char[] chA = new char[tempA.length()];
        for(int i=0;i<tempA.length();i++)
        {
            chA[i] = tempA.charAt(i);
        }
        System.out.println("Array of String A: ");
        for(char cA:chA)
        {
            System.out.print(cA);
        }

        // Converting String B to char Array
        char[] chB = new char[tempB.length()];
        for(int i=0;i<tempB.length();i++)
        {
            chB[i] = tempB.charAt(i);
        }
        System.out.println("\nArray of String B: ");
        for(char cB:chB)
        {
            System.out.print(cB);
        }
        if(chA.length == chB.length){
            for(int i=0;i<chA.length;i++){
                if(chA[i]==chB[i]){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        else{
            return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}