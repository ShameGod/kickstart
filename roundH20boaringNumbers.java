import java.util.*;
import java.io.*;


public class Solution {
    private static final Scanner _in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static void main(String[] args) {
        int T = _in.nextInt();
        for (int i = 1; i <= T; ++i) {
            System.out.println("Case #" + i + ": " + solve());
        }
    }
    
    private static int solve() {
        int L = _in.nextInt();
        int R = _in.nextInt();
        int counter = 0;
        for(int numb = L; numb <= R; numb++){
            String str = String.valueOf(numb);
            if(isBoaring(str)){
                counter = counter+1;
            }
        }
        return counter;
    }
    
    private static boolean isBoaring(String str){
        for(int i = 0; i < str.length(); i++){
            int numb = Character.getNumericValue(str.charAt(i));
            if(i%2==0 && numb%2==0 || 
               i%2==1 && numb%2==1){
                return false;
            }
        }
        return true;
    } 
}
