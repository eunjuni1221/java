package doitjava;

public class ObjectCopy1 {
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("두 도시 이야기", "찰스 디킨스");
		bookArray1[1] = new Book("어린 왕자", "생텍쥐페리");
		bookArray1[2] = new Book("반지의 제왕", "톨킨");
		
		// 디폴트 생성자로 bookArray2 배열 인스턴스 생성
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();	
		bookArray2[2] = new Book();
		
		// bookArray1 배열 요소를 새로 생성한 bookArray2 배열 인스턴스에 복사
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo(); // bookArray2 배열 요소 값 출력
		}
		// bookArray1 첫 번째 배열 요소 값 수정
		bookArray1[0].setBookName("나무");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("==== bookArray1 ====");
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo(); // bookArray1 배열 요소 값 출력
		}
		
		// bookArray1 배열 요소 값과 다른 내용이 출력됨
		System.out.println("==== bookArray2 ====");
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo(); // bookArray2 배열 요소 값 출력
		}
	}
	
}
