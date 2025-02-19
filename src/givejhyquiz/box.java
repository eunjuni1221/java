package givejhyquiz;

import java.util.Scanner;

public class box {
	public static void main(String[] args) {
		
		double w;
		double h;
		double area;
		double perimeter;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사각형의 가로를 입력하세요: ");
		w = sc.nextDouble();
		System.out.print("사각형의 세로를 입력하세요");
		h = sc.nextDouble();
		
		area = w*h;
		perimeter = 2.0 *(w+h);
		
		System.out.println("사각형의 넓이는: " + area);
		System.out.println("사각형의 둘레는: " + perimeter);
	}

}
