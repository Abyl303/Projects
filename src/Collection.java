import java.util.ArrayList;

public class Collection {
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(2);
        System.out.println(arr);
        arr.remove(Integer.valueOf(1));
        System.out.println(arr);
    }
}
