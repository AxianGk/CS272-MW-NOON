package tests;
public class TestGrade
{
    public static void main(String[] args)
    {
        System.setProperty("hwPackage", "occ.cs272.h01");
        System.setProperty("hwClass", "Grade");
        checkresults.TestRunner.runTests();
    }
}
