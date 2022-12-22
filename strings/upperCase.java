public class upperCase {
    // public static void convert(String str)
    // {
    // String str2[]=str.split(" ");
    // for(int i=0;i<str2.length;i++)
    // {
    // System.out.print(str2[i].substring(0,1).toUpperCase()+str2[i].substring(1,str2[i].length())+"
    // ");
    // }
    // }
    public static String convert(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i)); // appending the space
                i++; // increment if it's a space
                sb.append(Character.toUpperCase(str.charAt(i))); // converting forst character to Upper case
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi, i am sougata ";
        System.out.println(convert(str));
    }
}
