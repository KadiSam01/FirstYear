package com.mycompany.project3sbk;

/**
 * The test class BitTestB - Tests B-Level on Bit
 *
 * @author Liz Johnson
 * @version 4/8/22
 */
public class BitTestB {

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
     * Does all tests for B-level for Bit
     */
    public static void doBitTestsB() {
        int numTests = 34;
        int testsPassed = 0;
        testsPassed += test1BAdd();
        testsPassed += test2BAdd();
        testsPassed += test3BAdd();
        testsPassed += test4BAdd();
        testsPassed += test5BAdd();
        testsPassed += test6BAdd();
        testsPassed += test7BAdd();
        
        testsPassed += test8BAdd();
        testsPassed += test9BAdd();
        if (numTests == testsPassed) {
            System.out.println("Congrats! All tests were passed for Bit, Level B");
        } else {
            System.out.println("Passed " + testsPassed + " out of " + numTests + " tests in Bit, Level B");
        }
    }

    /**
     * tests adding 0 and 0 and 0
     *
     * @return number of tests passed
     *
     */
    public static int test1BAdd() {
        Bit Bit1 = new Bit(0);
        Bit Bit2 = new Bit(0);
        Bit Bit3 = new Bit(0);
        Bit carry = Bit1.add(Bit2, Bit3);
        int c = 0;
        c += assertEquals("0", Bit1.toString(), "test1BAdd, this");
        c += assertEquals("0", Bit2.toString(), "test1BAdd, argument 1");
        c += assertEquals("0", Bit3.toString(), "test1BAdd, argument 2");
        c += assertEquals("0", carry.toString(), "test1BAdd, carry");
        return c;
    }

    /**
     * tests adding 0 and 0 and 1
     *
     * @return number of tests passed
     */
    public static int test2BAdd() {
        Bit Bit1 = new Bit(0);
        Bit Bit2 = new Bit(0);
        Bit Bit3 = new Bit(1);
        Bit carry = Bit1.add(Bit2, Bit3);
        int c = 0;
        c += assertEquals("1", Bit1.toString(), "test2BAdd, this");
        c += assertEquals("0", Bit2.toString(), "test2BAdd, argument 1");
        c += assertEquals("1", Bit3.toString(), "test2BAdd, argument 2");
        c += assertEquals("0", carry.toString(), "test2BAdd, carry");
        return c;
    }

    /**
     * tests adding 0 and 1 and 0
     *
     * @return number of tests passed
     */
    public static int test3BAdd() {
        Bit Bit1 = new Bit(0);
        Bit Bit2 = new Bit(1);
        Bit Bit3 = new Bit(0);
        Bit carry = Bit1.add(Bit2, Bit3);
        int c = 0;
        c += assertEquals("1", Bit1.toString(), "test3BAdd, this");
        c += assertEquals("1", Bit2.toString(), "test3BAdd, argument 1");
        c += assertEquals("0", Bit3.toString(), "test3BAdd, argument 2");
        c += assertEquals("0", carry.toString(), "test3BAdd, carry");
        return c;
    }

    /**
     * tests adding 0 and 1 and 1
     *
     * @return number of tests passed
     */
    public static int test4BAdd() {
        Bit Bit1 = new Bit(0);
        Bit Bit2 = new Bit(1);
        Bit Bit3 = new Bit(1);
        Bit carry = Bit1.add(Bit2, Bit3);

        int c = 0;
        c += assertEquals("0", Bit1.toString(), "test4BAdd, this");
        c += assertEquals("1", Bit2.toString(), "test4BAdd, argument 1");
        c += assertEquals("1", Bit3.toString(), "test4BAdd, argument 2");
        c += assertEquals("1", carry.toString(), "test4BAdd, carry");
        return c;
    }

    /**
     * tests adding 1 and 0 and 0
     *
     * @return number of tests passed
     */
    public static int test5BAdd() {
        Bit Bit1 = new Bit(1);
        Bit Bit2 = new Bit(0);
        Bit Bit3 = new Bit(0);
        Bit carry = Bit1.add(Bit2, Bit3);

        int c = 0;
        c += assertEquals("1", Bit1.toString(), "test5BAdd, this");
        c += assertEquals("0", Bit2.toString(), "test5BAdd, argument 1");
        c += assertEquals("0", Bit3.toString(), "test5BAdd, argument 2");
        c += assertEquals("0", carry.toString(), "test5BAdd, carry");
        return c;
    }

    /**
     * tests adding 1 and 1 and 1
     *
     * @return number of tests passed
     */
    public static int test6BAdd() {
        Bit Bit1 = new Bit(1);
        Bit Bit2 = new Bit(1);
        Bit Bit3 = new Bit(1);
        Bit carry = Bit1.add(Bit2, Bit3);

        int c = 0;
        c += assertEquals("1", Bit1.toString(), "test6BAdd, this");
        c += assertEquals("1", Bit2.toString(), "test6BAdd, argument 1");
        c += assertEquals("1", Bit3.toString(), "test6BAdd, argument 2");
        c += assertEquals("1", carry.toString(), "test6BAdd, carry");
        return c;
    }

    /**
     * tests adding 1 and 1 and 0
     *
     * @return number of tests passed
     */
    public static int test7BAdd() {
        Bit Bit1 = new Bit(1);
        Bit Bit2 = new Bit(1);
        Bit Bit3 = new Bit(0);
        Bit carry = Bit1.add(Bit2, Bit3);

        int c = 0;
        c += assertEquals("0", Bit1.toString(), "test7BAdd, this");
        c += assertEquals("1", Bit2.toString(), "test7BAdd, argument 1");
        c += assertEquals("0", Bit3.toString(), "test7BAdd, argument 2");
        c += assertEquals("1", carry.toString(), "test7BAdd, carry");
        return c;
    }

    /**
     * tests adding a bit to itself
     *
     * @return number of tests passed
     */
    public static int test8BAdd() {
        Bit Bit1 = new Bit(1);
        Bit carry = Bit1.add(Bit1, Bit1);
        int c = 0;
        c += assertEquals("1", Bit1.toString(), "test8BAdd, this");
        c += assertEquals("1", carry.toString(), "test8BAdd, carry");
        return c;

    }
    /**
     * tests adding 1 and 0 and 1
     *
     * @return number of tests passed
     */
    public static int test9BAdd() {
        Bit Bit1 = new Bit(1);
        Bit Bit2 = new Bit(0);
        Bit Bit3 = new Bit(1);
        Bit carry = Bit1.add(Bit2, Bit3);

        int c = 0;
        c += assertEquals("0", Bit1.toString(), "test9BAdd, this");
        c += assertEquals("0", Bit2.toString(), "test9BAdd, argument 1");
        c += assertEquals("1", Bit3.toString(), "test9BAdd, argument 2");
        c += assertEquals("1", carry.toString(), "test9BAdd, carry");
        return c;
    }

}
