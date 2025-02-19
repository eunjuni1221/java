package quiz;

public class B10_Gugudan {
	
	/*
	 *  1. 구구단을 다음과 같이 가로로 출력해 보세요
	 *  
	 *   2단: 2X1=2 ... 2X2=4 ... 2X3=6...
	 *   3단: 3x1=3 ... 3x2=6...
	 *   4단: ...
	 *   
	 *   2. 구구단을 다음과 같이 세로로 출력해보세요
	 *   
	 *   2단		3단		4단		...
	 *   2X1=2	3X1=3	4x1=4
	 *   2X2=4	3X2=6	4x2=8
	 *   ...
	 */
	public static void main (String [] args) {
		
		for (int dan = 2; dan <= 9; ++ dan) {
			System.out.print(dan+"단:");
			
			for (int gop = 1; gop <= 9 ; ++ gop) {
				System.out.printf("%dx%d=%-2d ", dan, gop, dan*gop);
			}
			System.out.println();
		}
		
		for (int dan = 2; dan <= 9; ++ dan) {
			System.out.print(dan+"단" + "\t");
		}
		System.out.println();
		
		for (int gop = 1; gop <= 9 ; ++ gop){
			for (int dan = 2; dan <= 9; ++ dan) {		
				System.out.printf("%dx%d=%d\t", dan, gop, dan * gop);			
			}
			System.out.println();	

		}
		
    }

}
