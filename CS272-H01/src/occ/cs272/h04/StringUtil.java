package occ.cs272.h04;

public class StringUtil 
{
    
    public static boolean find(String text, String str)
    {
        // TODO: Complete recursive method find, which
        // tests whether a given text contains a string str
        // Hint: If the text starts with the string you want to match, then you are done.
        //       If not, consider the text that you obtain by removing the first character. 
        String shorter = text.substring(0, text.length() - 1);
        if(str == text.substring(0, str.length()))
        {
            return true;
        }
        else if(str == shorter.substring(0, str.length()))
        {
            return true;
        }
        else
        {
            find(shorter, str);
        }
        return false;
    }

}
