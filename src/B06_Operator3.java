
public class B06_Operator3 {
	/*
	 *  # 대입 연산자
	 *  
	 *   = : 왼쪽의 변수에 오른쪽의 값을 넣는다. 원래 들어있던 값을 덮어쓴다.
	 *   
	 *  # 복합 대입 연산자
	 *  
	 *   += : 왼쪽 변수에 들어있던 값에 오른쪽의 값을 더해 누적시킨다
	 *   -= : 왼쪽 변수에 들어있던 값에서 오른쪽의 값을 빼 누적시킨다
	 *   *= : 왼쪽 변수에 들어있던 값에서 오른쪽의 값을 곱해 누적시킨다
	 *   /= : 왼쪽 변수에 들어있던 값을 오른쪽의 값으로 나누어 누적시킨다
	 *   %= : 왼쪽 변수에 들어있던 오른쪽의 값으로 나눈 나머지를 저장한다
	 *   
	 *  # boolean 타입의 복합 대입 연산
	 *  
	 *   &= : &&연산을 누적시킨다
	 *   |= : ||연산을 누적시킨다
	 *   ^= : XOR 연산을 누적시킨다 (두 값이 서로 달라야 true)
	 *   
	 *  # 단향 연산자
	 *  
	 *   ++: 해당 변수에 1을 더해서 누적시킨다
	 *   --: 해당 변수에 1을 빼서 누적시킨다
	 *   
	 *  # 단항 연산자의 위치에 따른 차이
	 *  
	 *   - 단항 연산자가 변수 뒤에 붙어있는 경우 해당 줄에 있는 모두 명령을 수행한 후에 값을 변화시킨다
	 *   - 단항 연산자가 변수 앞에 붙어이는 경우 해당 줄의 명령을 실행하기 전에 값을 변화시킨다.
	 *   ex) ++a, --a 
	 *   
	 */
	public static void main (String [] args) {
		
		int num = 10;
		System.out.println(num);
		
		num = 5;
		System.out.println(num);
		
		int num2 = 20;
		System.out.println("num2: " + num2);
		num2 += 3;
		System.out.println("num2: " + num2);
		num2 = num2 + 3;
		System.out.println("num2: " + num2);
		num2 -= 8;
		System.out.println("num2: " + num2);
		num2 /= 3;
		System.out.println("num2: " + num2);
		num2 *= 11;
		System.out.println("num2: " + num2);
		num2 %= 6;
		System.out.println("num2: " + num2);
		
		boolean allStudentAppeared = true;
		boolean chulsuAppeared = true;
		boolean sujinAppeared = false;
		boolean minsikAppeared = true;
		boolean juhwanAppeared = true;
		
		allStudentAppeared &= chulsuAppeared;
		allStudentAppeared &= sujinAppeared;
		allStudentAppeared &= minsikAppeared;
		allStudentAppeared &= juhwanAppeared;
		
		System.out.println("모든 학생이 출석했니? " + allStudentAppeared);
		
		int num3 = 8;
		
		num3++;
		System.out.println (num3);
		++num3;
		System.out.println (num3);
		num3++;
		System.out.println (num3);
		++num3;
		System.out.println (num3);

		num3--;
		System.out.println (num3);
		--num3;
		System.out.println (num3);
		
		int num4 = 30;
		
		System.out.println ("-------------------------------------------------------------");
		System.out.println (num4++);
		System.out.println (num4 -= 7) ;
		System.out.println (num4 ++) ;
		
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);


	}
}
