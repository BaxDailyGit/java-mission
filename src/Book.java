public class Book {

    private String name;  //멤버 변수
    private boolean isBorrowed; //멤버 변수

    public Book(String name) { //책의 이름을 받아 초기화하는 생성자
        this.name = name;
        this.isBorrowed = false;
    }

    public String getName() { //책의 이름을 반환하는 메서드
        return name;
    }

    public boolean isBorrowed() { //책의 대여 상태를 반환하는 메서드
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) { //책의 대여 상태를 설정하는 메서드
        isBorrowed = borrowed;
    }}