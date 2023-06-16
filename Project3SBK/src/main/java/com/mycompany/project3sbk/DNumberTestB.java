package com.mycompany.project3sbk;

/**
 * The test class DNumberTestB. Tests DNumber at level B.
 *
 * @author Liz Johnson
 * @version 4/8/22
 */
public class DNumberTestB {

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
     * Tests to see if s1 and s2 are equal
     *
     * @param s1 boolean 1
     * @param s2 boolean 2
     * @param method name/description of test
     * @return 1 if passes test, 0 if not
     */
    private static int assertEquals(boolean s1, boolean s2, String method) {
        if (s1 == s2) {
            return 1;
        } else {
            System.out.println("Failed " + method + " Expected ["
                    + s1 + "] Saw [" + s2 + "]");
            return 0;
        }
    }

    /**
     * Does all tests for B-level for DNumber
     */
    public static void doDNumberTestsB() {
        int numTests = 30;
        int testsPassed = 0;
        testsPassed += test1BAdd();
        testsPassed += test2BAdd();
        testsPassed += test3BToDecimal();

        if (numTests == testsPassed) {
            System.out.println("Congrats! All tests were passed for DNumber, Level B");
        } else {
            System.out.println("Passed " + testsPassed + " out of " + numTests + " tests in DNumber, Level B");
        }

    }

    /**
     * Tests adding 2 one digit numbers
     *
     * @return number of tests passed
     */
    public static int test1BAdd() {
        int c = 0;
        DNumber dNumber1 = new DNumber(0);
        DNumber dNumber2 = new DNumber(0);
        dNumber1.add(dNumber2);
        c += assertEquals("00000000", dNumber1.toString(), "test1BAdd 0+0 this");
        c += assertEquals("00000000", dNumber2.toString(), "test1BAdd 0+0 arg");

        DNumber dNumber3 = new DNumber(0);
        DNumber dNumber4 = new DNumber(1);
        dNumber3.add(dNumber4);
        c += assertEquals("00000001", dNumber3.toString(), "test1BAdd 0+1 this");
        c += assertEquals("00000001", dNumber4.toString(), "test1BAdd 0+1 arg");

        DNumber dNumber5 = new DNumber(1);
        DNumber dNumber6 = new DNumber(0);
        dNumber5.add(dNumber6);
        c += assertEquals("00000001", dNumber5.toString(), "test1BAdd 1+0 this");
        c += assertEquals("00000000", dNumber6.toString(), "test1BAdd 1+0 arg");

        DNumber dNumber7 = new DNumber(1);
        DNumber dNumber8 = new DNumber(1);
        dNumber7.add(dNumber8);
        c += assertEquals("00000010", dNumber7.toString(), "test1BAdd 1+1 this");
        c += assertEquals("00000001", dNumber8.toString(), "test1BAdd 1+1 arg");
        return c;
    }

    /**
     * Tests adding larger numbers
     *
     * @return number of tests passed
     */
    public static int test2BAdd() {
        int c = 0;
        DNumber dNumber1 = new DNumber(127);
        DNumber dNumber2 = new DNumber(128);
        dNumber1.add(dNumber2);
        c += assertEquals("11111111", dNumber1.toString(), "test2BAdd 127+128 this");
        c += assertEquals("10000000", dNumber2.toString(), "test2BAdd 127+128 arg");

        DNumber dNumber3 = new DNumber(128);
        DNumber dNumber4 = new DNumber(127);
        dNumber3.add(dNumber4);
        c += assertEquals("11111111", dNumber3.toString(), "test2BAdd 128+127 this");
        c += assertEquals("01111111", dNumber4.toString(), "test2BAdd 128+127 arg");

        DNumber dNumber5 = new DNumber(15);
        DNumber dNumber6 = new DNumber(15);
        dNumber5.add(dNumber6);
        c += assertEquals("00011110", dNumber5.toString(), "test2BAdd 15+15 this");
        c += assertEquals("00001111", dNumber6.toString(), "test2BAdd 15+15 arg");

        DNumber dNumber7 = new DNumber(111);
        DNumber dNumber8 = new DNumber(110);
        dNumber7.add(dNumber8);
        c += assertEquals("11011101", dNumber7.toString(), "test2BAdd 111+110 this");
        c += assertEquals("01101110", dNumber8.toString(), "test2BAdd 111+110 arg");

        DNumber dNumber9 = new DNumber(120);
        DNumber dNumber10 = new DNumber(110);
        dNumber9.add(dNumber10);
        c += assertEquals("11100110", dNumber9.toString(), "test2BAdd 120+110 this");
        c += assertEquals("01101110", dNumber10.toString(), "test2BAdd 120+110 arg");

        DNumber dNumber11 = new DNumber(90);
        DNumber dNumber12 = new DNumber(90);
        dNumber11.add(dNumber12);
        c += assertEquals("10110100", dNumber11.toString(), "test2BAdd 90+90 this");
        c += assertEquals("01011010", dNumber12.toString(), "test2BAdd 90+90 arg");

        DNumber dNumber13 = new DNumber(90);
        dNumber13.add(dNumber13);
        c += assertEquals("10110100", dNumber13.toString(), "test2BAdd 90+90 this");
        
        
        DNumber dNumber14 = new DNumber(128);
        DNumber dNumber15 = new DNumber(128);
        dNumber14.add(dNumber15);
        c += assertEquals("00000000", dNumber14.toString(), "test2BAdd 128+128 this");
        c += assertEquals("10000000", dNumber15.toString(), "test2BAdd 128+128 arg");

        return c;
    }

    /**
     * Tests of toDecimal
     *
     * @return number of tests passed
     */
    public static int test3BToDecimal() {
        int c = 0;
        DNumber dNumber1 = new DNumber(127);
        c += assertEquals(127, dNumber1.toDecimal(), "test3BToDecimal 127");

        DNumber dNumber2 = new DNumber(255);
        c += assertEquals(255, dNumber2.toDecimal(), "test3BToDecimal 255");

        DNumber dNumber3 = new DNumber(20);
        c += assertEquals(20, dNumber3.toDecimal(), "test3BToDecimal 20");

        DNumber dNumber4 = new DNumber(0);
        c += assertEquals(0, dNumber4.toDecimal(), "test3BToDecimal 0");

        DNumber dNumber5 = new DNumber(1);
        c += assertEquals(1, dNumber5.toDecimal(), "test3BToDecimal 1");

        DNumber dNumber6 = new DNumber(2);
        c += assertEquals(2, dNumber6.toDecimal(), "test3BToDecimal 2");

        DNumber dNumber7 = new DNumber(3);
        c += assertEquals(3, dNumber7.toDecimal(), "test3BToDecimal 3");
        return c;
    }
}
