package test.hashMap;

import java.util.HashMap;
import java.util.Map;

public class hashMapTest {
    public static void main(String[] args) {
        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("K1","1");
        hashMap.put("K2","1");
        hashMap.put("K3","2");
        hashMap.put("K3","666");
    }
}
