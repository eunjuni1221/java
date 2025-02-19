package quiz;

import java.util.Arrays;

public class C01_Range {
	/*
	 *  1. 정수값을 전달받으면 0부터 해당 값 미만의 int[]을 생성하여 반환하는 range 함수를 만들어보세요
	 *     ex) range(8)의 결과 -> [0, 1, 2, 3, 4, 5, 6, 7]
	 *     
	 *  2. 정수값을 두 개 전달받으면 왼쪽 값부터 오른쪽 값으로 1씩 증가하거나 감소하는 int[]을 생성하여 반환하는 range 함수를 만들어보세요
	 *     ex) range(10, 15)의 결과 -> [10, 11, 12, 13, 14]
	 *     	   range(15, 10)의 결과 -> [15, 14, 13, 12, 11]
	 *     
	 *  3. 정수값을 세 개 전달받으면 첫 번째 값부터 두 번째 값으로 세 번째 값만큼 증가하거나 감소하는 int[]을 생성하여 반환하는 range 함수를 만들어보세요
	 *  
	 *     ex) range (10, 20, 2)의 결과 -> [10, 12, 14, 16, 18]
	 *         range (40, 30, -3)의 결과 -> [40, 37, 34, 31]
	 *         range (20, 10, 3)의 결과 -> []
	 */
	
	// 1)
	public static int[] range(int num) {
		if(num < 0) {
			return new int[] {};
		}
		
		int[] a = new int[num];
		for(int i = 0; i < num; ++i) {
			a[i] = i;
		}
		return a;
	}
	

	// 2)
	public static int[] range(int start, int end) {
		int len = Math.abs(start - end);
		
		// 삼항연산자 - 조건문 ? 예 : 아니오;
		int increment = start > end ? -1 : 1;
		
//		if (start > end) {
//			increment = -1;
//		} else {
//			increment = 1;
//		}
		int [] range = new int[len];
		
		
		for (int i = 0; i < len; ++i) {
			range[i] = start + (increment * i);
		}
		return range;
	}
	
	// 3)
	public static int[] range(int start, int end, int increment) {
		int len = (end - start) / increment;
		
		// len이 음수인 경우 방향이 잘못된 것이므로 빈 배열을 반환
		if (len < 0) {
			return new int[0];
		}
		
		// 나누어 떨어지지 않으면 배열이 한칸 더 필요
		if ((end - start)% increment != 0) {
			++len;
		}
		
		int[] range = new int[len];
		
		for (int i = 0; i < len; ++i) {
			range[i] = start + (increment * i);
		}
		
		return range;
	}
		


	
	public static void main (String [] args) {
		
		// 1)
		System.out.println(Arrays.toString(range(8)));
		
		// 2)
		System.out.println(Arrays.toString(range(10, 15)));
		System.out.println(Arrays.toString(range(15, 10)));
		
		//3)
		System.out.println(Arrays.toString(range(10, 20, 2)));
		System.out.println(Arrays.toString(range(40, 30, -3)));
		System.out.println(Arrays.toString(range(20, 10, 3)));
	}
	

}
