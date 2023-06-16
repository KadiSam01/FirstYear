/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project4sbk;

import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Math;

/**
 *
 * @author theonesammy
 */
public class Responder {

    private HashMap<String, String> responseMap;
    private boolean addNameatbeginning;
    private ArrayList<String> defaultResponses;
    private String lastDefaultResponse;

    public Responder() {
        this.responseMap = new HashMap<String, String>();
        this.defaultResponses = new ArrayList<>();
        this.addNameatbeginning = true;
        lastDefaultResponse = "";
        fillResponseMap();
        fillDefaultResponses();
    }

    private void fillResponseMap() {
        responseMap.put("worried", "Don't worry, be happy");
        responseMap.put("sad", "I'm sorry to hear that you're sad");
        responseMap.put("anxious", "Take a deep breath and relax");
        responseMap.put("stressed", "Think about the positive things");
        responseMap.put("overwhelemed", "Take one step at a time");
        responseMap.put("dissapointed", "You are a champion");
        responseMap.put("frustrated", "Take a break and come back strong");
        responseMap.put("angry", "Always smile");
        responseMap.put("tired", "Rest and recharge, you deserve it");
        responseMap.put("unmotivated", "Remember your promise");

        //add 7 more
    }

    private void fillDefaultResponses() {
        defaultResponses.add("Can you tell me more?");
        defaultResponses.add("I'm here for you");
        defaultResponses.add("I support you all the way");
        defaultResponses.add("I understand");
        defaultResponses.add("You are never alone");

    }

  private String chooseDefaultResponse() {
        ArrayList<String> unused = new ArrayList<>(defaultResponses);
        unused.remove(lastDefaultResponse);
        int randomResponse = (int) (Math.random() * unused.size());
        lastDefaultResponse = unused.get(randomResponse);
        return lastDefaultResponse;
        
    }

    public String generateResponse(String input, String name) {
        String response = null;
        String[] words = input.split(" ");
        ArrayList<String> matches = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {

            if (responseMap.containsKey(words[i])) {
                matches.add(responseMap.get(words[i]));
                break;
                ///response = responseMap.get(words[i]);
              
            }
        }
        if (matches.size() > 0) {
            int randomMatch = (int) (Math.random() * matches.size());
            return matches.get(randomMatch);
        }
        else{
            response = chooseDefaultResponse();
        }

        response = possiblyAddName(response, name);
        return response;
    }

    private String possiblyAddName(String response, String name) {
        if (Math.random()<=0.3) {
            if (addNameatbeginning == true) {
                response = name + " " + response;
                addNameatbeginning = true;
            } else {
                response = response + " " + name;
                addNameatbeginning = !addNameatbeginning;
            }
        }
        
       
        return response;
    }
    
    

}
