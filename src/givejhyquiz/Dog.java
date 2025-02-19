package givejhyquiz;

public class Dog {
	String breed;
	int age;
	String color;
	
	public void print(String breed, int age, String color) {
		this.breed = breed;
		this.age = age;
		this.color = color;
		System.out.println("강아지는 " + breed + " 종이며, 나이는 " + age + "살, 색깔은 " + color + "이다" );
	}
	
	public void barking () {
		System.out.println("강아지가 짖는다");
		
	}

}
