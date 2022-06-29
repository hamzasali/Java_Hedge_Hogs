package cihat;

public class CatDog {

    public static void main(String[] args) {

        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("1cat1cadodog"));
    }


    public static boolean catDog(String str){
        int cat=0,dog=0;

        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i,i+3).equalsIgnoreCase("cat")){
                cat++;
            }
            if (str.substring(i,i+3).equalsIgnoreCase("dog")){
                dog++;
            }
        }

        return cat==dog;
    }
}
