package occ.cs272.h04;

import occ.cs272.h04.StringUtil;

public class TestStringUtil {

    public static void main(String[] args) {
        String str = "Mississippi";
        String[] subs = {"sip", "pip", "sisi", "iss", "Miss", "ippi", "i", "o", "ississipp", "Mississippi", ""};
        int passCount = 0;
        for (String sub : subs)
        {
            boolean b = (str.indexOf(sub) >= 0);
            boolean a = StringUtil.find(str, sub);
            if (b == a) passCount++;
            System.out.print("Expected: " + b + ", Actual: " + a);
            System.out.println(" <-- find(\"" + str + "\", \"" + sub + "\")");
        }
        System.out.printf("Passed: " + passCount + " of " + subs.length + " tests (%.1f%%)\n", 100.0*passCount/subs.length);
        
    }

}
