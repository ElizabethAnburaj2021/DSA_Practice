package Week2_Day3;

import java.util.Arrays;

import org.junit.Test;

public class LeetCode_942_DI_String_Match {
	@Test
	public void example() {
		String s="IDID";//[0,4,1,3,2]
		stringDIMatch(s);
	}
	@Test
	public void example1() {
		String s="IDI";//[0,1,2,3]
		stringDIMatch(s);
	}
	@Test
	public void example2() {
		String s="DDI";//[3,2,0,1]
		stringDIMatch(s);
	}
	private void stringDIMatch(String s) {
		int temp[]=new int[s.length()+1];
		int start=0;
		int end=s.length();
		for(int i=0;i<temp.length-1;i++) {
			if(s.charAt(i)=='I') {
				temp[i]=start++;
			}
			else if(s.charAt(i)=='D') {
				temp[i]=end--;
			}
		}System.out.println(Arrays.toString(temp));
	}
	

}
