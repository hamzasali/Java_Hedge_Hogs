package Marika;

public class LengthOfLastWord {

    public static int lastWord(String str) {
        if(str == null || str.trim().length() == 0) {
            return 0;
        }

        String[] arr = str.trim().split(" ");
        if(arr.length == 1) {
            return str.trim().length();
        } else {
            return arr[arr.length - 1].length();
        }

    }

    public static int lastWord1(String str) {
        int count =0;
        if(str.length()==0) {
            return count;
        }
        int n = str.length()-1;
        while(n >= 0) {
            if(str.charAt(n)!=' ') {
                break;
            }
            n--;
        }
        for(int i = n; i>=0; i--) {
            if(str.charAt(i)==' ') {
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        System.out.println(lastWord(str));
        System.out.println(lastWord1(str));
    }
}
