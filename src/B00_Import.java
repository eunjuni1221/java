// 현재 코드에서 다른 패키지의 코드를 불러다 사용하겠다라고 명시하는 문법
import quiz.A00_Rabbit;
import quiz.A01_SwapValue;

public class B00_Import {
	
	/*
	 * # import
	 * 
	 *  - 다른 패키지에 속해 있는 다른 클래스를 불러다 사용하기 위한 문법
	 *  - 같은 패키지에 속해 있는 다른 클래스는 굳이 import가 없어도 불러다 사용할 수 있다
	 */
	public static void main (String [] args) {
		A00_Hello.main(null);
		A01_Escape.main(null);
		
	    // Ctrl + Shift + O : 자동 import 단축기
		A00_Rabbit.main(null);
		A01_SwapValue.main(null);
		
		
	}

}
