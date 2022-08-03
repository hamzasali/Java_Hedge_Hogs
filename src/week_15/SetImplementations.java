package week_15;

import java.util.*;

public class SetImplementations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(List.of(3,2,3,2,1));

        HashSet<Integer> hashSet = new HashSet<>(list);
        System.out.println("hashSet = " + hashSet);


        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(list);
        System.out.println("linkedHashSet = " + linkedHashSet);


        TreeSet<Integer> treeSet = new TreeSet<>(list);
        System.out.println("treeSet = " + treeSet);



    }
}
