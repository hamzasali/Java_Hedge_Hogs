package Sergiy;

public class CatAndDog {

    public static boolean isCatEqualDog (String str){
        int numCat = 0, numDog = 0;
        while(str.contains("cat") || str.contains("dog")){
            if(str.contains("cat")){
                str = str.replaceFirst("cat", "");
                numCat++;
            }
            if(str.contains("dog")){
                str = str.replaceFirst("dog", "");
                numDog++;
            }
        }
        return numCat == numDog;
    }

    public static void main(String[] args) {

        String str = "1cat1cadodog";
        System.out.println(isCatEqualDog(str));
    }

}
