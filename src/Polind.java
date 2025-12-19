import java.util.Scanner;

public class Polind {
    public static void main(String[] args){
        int[] ar=new int[] {1,2,3,4,5,6};
        System.out.println(countEven(ar));

    }
    public static int countEven(int[] arr) {
        // Твой код здесь
        int cnt=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                cnt++;
            }
        }
        return cnt;



    }

}
