package com.techinterviews.arrays.solution;

import java.util.HashMap;
import java.util.Scanner;

public class StringsPermutations {
    
    public boolean AreStringsPermutations(String first, String second) {
        
        HashMap<Character, Integer> characterCounts = new HashMap<Character, Integer>();
        char[] firstStringChars = first.toCharArray();
        
        for( char letter : firstStringChars) {
            if(characterCounts.containsKey(letter)==true) {
                int newCharCount = (int)characterCounts.get(letter);
                characterCounts.put(letter, ++newCharCount);
            }
            else {
                characterCounts.put(letter, 1);
            }
        }
        //Checking the second string's character counts
        char[] secondStringChars = second.toCharArray();
        
        for(char letter : secondStringChars) {
            if(characterCounts.containsKey(letter) == false){
                return false;
            }
            else {
                int charCount = (int)characterCounts.get(letter);
                if(charCount == 1){
                    characterCounts.remove(letter);
                }
                else if (charCount > 1){
                    characterCounts.put(letter, charCount-1);
                }
            }
        }
        
        if (characterCounts.isEmpty() == true){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        StringsPermutations obj = new StringsPermutations();
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String second = scan.nextLine();
        System.out.println(obj.AreStringsPermutations(first, second));
    }
    
    
}