import java.util.Arrays;

public class anagram {
    public static boolean check(String str1, String str2) {
        str1.toLowerCase();
        str2.toLowerCase();
        char char1[] = str1.toCharArray();
        char char2[] = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        if (char1.length != char2.length) {
            return false;
        }
        for (int i = 0; i < char1.length; i++) {

            if (char1[i] != char2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "dacee";
        String str2 = "cade";
        if (check(str1, str2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
