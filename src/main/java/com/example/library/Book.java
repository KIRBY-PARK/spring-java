package com.example.library;

public class Book {
    // 속성
    private String title;
    private String author;
    private Boolean isAvailable;

    // 생성자
    // 클래스명과 이름이 같아야하고 여러개가 있을 수 있으며 반환타입이 없다.
    public Book(String title, String author, Boolean isAvailable){
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // 기능
    public void inquiry(){
        System.out.println("이 책의 제목은 '" + this.title + "' 입니다.");
    }

    // 책 제목 조회 기능
    public String getTitle(){
        return this.title;
    }

    // 책 대여여부 조회 기능
    public Boolean getIsAvailable(){
        return this.isAvailable;
    }

    // 책 대여여부 설정 기능
    public void setIsAvailable(Boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    // 책 상세 정보 출력
    public void detail(){
        System.out.println("이 책은 '" + this.author + "' 의 '" + this.title + "' 이고 현재 대출 가능 여부는 " + this.isAvailable + " 입니다.");
    }

}
