public class permutations {
    public static void permutation(String s, String ans) {
        if (s.length()==0) {
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<s.length();i++)
        {
            char currentChar=s.charAt(i);
            String newString=s.substring(0,i)+s.substring(i+1);
            permutation(newString, ans+currentChar);
        }
       
    }

    public static void main(String[] args) {
        String s = "abc";
        permutation(s, "");

    }
}

