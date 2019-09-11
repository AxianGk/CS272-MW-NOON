package tests;
public class TestAll
{
    public static void main(String[] args)
    {
        System.setProperty("hwPackage", "occ.cs272.h01");
        System.setProperty("hwDescription", "CS 272 HW01");
        final double totalPoints = 15.0;
        String[] classes = {"RoachPopulation", "IceCreamCone", 
                "Grade", "Sequence"};
        checkresults.TestRunner.runTests(classes, totalPoints);
    }
}
