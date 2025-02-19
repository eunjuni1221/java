package quiz;

import java.util.Arrays;
import java.util.Random;

public class B14_Array2Quiz {
	
	public static void main (String [] args) {
		int [][] myArr = {
				{0 , 0 , 0 , 0 , 0 },
				{0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 },
				{0 , 0 , 0},
				new int[5],
				{0 , 0 , 0 , 0 , 0 , 0 , 0}	
		};
		// 1. myArr의 모든 요소의 값을 100 ~ 200의 랜덤 정수로 바꾸기
		
		// 2. 랜덤으로 바뀐 모든 요소의 총합과 평균(소수점 2자리)을 구하기
		
		// 3. 각 행 (row)의 총합을 구해서 출력하기
		
		// 4. 각 열 (column)의 총합을 구해서 출력하기
		
		Random ran = new Random();
		
		// 1)
		for (int i = 0; i < myArr.length; ++i) {
			//System.out.printf("==========%d번==========\n", i);
			for (int j = 0; j < myArr[i].length; ++j) {
				// myArr[i][j] = (int)(ran.nextInt(100, 201));
				 myArr[i][j] = (int)(Math.random() * 101 + 100);
				//System.out.printf("%d: %d\n", j, myArr[i][j]);
			}
			
		}
		// 잘 들어갔나 출력
		for (int i = 0; i < myArr.length; ++i) {
			System.out.println(Arrays.toString(myArr[i]));
		}
		// 2)
		int sum = 0;
		int count = 0;
		for (int i = 0; i < myArr.length; ++i) {
			count += myArr[i].length;
			for(int j = 0; j < myArr[i].length; ++j) {
				sum += myArr[i][j];
				
			}
		}
		System.out.printf("총합: %d, 평균: %.2f\n", sum , sum / (double) count);
		
		// 3) 4)
		int maxColumnSize = 0;
		
		for (int i = 0; i < myArr.length; ++i) {
			maxColumnSize = Math.max(maxColumnSize, myArr[i].length);
		}
		
		int[] rowSum = new int[myArr.length];
		int[] colSum = new int[maxColumnSize];
		
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				rowSum[i] += myArr[i][j];
				colSum[j] += myArr[i][j];
			}
		}
		System.out.println("행의 합: " + Arrays.toString(rowSum));
		System.out.println("열의 합: " + Arrays.toString(colSum));
	} 

}
