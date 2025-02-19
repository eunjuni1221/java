package quiz;

public class A02_TypeQuiz {
		
		public static void main (String [] args) {
			
			String category1 = "이름";
			String category2 = "나이";
			String category3 = "Tel";
			String category4 = "키";
			String category5 = "몸무게";
			String category6 = "혈액형";
			
			String name = "홍길동";
			short age = 20;
			String tel = "010-1234-1234";
			double tall = 178.5;
			double weight = 75.0;
			String blood = "O"; // AB형은 char타입에 저장할 수 없으므로 String을 써야 한다.
			
			System.out.println(category1 + "\t : " + name);
			System.out.println(category2 + "\t : " + age);
			System.out.println(category3 + "\t : " + tel);
			System.out.println(category4 + "\t : " + tall);
			System.out.println(category5 + "\t : " + weight);
			System.out.println(category6 + "\t : " + blood);

			
					
		}

	}



