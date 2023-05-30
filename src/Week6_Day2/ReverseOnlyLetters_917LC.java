package Week6_Day2;

import org.junit.Test;

public class ReverseOnlyLetters_917LC {
	/*
	 * program: Given a string s, reverse the string according to the following rules:
All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.

Example 1:
Input: s = "ab-cd"
Output: "dc-ba"

pseudo code:
1. Create a method to check the string of char contains the letter or not.
2. Find the left and right pointer index
	a)  finding mid and left as mid-1, if odd right will be mid+1 or right = mid
3.  loop left till greater than or equal to zero
4. If the char is of left and right is equal to letter then do swap and increment right and decrement of left
	else increment only right when the left alone contains char & decrement left when only right contains char then return false
5. end of the loop return true
	 */
	
	@Test
	public void example() {
		String s="ab-cd";
		//output: dc-ba
		reverseOnlyLetters(s);
	}
	@Test
	public void example1() {
		String s="1apple*2balls";
		//output: 1sllab*2elppa
		reverseOnlyLetters(s);
	}
	@Test
	public void example2() {
		String s="***hi***hello**";
		//output: **olleh***ih***
		reverseOnlyLetters(s);
	}
	private String reverseOnlyLetters(String s) {
		int right=s.length()/2, left = right-1;
		
		if (s.length()%2==1) {
			right++;
			while(left>0) {
				char leftSideLetter = s.charAt(left);
				char rightSideLetter = s.charAt(right);
				
				if(validateIfLetter(leftSideLetter) && validateIfLetter(rightSideLetter)) {
					//do swap
					char temp=leftSideLetter;
					leftSideLetter=rightSideLetter;
					rightSideLetter=temp;
					left--;
					right++;
				}else {
					if(!validateIfLetter(leftSideLetter))
					left--;
				} right++;
			}
		}
		return s;
	}
	
	private boolean validateIfLetter(char ch) {
		if (ch=='a'||ch=='b'||ch=='c'||ch=='d'||ch=='e'||ch=='f'||ch=='G'||ch=='h'||ch=='i'||ch=='j'||ch=='k'||ch=='l'||ch=='m'||ch=='n'||ch=='o'||ch=='p'||ch=='q'||ch=='r'||ch=='s'||ch=='t'||ch=='u'||ch=='v'||ch=='w'||ch=='x'||ch=='y'||ch=='z'||
			ch=='A'||ch=='B'||ch=='C'||ch=='D'||ch=='E'||ch=='F'||ch=='G'||ch=='H'||ch=='I'||ch=='J'||ch=='K'||ch=='L'||ch=='M'||ch=='N'||ch=='O'||ch=='P'||ch=='Q'||ch=='R'||ch=='S'||ch=='T'||ch=='U'||ch=='V'||ch=='W'||ch=='X'||ch=='Y'||ch=='Z') {
			return true;
		}
		return false;	
	}
}
