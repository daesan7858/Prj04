package ex01;

public class ArrayTest01 {
	// Array : 여러변수를 하나의 이름으로 통일해서 사용
	public static void main(String[] args) {
		// 이서 · 가을 · 안유진 · 장원영 · 리즈 · 레이
		String name1 = "이서";
		String name2 = "가을";
		System.out.println(name1);
		System.out.println(name2);
		System.out.println("안유진");
		System.out.println("장원영");
		System.out.println("리즈");
		System.out.println("레이");
		System.out.println();
		
		String[] ives = new String[] {
			//     0	  1		   2		  3	      4		  5
				"이서", "가을", "안유진", "장원영", "리즈", "레이"
		};
		
		// String[] ives = new String[6]
		// name[0] = "이서", name[1] ~~~~~ name[5] = "레이"
		// {} 없이 사용되는 위와 동일한 함수
		System.out.println( ives[0] );
		System.out.println( ives[1] );
		System.out.println( ives[2] );
		System.out.println( ives[3] );
		System.out.println( ives[4] );
		System.out.println( ives[5] );
		System.out.println();
		
		
		for (int i = 0; i < ives.length; i++) {
			System.out.println( ives[i]);
		}
		// System.out.println( ives[6]);   >> Exception 에러
	}

}
