package hamzaAli.string;

public class LastWordLength {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";

        System.out.println(lastWordL(s));
    }

    public static int lastWordL(String s) {
        s = s.stripTrailing();
        int size = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                size++;
            } else {
                return size;
            }
        }
        return size;
    }
}
