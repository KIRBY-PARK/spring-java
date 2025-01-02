package com.example.library;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        // 객체 생성
        // 빌리지 않았다의 false가 아니라 빌릴 수 없다의 false
        Book bookA = new Book("인간", "베르나르 베르베르", true);
        Book bookB = new Book("이것이 자바다", "신용권", true);
        Book bookC = new Book("100일 완성 IT지식", "브라이언 W.커니핸", true);
        Book bookD = new Book("개발자로 살아남기", "박종천", true);

        // 책 제목 조회
        System.out.println("================================================================================");
        System.out.println("\uD83D\uDD8D\uFE0F 책 제목 조회");
        bookA.inquiry();
        String readTitle = bookA.getTitle();
        System.out.println("책 제목 : " + readTitle);

        // 책 대여여부 조회
        System.out.println("\uD83D\uDD8D\uFE0F 책 대여여부 조회");
        Boolean borrow = bookA.getIsAvailable();
        System.out.println("대여 가능 여부 : " + borrow);

        // 책 대여여부 설정


        // 책 상세 정보 출력
        System.out.println("================================================================================");
        System.out.println("\uD83D\uDD8D\uFE0F 책 상세 정보 출력");
        bookA.detail();

        // 도서관에 책 추가
        library.addBook(bookA);
        library.addBook(bookB);
        library.addBook(bookC);
        library.addBook(bookD);

        // 도서관에서 책 이름으로 검색
        System.out.println("================================================================================");
        System.out.println("\uD83D\uDD8D\uFE0F 도서관에서 책 이름으로 검색");
        library.findBookByName("이것이 자바다");

        // 모든 책 출력
        System.out.println("================================================================================");
        System.out.println("\uD83D\uDD8D\uFE0F 모든 책 출력");
        library.printAllBooks();

        // 책 대여
        System.out.println("================================================================================");
        System.out.println("\uD83D\uDD8D\uFE0F 도서관에서 책 대여");
        library.borrowBook("인간"); // 대여 가능
        System.out.println("================================================================================");
        library.borrowBook("인간"); // 이미 대여 중

        // 대여 후 모든 책 출력
        System.out.println("================================================================================");
        System.out.println("\uD83D\uDD8D\uFE0F 대여 후 모든 책 출력");
        library.printAllBooks();

        // 책 제거
        System.out.println("================================================================================");
        System.out.println("\uD83D\uDD8D\uFE0F 책 제거");
        library.removeBook("개발자로 살아남기"); // 제거 가능
        library.removeBook("없는 책"); // 제거 불가

        // 책 제거 후 모든 책 출력
        System.out.println("================================================================================");
        System.out.println("\uD83D\uDD8D\uFE0F 책 제거 후 모든 책 출력");
        library.printAllBooks();

        // 책 반납
        System.out.println("================================================================================");
        System.out.println("\uD83D\uDD8D\uFE0F 책 반납");
        library.returnBook("이것이 자바다"); // 이미 대여 가능한 상태
        System.out.println("================================================================================");
        library.returnBook("인간"); // 반납 성공
        System.out.println("================================================================================");
        library.returnBook("없는 책");  // 책을 찾을 수 없음

        // 책 반납 후 모든 책 출력
        System.out.println("================================================================================");
        System.out.println("\uD83D\uDD8D\uFE0F 책 반납 후 모든 책 출력");
        library.printAllBooks();
    }
}
