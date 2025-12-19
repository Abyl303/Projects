import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sort {
    public static void main(String[] args){
        Map<String, Integer> dict =new HashMap<>();
        dict.put("Анна", 25);
        dict.put("Петр", 32);
        dict.put("Мария", 18);
        dict.put("Иван", 40);
        dict.put("Елена", 28);

        Map<String, Integer> sorted=new TreeMap<>(dict);

        System.out.println(sorted);

    }
}
