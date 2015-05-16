package com.techinterviews.arrays.solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class AllCharactersUnique {
    
    public boolean algorithm(String input) {
        if (input.length() == 1 || input.length() ==0){
            return true;
        }
        HashSet<Character> duplicateChecker = new HashSet<Character>();
        char[] charactersArray = input.toCharArray();
        for(char letter : charactersArray) {
            if(duplicateChecker.contains(letter) == true) {
                return false;
            }
            else {
                duplicateChecker.add(letter);
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        AllCharactersUnique obj = new AllCharactersUnique(); 
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(obj.algorithm(input));
    }
}