/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.project3sbk;

/**
 *
 * @author theonesammy
 */
public class Project3SBK {

    public static void main(String[] args) {
        // Bit b1 = new Bit(1);
        // Bit b2 = new Bit(0);
        //b2.setValue(1);
        // Bit carry = b1.add(b2);
        //System.out.println("Result is" + carry + b1);
// this would print 10
        System.out.println("******* D-Level ***********");
        BitTestD.doBitTestsD();
        System.out.println("******* C-Level ***********");
        System.out.println("******* B-Level ***********");
        BitTestC.doBitTestsC();
        DNumberTestC.doDNumberTestsC();
        BitTestB.doBitTestsB();
        DNumberTestB.doDNumberTestsB();
    }
}
