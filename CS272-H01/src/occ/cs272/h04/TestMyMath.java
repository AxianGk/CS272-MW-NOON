import occ.cs272.h04.MyMath;

public class TestMyMath {

    public static void main(String[] args) {
        double[] tests = {25, 20, 10, 5, 2, 1, .5};
        int passCount = 0;
        for (double n : tests)
        {
            double a = MyMath.squareRoot(n);
            double b = Math.sqrt(n);
            double d = Math.abs(a - b);
            System.out.println("  Math.sqrt(" + n + ") = " + b);
            System.out.print("MyMath.sqrt(" + n + ") = " + a + "  ");            
            System.out.println((0 < d && d < MyMath.epsilon) ? "PASS" : "FAIL");
            if (0 < d && d < MyMath.epsilon) passCount++;
        }
        System.out.printf("Passed: " + passCount + " of " + tests.length + " tests (%.1f%%)\n", 100.0*passCount/tests.length);
    }

}
