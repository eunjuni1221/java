package quiz;

import java.util.Random;

public class B12_TempPassword2 {
	/*
	 *  대문자, 소문자, 숫자 특수문자로 구성된 
	 *  8자리 ~ 12자리의 랜덤 임시 비밀번호를 10개 생성하여 출력하는 프로그램 
	 *  특수문자는 아스키코드 33~47번
	 */
	public static void main (String [] args) {
		
		Random ran = new Random();
		String passwordCharset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "avcdefghijklmnopqrstuvwxyz0123456789!\"#$%'()*+,-./";
		
		for (int i = 0; i < 10; ++i) {
			int keySize = ran.nextInt (8, 13);
			
			String tempPassword = "";
			
			for (int j = 0; j < keySize; ++j) {
				tempPassword += passwordCharset.charAt(ran.nextInt(passwordCharset.length()));
			}
			System.out.printf("%d번째 임시비밀번호: %s\n", i, tempPassword);
		}
		
//		Random ran = new Random ();
//		
//		for (int i = 1; i < 11; ++i) {
//			int keySize = ran.nextInt(8, 13);
//			
//			String tempPassword = "";
//			
//			for (int j = 0; j < keySize; ++j) {
//				int category = ran.nextInt(4);
//				
//				switch (category) {
//				case 0:
//					tempPassword += (char)(ran.nextInt('A', 'Z' + 1));
//					break;
//				case 1:
//					tempPassword += (char)(ran.nextInt('a', 'z' + 1));
//					break;
//				case 2:
//					tempPassword += (char)(ran.nextInt('0', '9' + 1));
//					break;
//				case 3:
//					tempPassword += (char)(ran.nextInt(33, 48));
//					break;
//				}
//			}
//			System.out.printf("%d번째 비밀번호: %s\n",i , tempPassword);
//		}
	}
}