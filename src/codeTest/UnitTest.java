package codeTest;

public class UnitTest {
//	public int square(int n) {
//		return n*n;
//	}
	public int WordCount(String name) {
		int count  = 0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a' || name.charAt(i)=='A') {
				count++;
			}
		}
		return count;
	}
}
