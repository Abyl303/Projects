import java.util.LinkedList;

public class Linkeedd {
    public static void main(String[] args){
        LinkedList<Integer> arr=new LinkedList<>();
        arr.add(4);
        arr.add(5);
        arr.add(6);

        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}
