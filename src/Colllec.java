import java.util.ArrayList;
import java.util.Iterator;

public class Colllec {
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(3);
        arr.add(5);
        arr.add(6);
        arr.add(9);
        arr.add(8);
        System.out.println(arr);

        Iterator<Integer> it=arr.iterator();
        while(it.hasNext()){
            if(it.next()%2==0){
                it.remove();
            }
        }
        System.out.println(arr);
    }

}
