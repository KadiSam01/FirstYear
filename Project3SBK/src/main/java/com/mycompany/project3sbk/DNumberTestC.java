package com.mycompany.project3sbk;

/**
 * The test class DNumberTestC. Tests DNumber at level C.
 *
 * @author Liz Johnson
 * @version 4/8/22
 */
public class DNumberTestC {

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
     * Does all tests for C-level for DNumber
     */
    public static void doDNumberTestsC() {
        int numTests = 8;
        int testsPassed = 0;
        testsPassed += test1CConstructorAndToString();
        testsPassed += test2CConstructorAndToString();

        if (numTests == testsPassed) {
            System.out.println("Congrats! All tests were passed for DNumber, Level C");
        } else {
            System.out.println("Passed " + testsPassed + " out of " + numTests + " tests in DNumber, Level C");
        }

    }

    /**
     * Tests ints that can be represented in 1 bit
     *
     * @return number of tests passed
     */
    public static int test1CConstructorAndToString() {
        int c = 0;
        DNumber dNumber1 = new DNumber();
        c += assertEquals("00000000", dNumber1.toString(), "test1CConstructorAndToString - default constructor");

        DNumber dNumber2 = new DNumber(0);
        c += assertEquals("00000000", dNumber2.toString(), "test1CConstructorAndToString - constructor 0");

        DNumber dNumber3 = new DNumber(1);
        c += assertEquals("00000001", dNumber3.toString(), "test1CConstructorAndToString - constructor 1");

        return c;
    }

    /**
     * Tests larger ints
     *
     * @return number of tests passed
     */
    public static int test2CConstructorAndToString() {
        int c = 0;
        DNumber dNumber1 = new DNumber(2);
        c += assertEquals("00000010", dNumber1.toString(), "test2CConstructorAndToString - constructor 2");

        DNumber dNumber2 = new DNumber(5);
        c += assertEquals("00000101", dNumber2.toString(), "test2CConstructorAndToString - constructor 5");

        DNumber dNumber3 = new DNumber(255);
        c += assertEquals("11111111", dNumber3.toString(), "test2CConstructorAndToString - constructor 255");

        DNumber dNumber4 = new DNumber(40);
        c += assertEquals("00101000", dNumber4.toString(), "test2CConstructorAndToString - constructor 40");

        DNumber dNumber5 = new DNumber(65);
        c += assertEquals("01000001", dNumber5.toString(), "test2CConstructorAndToString - constructor 65");

        return c;

    }

}
