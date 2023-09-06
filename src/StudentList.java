import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.regex.Pattern;

public class StudentList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 스캐너 불러오기
        ArrayList<String> students = new ArrayList<>(); // 제네릭을 사용하여 타입(String) 지정

        String input;
        System.out.println("학생의 이름을 입력해 주세요");
        while (true) {
            input = sc.nextLine();
            if (input.equals("print")) {
                break;
            } else if (Pattern.matches("^[가-힣]*$",input)){
                students.add(input);
            } else {
                System.out.println("학생의 이름은 한글로만 입력해야 합니다.");
            }
        }
        Collections.sort(students);

        System.out.println("[학생 명단(가나다순)]");
        for (String student : students) {
            System.out.println(student);
        }


    }
}

//아직 미구현 사항:
//(선택) 입력값이 한글 또는 print가 아니라면, 학생의 이름은 한글로만 입력해야 합니다.