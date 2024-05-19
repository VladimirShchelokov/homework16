import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] list = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> map = new HashMap<>();

        for (String items : list){
            if(map.containsKey(items)){
                map.replace(items, true);
            }else {
                map.put(items, false);
            }
        }
        System.out.println(map);
    }
}