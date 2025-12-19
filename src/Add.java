public class Add {
    public static void main(String[] args){
        int[] ar={1,2,3,5};
        int res=vow(ar);
        System.out.println(res);
    }

    static int vow(int[] arr){
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
