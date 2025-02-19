package quiz;

import java.util.Arrays;

public class B13_Sort {
	/*
	  	1 ~ 1000 사이의 랜덤 정수 값이 30개 들어있는 배열을 하나 생성한 후
	  	해당 배열의 내용을 작은 값부터 차례대로 저장한 새로운 배열을 생성하여 원본 배열과 함께 출력해주세요
	*/
	public static void main (String [] args) {
		int[] origin = new int[30];
		int[] sorted = new int[30];
		
		
		System.out.println("======================(원본)========================");
		for (int i = 0; i < origin.length; ++i) {
			int ranNum = (int)(Math.random() * 1001);
			origin[i] =  ranNum;
			sorted[i] = ranNum;
		}
		
		// 붙어있는 두 값을 비교하며 제일 큰 값을 맨 뒤로 보내는 방식
		for (int i = 0; i < sorted.length; ++i) {
			for (int j = 1; j < sorted.length - i; ++j) {
				int left = j - 1;
				int right = j;
				if(sorted[left] > sorted[right]) {
					int temp = sorted [left];
					sorted[left] = sorted[right];
					sorted[right] = temp;
				}
			}
		}
		
		
//=====================================================================================		
//		// 제일 작은값 찾아서 바꾸기는 29번(len - 1) 해야함
//		for (int i = 0; i < sorted.length - 1; ++i) {
//			int min = sorted[i];
//			int minIndex = i;
//			
//			// 제일 작은값 찾기
//			// 과정이 진행될때마다 앞부분은 점점 볼 필요가 없어짐
//			for (int j = i + 1; j < sorted.length; ++j) {
//				if (min > sorted[j]) {
//					min = sorted[j];
//					minIndex = j;
//				}
//			}
//			// 제일 작은값을 찾았다면 해당 값과 제일 앞(i)은 교환
//			sorted[minIndex] = sorted[i];
//			sorted[i] = min;
//			int temp = sorted[i];
//			sorted[i] = sorted[minIndex];
//			sorted[minIndex] = temp;
//		}
//		
// ==========================================================================================================================		
//		// boolean []은 false로 초기화 된다
//		boolean[] used = new boolean[origin.length]; 
//		
//		// 1. 원본 배열에서 가장 작은값을 찾아서 순서대로 꺼내온다
//		for (int i = 0; i < origin.length; ++i) {
//			// 제일 작은 값을 찾기
//			int min = 1000;
//			int minIndex = 0;
//			
//			for (int j = 0; j <origin.length; ++j) {
//				// 제일 작은값으로 뽑힌적이 없고, 현재 찾은 제일 작은값보다 더 작은 숫자일 떄 교체
//				if (!used[j] && min > origin[j]) {
//					min = origin[j];
//					minIndex = j;
//				}
//			}
//			// 찾은 제일 작은 값을 넣기
//			sorted[i] = min;
//			used[minIndex] = true;
//		}
		
		
		System.out.println(Arrays.toString(origin));
		System.out.println("======================(수정본)========================");
		System.out.println(Arrays.toString(sorted));


		

	}

}
