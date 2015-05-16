package com.techinterviews.arrays.solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

// Problem 1.1 : Without additional data structure
public class AllCharactersUniqueWithoutAddDs {
    
    public boolean algorithm(String input) {
        if (input.length() == 1 || input.length() ==0){
            return true;
        }
        
        char[] charactersArray = input.toCharArray();
        for(int i = 0; i< charactersArray.length; i++){
            
            for(int j = i+1; j<charactersArray.length; j++) {
                
                if(charactersArray[i] == charactersArray[j]){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        AllCharactersUniqueWithoutAddDs obj = new AllCharactersUniqueWithoutAddDs(); 
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(obj.algorithm(input));
    }
}