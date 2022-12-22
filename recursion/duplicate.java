public class duplicate {
    public static void removeDuplicates(String str,int index,StringBuilder newStr,boolean map[])
    {
        if(index==str.length())
        {
            System.out.println(newStr);
            return;
        }
        char currentChar=str.charAt(index);
        if(map[currentChar-'a']==true)
        {
            //if the current character is present in the map then move forward do not need to add
            removeDuplicates(str, index+1, newStr, map);
        }else{
            //if not included then update the map array
            map[currentChar-'a']=true;
            removeDuplicates(str, index+1, newStr.append(currentChar), map);
        }
    }
    public static void main(String [] args)
    {
        String str="appannacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
