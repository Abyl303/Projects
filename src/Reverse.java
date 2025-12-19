public class Reverse {
    public static void main(String[] args){
        String stt=revSt();
        System.out.println(stt);
    }
    public static String revSt(){
        String s="hello";
        String st=" ";
        char[] arr= s.toCharArray();
        for(int i=0; i<s.length(); i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=s.length()-1; i>=0; i--){
            st=st+arr[i];
        }
        return st;
    }
}
