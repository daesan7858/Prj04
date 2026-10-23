package ex01;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		int [] sales = new int[] {
				100, 80, 90, 110
		};
		
		int tot = 0;
		/*
		tot 	+= sales[0];     // tot = tot + sales[0];
		tot 	+= sales[1];
		tot 	+= sales[2];
		tot 	+= sales[3];
		*/
		for (int i = 0; i < sales.length; i++) {
			tot += sales[i];
		}
		System.out.println(tot);
		
		//----------------------------------
		// 2차원배열 연습합니다.
		double [][] salesTot = new double[][] {
			//1/4  2/4  3/4 	4/4
			{ 100, 101, 90, 	80 	} 	// 2022 : salesTot[0]
		,	{ 120, 101, 90, 	180 } 	// 2023 : salesTot[1]
		,	{ 100, 130, 190, 	280 } 	// 2024 : salesTot[2]
		,	{ 100, 103, 290, 	80 	} 	// 2025 : salesTot[3]
		,	{ 100, 101, 390, 	180 } 	// 2026 : salesTot[4]
		};
		
		System.out.println("연도의 갯수" + salesTot.length);
		System.out.println("2024년의 매출갯수" + salesTot[2].length);
		System.out.println(salesTot[3][1]);
		
		// 2024년 매출수량의 합?
		tot = 0;
		// tot += salesTot[2][0]
		// tot += salesTot[2][1]
		// tot += salesTot[2][2]
		// tot += salesTot[2][3]
		// tot += salesTot[2][4]
		for (int j = 0; j < salesTot[2].length; j++) {
			tot += salesTot[2][j];
		}
		System.out.println(tot);
		
	}

}
