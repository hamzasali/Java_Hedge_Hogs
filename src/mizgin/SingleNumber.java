package mizgin;

import java.util.HashMap;
import java.util.HashSet;

public class SingleNumber {

    public static void main(String[] args) {

        //System.out.println(findSingle(new int[]{1, 1, 2, 3, 3, 2, 4, 5, 6, 6, 6, 7, 7, 7, 7, 7}));

        //System.out.println(Arrays.toString(findUnique(new int[]{1, 1, 2, 3, 3, 2, 4, 5, 6, 6, 7, 7})));

        System.out.println(findSingle(new int[]{1, 1, 2, 3, 3, 2, 5, 6, 6, 7, 7}));

    }

    public static int findSingle(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (!set.add(i)) {
                set.remove(i);
            }
        }

        for (int i : set) {
            return i;
        }

        return -1;
    }

    public static int findSingle2(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for (int i : map.keySet()) {
            if (map.get(i) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static int[] findUnique(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (set.contains(i)) {
                set.remove(i);
            }else {
                set.add(i);
            }
        }

        int[] result = new int[2];
        int k=0;

        for (int i : set) {
            result[k++]=i;
        }

        return result;
    }

}
