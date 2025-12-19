public class Secmax {
    public static void main(String[] args){
        int[] ar=new int[]{1,2,3,4,7,3};
        int res=sec_max(ar);
        System.out.println(res);
    }

    static int sec_max(int[] arr){
        int max=arr[0];
        int sec=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                sec=max;
                max=arr[i];
            }
            else if(arr[i]>sec && arr[i]<max){
                sec=arr[i];
            }
        }
        return sec;
    }
}
