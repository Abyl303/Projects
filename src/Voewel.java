public class Voewel {
    public static void main(String[] args) {
        int cnt= isVowel();
        System.out.println("number "+cnt);
    }

    public static int isVowel() {
        String s="hello";
        s = s.toLowerCase();
        int cnt=0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                cnt++;
            }
        }
        return cnt;
    }
}