/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project3sbk;

import java.util.ArrayList;

/**
 *
 * @author theonesammy
 */
public class DNumber {
    /**
     * @param 
     */
    //the size of the arraylist
    private static final int SIZE = 8;
    //private Bit[] bits;
    private ArrayList<Bit> bits;
    //this refers to the instance variable

    
    /**
     * creates a binary number with all bits initialized to 0
     */
    public DNumber() {
        //this.bits = new Bit[SIZE];
        this.bits = new ArrayList<>();
        /*for (int i = 0; i < SIZE; i++) {
            this.bits[i] = new Bit(0);
        }*/
        for (int i = 0; i < SIZE; i++) {
            this.bits.add(new Bit(0));
            /*this.bits.add(new Bit(0));
            this.bits.add(new Bit(0));
            this.bits.add(new Bit(0));
            this.bits.add(new Bit(0));
            this.bits.add(new Bit(0));
            this.bits.add(new Bit(0));
            this.bits.add(new Bit(0));*/
        }
    }
    
    
    /**
     * creates a binary number with its respective binary
     * 
     * @param value converts from decimal to binary
     */
    
    public DNumber(int value){
        this.bits = new ArrayList<>();
        for(int i = SIZE-1; i>=0; i--){
            //makes sure that the elements are in the respective position
            this.bits.add(0, new Bit(value%2));
            value/=2;
        }
    }   

 

    /**
     * returns the string of the binary
     * @return binary
     */
    public String toString() {
        String binary = "";
        for (int i = 0; i < SIZE; i++) {
            // binary += bits[i];
            binary += bits.get(i);
        }
        return binary;
    }
    
    /**
     * starts from the right side to the left side
     * @param b the binary number is added to the current binary(instance variable)
     */

    public void add(DNumber b) {
        Bit carry = new Bit(0);
        int i = SIZE - 1;
        while (i >= 0) {
            //carry =this.bits[i].add(b.bits[i], carry);
            carry = this.bits.get(i).add(b.bits.get(i), carry);
            i--;
        }
        if (carry.getValue() == 1) {
            System.out.println("Error: overflow");
        }

    }
    
    /**
     * convert from binary to decimal
     * starts from the right side to the left side
     * Math.pow is used to allow us to deal with power
     * @return result
     */

    public int toDecimal() {
        int result = 0;
        int position = 0;
        int i = SIZE - 1;
        //int power = 0;
        while (i >= 0) {
            //result += this.bits[position].getValue() * (int) (Math.pow(2, i));
            result += this.bits.get(position).getValue() * (int) (Math.pow(2, i));
            position++;
            i--;
        }
        return result;
    }
}
