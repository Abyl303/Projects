public class Test {
    public static void main(String[] args){
        String s = "lololowka";
        System.out.println("Length: " + s.length());
        char[] arr = s.toCharArray();
        boolean isPalindrome = true;

        for(int i = 0; i < s.length() / 2; i++){
            if(arr[i] == arr[s.length() - 1 - i]){
                System.out.println("nice: " + arr[i] + " == " + arr[s.length() - 1 - i]);
            } else {
                System.out.println("sgl: " + arr[i] + " != " + arr[s.length() - 1 - i]);
                isPalindrome = false;
                break; // можно выйти из цикла, палиндром уже невозможен
            }
        }

        if(isPalindrome){
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is NOT a palindrome");
        }
    }
}
