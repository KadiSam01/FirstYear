package com.mycompany.project3sbk;

/**
 * The test class BitTestD. This tests D-level
 *
 * @author Liz Johnson
 * @version 4/8/22
 */
public class BitTestD {

    /**
     * Tests to see if s1 and s2 are equal
     *
     * @param s1 string 1
     * @param s2 string 2
     * @param method name/description of test
     * @return 1 if passes test, 0 if not
     */
    private static int assertEquals(String s1, String s2, String method) {
        if (s1.equals(s2)) {
            return 1;
        } else {
            System.out.println("Failed " + method + " Expected ["
                    + s1 + "] Saw [" + s2 + "]");
            return 0;
        }

    }

    /**
     * Tests to see if s1 and s2 are equal
     *
     * @param s1 int 1
     * @param s2 int 2
     * @param method name/description of test
     * @return 1 if passes test, 0 if not
     */
    private static int assertEquals(int s1, int s2, String method) {
        if (s1 == s2) {
            return 1;
        } else {
            System.out.println("Failed " + method + " Expected ["
                    + s1 + "] Saw [" + s2 + "]");
            return 0;
        }
    }

    /**
     * Does all tests for D-level for Bit
     */
    public static void doBitTestsD() {
        int numTests = 9;
        int testsPassed = 0;
        testsPassed += test1DConstructor();
        testsPassed += test2DConstructor();
        testsPassed += test3DConstructor();
        testsPassed += test4DSetValue();
        testsPassed += test5DSetValue();
        testsPassed += test6DSetValue();
        testsPassed += test7DSetValue();
        testsPassed += test8DToString();
        testsPassed += test9DToString();
        if (numTests == testsPassed) {
            System.out.println("Congrats! All tests were passed for Bit, Level D");
        } else {
            System.out.println("Passed " + testsPassed + " out of " + numTests + " tests in Bit, Level D");
        }

    }

    /**
     * Tests attempt to construct illegal Bit
     *
     * @return number of tests passed
     */
    public static int test1DConstructor() {
        Bit Bit1 = new Bit(20);
        return assertEquals(0, Bit1.getValue(), "test1DConstructor");
    }

    /**
     * Tests attempt to construct Bit with value of 0
     *
     * @return number of tests passed
     */
    public static int test2DConstructor() {
        Bit Bit1 = new Bit(0);
        return assertEquals(0, Bit1.getValue(), "test2DConstructor");
    }

    /**
     * Tests attempt to construct Bit with value of 1
     *
     * @return number of tests passed
     */
    public static int test3DConstructor() {
        Bit Bit1 = new Bit(1);
        return assertEquals(1, Bit1.getValue(), "test3DConstructor");
    }

    /**
     * Tests attempt to setValue to illegal value
     *
     * @return number of tests passed
     */
    public static int test4DSetValue() {
        Bit Bit1 = new Bit(0);
        Bit1.setValue(10);
        return assertEquals(0, Bit1.getValue(), "test4DSetValue");
    }

    /**
     * Tests attempt to setValue to illegal value
     *
     * @return number of tests passed
     */
    public static int test5DSetValue() {
        Bit Bit1 = new Bit(1);
        Bit1.setValue(6768668);
        return assertEquals(1, Bit1.getValue(), "test5DSetValue");
    }

    /**
     * Tests attempt to setValue to 0 after being constructed with value of 1
     *
     * @return number of tests passed
     */
    public static int test6DSetValue() {
        Bit Bit1 = new Bit(1);
        Bit1.setValue(0);
        return assertEquals(0, Bit1.getValue(), "test6DSetValue");
    }

    /**
     * Tests attempt to setValue to 1 after being constructed with value of 0
     *
     * @return number of tests passed
     */
    public static int test7DSetValue() {
        Bit Bit1 = new Bit(0);
        Bit1.setValue(1);
        return assertEquals(1, Bit1.getValue(), "test7DSetValue");
    }

    /**
     * Tests toString when Bit is 0
     *
     * @return number of tests passed
     */
    public static int test8DToString() {
        Bit Bit1 = new Bit(0);
        return assertEquals("0", Bit1.toString(), "test8DToString");
    }

    /**
     * Tests toString when Bit is 1
     *
     * @return number of tests passed
     */
    public static int test9DToString() {
        Bit Bit1 = new Bit(1);
        return assertEquals("1", Bit1.toString(), "test9DToString");
    }
}
