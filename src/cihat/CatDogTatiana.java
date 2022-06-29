package cihat;

public class CatDogTatiana {

    public static void main(String[] args) {

        String str="cat cat dog";
        System.out.println(catDog(str));


    }

    public static boolean catDog(String str){
        int countCat=0;
        int countDog=0;
        String word="cat";
        String word1="dog";
        while (str.contains(word)){
            countCat++;
            str=str.replaceFirst(word," ");
        }
        while (str.contains(word1)){
            countDog++;
            str=str.replaceFirst(word1," ");
        }
        return countCat==countDog;
    }
}
