/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthdayparadox;

import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author ryan
 */
public class BirthdayParadox {
    
    
    
    public static boolean duplicateNums(ArrayList inputList) {
        for (int i = 0; i < (inputList.size() - 1); i++) {
            for (int j = (i + 1); j < inputList.size(); j++) {
                if (inputList.get(i) == inputList.get(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList birthdays = new ArrayList();
         
        // Check random birthdays for groups of people ranging from 5 to
        // 100, test groups on increments of 5.
        for (int i = 5; i <= 100; i += 5) {
            
            // add all randomly-generated birthdays for the number
            // of people in the room to an arraylist
            for (int j = 0; j < i; j++) {
                birthdays.add(rnd.nextInt(12) + 1);
            }
            boolean duplicateBirthdays = duplicateNums(birthdays);
            System.out.println("Duplicate birthdays when group size is " + i + ": " + duplicateBirthdays);
            birthdays.clear();
          
        }
    }
    
}
