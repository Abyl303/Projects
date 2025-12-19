public class Sum {
    public static void main(String[] args){
        int[] ar=new int[] {2,3,5,4};
        int res=sumArray(ar);
        System.out.println(res);

    }
    public static int sumArray(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}
