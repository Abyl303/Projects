import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String st= sc.next();
        char[] s=st.toCharArray();
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        for(int i=s.length-1; i>=0; i--){
            System.out.print(s[i]+" ");
        }
    }


}