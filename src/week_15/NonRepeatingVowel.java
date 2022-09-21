package week_15;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingVowel {

    public static void main(String[] args) {

        System.out.println(nonRepeatingVowelBruteForce("google"));
        System.out.println(nonRepeatingVowel("google"));

    }


    public static int nonRepeatingVowelBruteForce(String str){

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); // get all letters one by one
            if ("aeiou".contains("" + currentChar)) { // check if current char is vowel
                int count = 0;  // keep total occurrence count of the current vowel
                for (int j = 0; j < str.length(); j++) { // iterate over the same input to find current vowel count
                    if (currentChar == str.charAt(j)) {
                        count++; // if current char is found increase count
                    }
                }
                if (count == 1){ // check if the count equals to 1. If so, current vowel is non-repeated
                    return i; // since we focus on the FIRST non-repeating vowel, no need to check rest
                }
            }
        }
        return -1; // if all vowels are repeated or if there is no vowel, just return -1
    }

    public static int nonRepeatingVowel(String str){

        Map<Character,Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            if ("aeiou".contains(String.valueOf(ch))){
                map.put(ch, map.getOrDefault(ch,0)+1);
            }
        }
        System.out.println(map);


        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue()==1){
                return str.indexOf(entry.getKey());
            }
        }
        return -1;
    }
}
