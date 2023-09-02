import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 스캐너 불러오기
        ArrayList<String> students = new ArrayList<String>(); // 제네릭을 사용하여 타입(String) 지정


        System.out.println("학생의 이름을 입력해 주세요");
        int i = 0;
        while (true) {
            students.add(sc.nextLine());
            i++;
            if (students.contains("print")) {   //값이 존재하는지 확인하는 메서드
                break;
            }
        }
    }
}

//아직 미구현 사항:
//(선택) 입력값이 한글 또는 print가 아니라면, 학생의 이름은 한글로만 입력해야 합니다.