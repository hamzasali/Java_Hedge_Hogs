package alena.tasks;

import java.util.Map;
import java.util.TreeMap;

public class non_repeating_vowels {
    public static void main(String[] args) {

        String given="mood";

        System.out.println(firstNonRepeatingVowel(given));

    }

    public static int firstNonRepeatingVowel(String given){
        Map<Integer, String> givenMap=new TreeMap<>();
        int j=0; //for map key

        for (int i = 0; i < given.length(); i++) {
            givenMap.put(j, String.valueOf(given.charAt(i))); //to wrap using valueOf
            j++;
        }

        int result=-1;
        for (Map.Entry<Integer, String> eachEntry : givenMap.entrySet()) {
            int count=0;
            for (Map.Entry<Integer, String> eachEntry2 : givenMap.entrySet()) {
                boolean vowel=eachEntry.getValue().equals("a") || eachEntry.getValue().equals("e") || eachEntry.getValue().equals("i")||
                        eachEntry.getValue().equals("o") ||eachEntry.getValue().equals("u");
                if(vowel){
                    if(eachEntry.getValue().equals(eachEntry2.getValue())){
                        count++;
                    }
                }
            }
            if(count==1){
                result= eachEntry.getKey();
                break;
            }
        }

        return result;
    }

}
