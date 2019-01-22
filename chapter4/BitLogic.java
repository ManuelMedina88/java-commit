package chapter4;

public class BitLogic {
	public static void main(String args[]) {
		String binary[] = {
			"0000", "0001", "0010", "0011", "0100","0101", "0110", "0111", 
			"1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
		};
		
		int a = 3; // 0 + 2 + 1 or 0011 in binary
		int b = 6; // 4 + 2 + 0 or 0110 in binary
		int c = a | b;
		int d = a & b;
		int e = a ^ b;
		int f = (~a & b) | (a & ~b);
		int g = ~a & 0x0f;
		
		System.out.printf("%20s = %s\n", "a", binary[a]);
		System.out.printf("%20s = %s\n", "b", binary[b]);
		System.out.printf("%20s = %s\n", "a|b", binary[c]);
		System.out.printf("%20s = %s\n", "a&b", binary[d]);
		System.out.printf("%20s = %s\n", "a^b", binary[e]);
		System.out.printf("%20s = %s\n", "~a&b|a&~b", binary[f]);
		System.out.printf("%20s = %s\n", "~a", binary[g]);
		
	}
}
