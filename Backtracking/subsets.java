public class subsets {
    public static void subset(String s, String ans, int i) {
        if (i == s.length()) {
            System.out.println(ans);
            return;
        }
        // choice yes when character is being added to the subset .
        subset(s, ans + s.charAt(i), i + 1);
        // choice character does not get added .
        subset(s, ans, i + 1);
    }

    public static void main(String[] args) {
        String s = "abc";
        subset(s, " ", 0);

    }
}
