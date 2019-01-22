package chapter4;

// Left shifting as a quick way to multiply by 2.
public class MultByTwo {
	public static void main(String args[]) {
		int i;
		int num = 0xFFFFFFE;
		System.out.printf("%,15d\n", num);
		
		for(i = 0; i<4; i++) {
			num = num << 1;
			System.out.printf("%,15d\n", num);
		}
	}
}


