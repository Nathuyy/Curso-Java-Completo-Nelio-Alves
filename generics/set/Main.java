package generics.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();


        set.add("TV");
        set.add("notebook");
        set.add("tablet");

       System.out.println(set.contains("notebook"));
        System.out.println(set.contains("Notebook")); //case sensitive
            set.remove("tablet");

            set.removeIf(x -> x.length() >= 3);

        for (String itens : set){
            System.out.println(itens);
        }
    }
}
