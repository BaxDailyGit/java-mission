import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class PickerBestPlayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> playerNumbers = new ArrayList<String>();
        List<Double> playerRecords = new ArrayList<Double>();


        while (true) {

            System.out.println("선수의 번호를 입력하세요.");
            playerNumbers.add(sc.nextLine());

            if (playerNumbers.contains("print")) {   //.contains : 값이 존재하는지 확인하는 메서드
                double max = Collections.max(playerRecords);

                //playerRecords.indexOf(max) 첫번째 인덱스만 반환
                for (int i = 0; i < playerRecords.size(); i++) {
                    if (playerRecords.get(i).equals(max)) {
                        System.out.println("1등 : "+playerNumbers.get(i)+"번 선수 / "+ max+"초 (참가인원 : "+playerRecords.size()+"명)");
                    }
                }
                break;
            }

            System.out.println("이 선수의 100m 달리기 기록이 몇 초인지 입력하세요.");
            double bf_round = sc.nextDouble();
            playerRecords.add(Math.round(bf_round * 100.0) / 100.0); // 입력값을 소수 둘째 자리까지 반올림하여 저장
            sc.nextLine(); //scan.nextLine() 을 한번 더 작성하여 개행문자 제거



        }
        sc.close();
    }
}


