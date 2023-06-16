package com.mycompany.project3sbk;

/**
 * The test class BitTestC - Tests C-Level on Bit
 *
 * @author Liz Johnson
 * @version 3/15/23
 */
public class BitTestC {

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
     * Does all tests for C-level for Bit
     */
    public static void doBitTestsC() {
        int numTests = 14;
        int testsPassed = 0;
        testsPassed += test1CAdd();
        testsPassed += test2CAdd();
        testsPassed += test3CAdd();
        testsPassed += test4CAdd();
        testsPassed += test5CAdd();
        if (numTests == testsPassed) {
            System.out.println("Congrats! All tests were passed for Bit, Level C");
        } else {
            System.out.println("Passed " + testsPassed + " out of " + numTests + " tests in Bit, Level C");
        }

    }

    /**
     * tests adding 0 and 0
     *
     * @return number of tests passed
     */

    public static int test1CAdd() {
        Bit Bit1 = new Bit(0);
        Bit Bit2 = new Bit(0);
        Bit carry = Bit1.add(Bit2);
        int c = 0;
        c += assertEquals("0", Bit1.toString(), "test1CAdd, this");
        c += assertEquals("0", Bit2.toString(), "test1CAdd, argument");
        c += assertEquals("0", carry.toString(), "test1CAdd, carry");
        return c;
    }

    /**
     * tests adding 0 and 1
     *
     * @return number of tests passed
     */
    public static int test2CAdd() {
        Bit Bit1 = new Bit(0);
        Bit Bit2 = new Bit(1);
        Bit carry = Bit1.add(Bit2);
        int c = 0;
        c += assertEquals("1", Bit1.toString(), "test2CAdd, this");
        c += assertEquals("1", Bit2.toString(), "test2CAdd, argument");
        c += assertEquals("0", carry.toString(), "test2CAdd, carry");
        return c;
    }

    /**
     * tests adding 1 and 0
     *
     * @return number of tests passed
     */
    public static int test3CAdd() {
        Bit Bit1 = new Bit(1);
        Bit Bit2 = new Bit(0);
        Bit carry = Bit1.add(Bit2);

        int c = 0;
        c += assertEquals("1", Bit1.toString(), "test3CAdd, this");
        c += assertEquals("0", Bit2.toString(), "test3CAdd, argument");
        c += assertEquals("0", carry.toString(), "test3CAdd, carry");
        return c;
    }

    /**
     * tests adding 1 and 1
     *
     * @return number of tests passed
     */
    public static int test4CAdd() {
        Bit Bit1 = new Bit(1);
        Bit Bit2 = new Bit(1);
        Bit carry = Bit1.add(Bit2);

        int c = 0;
        c += assertEquals("0", Bit1.toString(), "test4CAdd, this");
        c += assertEquals("1", Bit2.toString(), "test4CAdd, argument");
        c += assertEquals("1", carry.toString(), "test4CAdd, carry");
        return c;
    }

    /**
     * tests adding a bit to itself
     *
     * @return number of tests passed
     */

    public static int test5CAdd() {
        Bit Bit1 = new Bit(1);
        Bit carry = Bit1.add(Bit1);
        int c = 0;
        c += assertEquals("0", Bit1.toString(), "test5CAdd, this");
        c += assertEquals("1", carry.toString(), "test5CAdd, carry");
        return c;
    }
}
