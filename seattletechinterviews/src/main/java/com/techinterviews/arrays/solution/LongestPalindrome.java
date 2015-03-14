package com.techinterviews.arrays.solution;

public class LongestPalindrome {
	
	public static void main(String args[]) {
	}

	
	public static int findLongestByExpandingInTheMiddle(String longPalindrome) {
		char[] palindrome = longPalindrome.toCharArray();
		int maxLen = -1;
		int beginIndex = -1;
		for (int i = 0; i < longPalindrome.length() ; i++) {
			int l =expand(palindrome,i,i+1);
			int l1=expand(palindrome,i,i);
			int max = l>l1 ? l:l1;
			if (max>maxLen){
				maxLen= max;
				beginIndex = i;
			}
		}
		return maxLen;
	}
	
	public static int expand(char[] palindrome,int i,int j){
		int l = 0;
		while(i>= 0 && j<palindrome.length && palindrome[i]==palindrome[j] ){

			if (i==j){
				l++;
				i--;j++;
				continue;
			}
			i--;j++;
			l=l+2;
		}
		return l;
	}


}
