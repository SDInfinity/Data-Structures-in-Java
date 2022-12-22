public class stringCompression {

    public static String compress(String str){
        StringBuilder sb=new StringBuilder("");
        Integer count=1;
        for(int i=0;i<str.length();i++)
        {
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){       //condition for repeated character
                count++;  
                i++;
            }
            sb.append(str.charAt(i));          //appending the letter
            if(count>1){
                sb.append(count.toString());   //appending the corresponding frequency
            }
            count=1;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaaaaaaaaaaabc";
        System.out.println(compress(str));
    }
    
}
