package DSA;
import java.util.Map;
import java.util.HashMap;
public class DictionaryMapEx {
    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap<>();
        map.put(10, "Hello");
        map.put(20, "World");
        map.put(2.5, 56);
        map.put("Hi", "I'm Aleena");
        System.out.println(map);
    }
}
