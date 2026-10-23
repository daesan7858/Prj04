package ex01;

public class ArrayTest04 {

	public static void main(String[] args) {
		String [] bts = /* new String[] << 생략이 가능하다*/ {
			"RM", "제이홉", "정국", "지민", "진", "슈가", "뷔"
		};
		
		hellobts( bts );
	}

	private static void hellobts(String[] bts) {
		
		for (int i = 0; i < bts.length; i++) {
			System.out.println( bts[i] );
		}
		
	}

}
