package com.example.library;

import java.util.ArrayList;

public class Library {
    // 책 목록 속성
    // ArrayList 컬렉션 공부
    // 내가 적었던 것 : List<Library> l = new ArrayList<>();
    private ArrayList<Book> bookList;

    // 생성자
    public Library(){
        this.bookList = new ArrayList<>();
    }

    // 기능

    // 도서관에서 책 추가
    public void addBook(Book book){
        this.bookList.add(book);
    }

    // 도서관에서 책 이름으로 검색
//    public void findBookByName(String bookName){
//        for(Book book : this.bookList){
//            String foundTitle = book.getTitle();
//            if (foundTitle.equals(bookName)) {
//                System.out.println("책을 찾았습니다.");
//                book.detail();
//            }
//        }
//        System.out.println("책을 찾지 못했습니다.");
//    }

    // 도서관에서 책 이름으로 검색
    public Book findBookByName(String bookName){
        for(Book book : this.bookList){
            String foundTitle = book.getTitle();
            if (foundTitle.equals(bookName)) {
                System.out.println("책을 찾았습니다.");
                book.detail();
                return book;
            }
        }
        System.out.println("책을 찾지 못했습니다.");
        return null;
    }

    // 도서관 책 제거
    public boolean removeBook(String bookName) {
        for (Book book : this.bookList) {
            if (book.getTitle().equals(bookName)) {
                this.bookList.remove(book);
                System.out.println("'" + bookName + "' 책이 제거되었습니다.");
                return true;
            }
        }
        System.out.println("'" + bookName + "' 책을 찾지 못했습니다.");
        return false;
    }

    // 도서관 모든 책 출력
    public void printAllBooks() {
        if (this.bookList.isEmpty()) {
            System.out.println("도서관에 책이 없습니다.");
            return;
        }
        System.out.println("도서관에 있는 책 목록:");
        for (Book book : this.bookList) {
            book.detail();
        }
    }

    // 도서관 책 대여
    public boolean borrowBook(String bookName) {
        Book book = findBookByName(bookName);
        if (book == null) {
            System.out.println("'" + bookName + "' 책을 찾지 못했습니다.");
            return false;
        }

        boolean isAvailable = book.getIsAvailable();
        if (isAvailable) {
            book.setIsAvailable(false);
            System.out.println("'" + bookName + "' 책이 대여되었습니다.");
            return true;
        } else {
            System.out.println("'" + bookName + "' 책은 현재 대여 중입니다.");
            return false;
        }
    }

    // 도서관 책 반납
    public boolean returnBook(String bookName) {
        Book book = findBookByName(bookName);
        if (book == null) {
            System.out.println("'" + bookName + "' 책을 찾지 못했습니다.");
            return false;
        }

        boolean isBorrowed = !book.getIsAvailable();
        if (isBorrowed) {
            book.setIsAvailable(true);
            System.out.println("'" + bookName + "' 책이 반납되었습니다.");
            return true;
        } else {
            System.out.println("'" + bookName + "' 책은 이미 대여 가능한 상태입니다.");
            return false;
        }
    }

}
