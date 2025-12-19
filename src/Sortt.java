import java.util.Scanner;

public class Sortt {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("razmer massive");
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0; i<a; i++){
            arr[i]=sc.nextInt();
        }

        int x=sc.nextInt();
        boolean bool=false;
        for(int i=0; i<a; i++){
            if(x==arr[i]){
                bool=true;
                break;
            }

        }
        if(bool){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
