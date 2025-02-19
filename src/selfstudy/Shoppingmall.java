package selfstudy;

public class Shoppingmall {
	long order;
	String customID;
	int year;
	int month;
	int day;
	String name;
	String orderID;
	String address;
	
	public Shoppingmall(long order, String customID, int year, int month, int day, String name
								, String orderID, String address) {
		this.order = order;
		this.customID = customID;
		this.year = year;
		this.month = month;
		this.day = day;
		this.name = name;
		this.orderID = orderID;
		this.address = address;
	}
	public void print() {
		System.out.printf("주문 번호: %d\n",order);
		System.out.printf("주문자 아이디: %s\n",customID);
		System.out.printf("주문 날짜: %d년 %d월 %d일\n", year, month, day);
		System.out.printf("주문자 이름: %s\n", name);
		System.out.printf("주문 상품 번호: %s\n", orderID);
		System.out.printf("배송 주소: %s\n", address);
	}
	
}
