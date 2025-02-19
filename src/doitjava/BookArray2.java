package doitjava;

public class BookArray2 {
	public static void main (String[] args) {
		Book[] library = new Book[5];
		
		// 인스턴스 생성 후 배열에 저장
		library[0] = new Book("두 도시 이야기", "찰스 디킨스");
		library[1] = new Book("어린 왕자", "생텍쥐페리");
		library[2] = new Book("반지의 제왕", "톨킨");
		library[3] = new Book("그리고 아무도 없었다", "크리스티");
		library[4] = new Book("하이디", "슈피리");
				
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}

}
