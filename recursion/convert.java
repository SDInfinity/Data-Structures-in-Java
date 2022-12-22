public class convert {
    public static void convertString(int number,int idx,String words[])
    {
        String str=Integer.toString(number);//=>"1947"
        String newString="";
        if(idx==str.length())
        {
           return;
        }
        System.out.print(newString+words[Character.getNumericValue(str.charAt(idx))]+" ");
        convertString(number, idx+1, words);         
    }
    
    public static void main(String [] args)
    {
        int number=1947;
        String words[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        convertString(number, 0, words);
    }
}
