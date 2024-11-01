package generics.map;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("telefone", "5198905");

        cookies.remove("email");

        for (String key : cookies.keySet()){ //keyset retorna as chaves
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
