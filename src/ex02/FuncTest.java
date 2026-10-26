package ex02;

import java.util.Scanner;

/*
 입력
 번호 이름 국어 영어 수학
 num, name,kor, eng, mat
 1,안유진,90,80,70
 2,카리나,100,90,90
 3,장원영,100,100,100
 4,닝닝,79,80,0
 출력
 번호 이름 총점 평균
 num, name,tot, avg
 */
public class FuncTest {
	// Field 전역변수
	//입력
	private static int num;
	private static String name;
	private static int kor;
	private static int eng;
	private static int mat;
	
	//출력
	private static int tot;
	private static double avg;
	
	
	// method
	//main
	public static void main(String[] args) {
		input();
		process();
		output();
		System.out.println("");
		System.out.println("end.....");

	}
	
	//input
	private static void input() {
		//키보드 준비
		Scanner in = new Scanner(System.in);
		System.out.println("번호,이름,국어,영어,수학");
		// line "1,안유진,90,80,70"
		// li	 0   1        2    3    4
		// 		"1","안유진","90","80","70"
		String 		line = in.nextLine();
		String  [] 	li 	 = line.split(","); // 문자열 -> 문자열 배열
		num 			 = Integer.parseInt(li[0].trim());  //String으로 입력된 걸 int로 바꾸는 함수
		name 			 = li[1];
		kor 			 = Integer.parseInt(li[2].trim());  // "100"을 100으로 바꿔준다는 뜻
		eng 			 = Integer.parseInt(li[3].trim());  // .trim() 은 공백을 제거해주는 함수
		mat 			 = Integer.parseInt(li[4].trim());
		
				
				
	}
	
	//process
	private static void process() {
		// 총점
		tot = kor + eng + mat;
		// 평균
		// avg = (double) tot / 3.0;
		// 반올림된 평균
		avg = (int) (tot * 100 + 0.5) / 100.0;
		
		// 형변환 casting
		// 숫자 -> 문자로 변환
		// String.valueOf(35.6) -> "35.6"
		// 35.6 + ""            -> "35.6"
		
	}
	
	//output
	private static void output() {
		//평균은 소수이하 세자리로 출력(세자리 이후는 반올림)
		System.out.println("번호 이름 총점 평균");
		System.out.printf("%d %s %d %10.3f",
				num, name, tot, avg);  
		
	}

}
