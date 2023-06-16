/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project3sbk;

/**
 *
 * @author theonesammy
 * 
 */
public class Bit {
    /**
     * val stands for value which is the instance variable
     */
    private int val;
    
    /**
     * @param val
     * the constructor initializes val
     * condition must be met to consider valid
     * val must be either 0 or 1
     * anything not 0 or 1 is assigned the value of 0
     */
    public Bit(int val) {
        if (val == 0 || val == 1) {
            this.val = val;
        } else {
            this.val = 0;
        }
    }

    /*Bit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/

    /**
     * returns the value of 0 or 1
     * @return val
     */
    public int getValue() {
        return val;
    }
    
    /**
     * @param val - allows us to set the value of val
     * Checks for condition to make sure it meets the requirements
     */
    public void setValue(int val) {
        if(val == 0 || val == 1){
            this.val =  val;
        }else{
            //in case the value is not 0 or 1, the bit keeps it old value
            this.val= this.val;
        }
    }

    /**
     * return the value as a string
     * @return this.val
     */
    public String toString() {
        //String bits = " " + this.val;
        //return bits;
        
        return "" + this.val;
    }
    
    /**
     * 
     * @param b
     * conditional statement are used to check for the prospect of each conditions that might be encountered
     * adds  b to the current instance variable(doing addition with two values)
     * @return a new Bit carry
     */
    
    public Bit add(Bit b){
        int carry = 0;
        if (b.getValue() + val == 2) {
            carry = 1;
            val = 0;
        } else if (b.getValue() + val == 1) {
            carry = 0;
            val = 1;
        } else {
            if (b.getValue() + val == 0) {
                carry = 0;
                val = 0;
            }
        }
        return new Bit(carry);
    }
    
    /**
     * conditional statement are used to check for the prospect of each conditions that might be encountered
     * adds b and c to the current instance variable(doing addition with three values)
     * @param b
     * @param c
     * @return a new Bit carry
     */
    public Bit add(Bit b, Bit c){
        int carry = 0;
        if(b.getValue()+c.getValue()+this.val==3){
            carry = 1;
            this.setValue(1);
        }
        else if(b.getValue()+c.getValue()+this.val==2){
           carry = 1;
           this.setValue(0);
        }else if(b.getValue()+c.getValue()+this.val==1){
            carry = 0;
            this.setValue(1);
        } else{
            if(b.getValue()+c.getValue()+this.val==0){
                carry = 0;
                this.setValue(0);
            }
        }
        return new Bit(carry);
    }
}
