package quiz;

import java.util.Random;

public class B12_TempPassword {
	/*
	   	알파벳 대문자만으로 구성된 랜덤 4자리 
	   	임시 비밀번호를 20개 생성하여 출력해보세요
	*/
	public static void main (String [] args) {
		
//		Random ran = new Random();
//		for (int i = 1; i < 21; ++i) {
//			System.out.printf("%d번째 비밀번호: ", i);
//			for (int a = 0; a < 4; ++a) {
//				System.out.print((char)ran.nextInt(65,91));	
//			}
//			System.out.println();
//		}
//		
		Random ran = new Random();
		
		int keyLen = 4;
		
		for(int j = 1; j < 21; ++j) {
			String tempKey = "";
			for (int i = 0; i < keyLen; ++i) {
			tempKey += (char)ran.nextInt('A', 'Z' + 1);
			}
			System.out.printf("%d번째 키: %s\n", j, tempKey);
		}
	}
	

}
