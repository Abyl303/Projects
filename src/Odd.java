import java.util.Scanner;

public class Odd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("razmer massiva");
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int cnt=0;
        int cnt2=0;
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                cnt++;
            }
            else if(arr[i]%2!=0){
                cnt2++;
            }
        }
        System.out.println("Even " + cnt + " " + "Odd " + cnt2);


    }
}
