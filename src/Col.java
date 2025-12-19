import java.util.ArrayList;
import java.util.Iterator;

public class Col {
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        System.out.println(arr);
        Iterator<Integer> it=arr.iterator();
        while (it.hasNext()){
            if(it.next()%2==0){
                it.remove();
            }
        }
        System.out.println(arr);
    }
}
