public class Even {
    public static void main(String[] args){
        int[] ar=new int[] {14,3,2,1,33};
        int res=countEven(ar);
        System.out.println(res);
    }

    public static int countEven(int[] arr){
        int cnt=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                cnt++;
            }
        }
        return cnt;
    }
}
