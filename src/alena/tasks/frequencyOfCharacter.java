package alena.tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class frequencyOfCharacter {
    public static void main(String[] args) {

        String given="responsible";

        System.out.println(frequencyOfCharacter(given));


    }

    public static Map<Character, Integer> frequencyOfCharacter(String given){

        Map<Character, Integer> frequency=new LinkedHashMap<>(); //insertion order

        if(given==null){
            return null;
        }
        if(given.isEmpty()){
            return frequency;
        }

        for (int i = 0; i < given.length(); i++) { //locating first character
            char each=given.charAt(i);
            int count=0;
            for (int j = 0; j < given.length(); j++) { //comparing to other characters
                if(given.charAt(j)==each){
                    count++;
                }
                frequency.put(each, count); //adding pairs to map
            }

        }


        return frequency;
    }

}
