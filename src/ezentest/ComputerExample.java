package ezentest;

public class ComputerExample {
	public static void main(String[] args) {
		
		double radius = 7;
		
        System.out.printf("원의 반지름: %.0f\n\n",radius);
        System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
        Calculator calculator = new Calculator();
        double area1 = calculator.CalculatorArea(radius); // 반지름 7
        System.out.println("원면적: " + area1 + "\n");
        
        System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
        Computer computer = new Computer();
        double area2 = computer.CalculatorArea(radius);
        System.out.println("원면적: " + area2);
	}
}
