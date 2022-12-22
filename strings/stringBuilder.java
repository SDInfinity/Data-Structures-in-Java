public class stringBuilder {       //this takes O(n) as compared to strings which take O(n^2)
    public static void main(String[] args ){
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z';ch++)
        {
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
