package occ.cs272.h04;

public class StringUtil 
{
    
    public static boolean find(String text, String str)
    {
        // TODO: Complete recursive method find, which
        // tests whether a given text contains a string str
        // Hint: If the text starts with the string you want to match, then you are done.
        //       If not, consider the text that you obtain by removing the first character.
        boolean result = false;
        if(text.length() >= str.length())
        {
            String shorter = text.substring(1, text.length());
            if(str.equals(text.substring(0, str.length())))
            {
                result = true;
            }
            else
            {
                result = StringUtil.find(shorter, str);
            }
        }
        return result;
    }

}
