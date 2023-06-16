/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project4sbk;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author theonesammy
 */
public class EBot {
    private Responder resp;
    private Scanner scan;
    private HashMap<String,String> responseMap;
    private ArrayList<String> defaultResponses;
    
    public EBot(){
        this.resp = new Responder();
        this.scan = new Scanner(System.in);
    }
    
    private void printWelcome(){
        System.out.println("Welcome user to EncourageBot");
        System.out.println("Please respond to the following prompt");
        System.out.println("Feel free to type exit at anytime");
    }
    private String getEndingString(){
        return "exit";
    }
    private void printGoodbye(){
        System.out.println("Please come back in the future and remember to stay strong");
    }
    public void start(){
        System.out.print("What is your name?"+ " ");
        String user_name = scan.nextLine();
        printWelcome();
        boolean keepGoing = true;
        while(keepGoing == true){
            //System.out.print(" Hi" + " " + user_name + " " + "Feel free to share " + " " + ">" + " ");
            System.out.println("Feel free to share" + " " + ">" + " ");
            String user_input = scan.nextLine();
            if(user_input.equals(getEndingString())){
                keepGoing = false;
            }else{
                String user_response = resp.generateResponse(user_input,user_name);
                System.out.println(user_response);
                
            }
        }
         printGoodbye();
    }
   
    
}
