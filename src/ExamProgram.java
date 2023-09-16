import java.util.Scanner;
public class ExamProgram {
    int number;
    int html_score;
    int css_score;
    int javascript_score;
    public void execute() {
        Scanner sc = new Scanner(System.in);

        System.out.println("몇 기인지 입력해주세요.");
        number = sc.nextInt();
        System.out.println("HTML 과목 점수를 입력해주세요.");
        html_score = sc.nextInt();
        System.out.println("CSS 과목 점수를 입력해주세요.");
        css_score = sc.nextInt();
        System.out.println("Javascript 과목 점수를 입력해주세요.");
        javascript_score = sc.nextInt();
        result();
        speak_max();
        speak_min();
        speak_avg();
    }

    public void result() {
        if (60<=html_score && 60<=css_score && 60<=javascript_score){
            System.out.println("합격입니다.");
        }
        else if((html_score==100 && css_score==100) || (css_score==100 && javascript_score==100) || (javascript_score==100 && html_score==100)){
            System.out.println("합격입니다.");
        }
        else{
            System.out.println("불합격입니다.");
        }
    }

    public void speak_max() {
        int[] arr = {html_score,css_score,javascript_score};
        int max = 0;

        for (int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("전체 과목 중 최고점은" + max + "점입니다.");
    }

    public void speak_min() {
        int[] arr = {html_score,css_score,javascript_score};
        int min = arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("전체 과목 중 최저점은" + min + "점입니다.");
    }
    public void speak_avg() {
        int[] arr = {html_score,css_score,javascript_score};
        int sum = 0;
        int avg = 0;

        for (int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        avg = sum/arr.length;
        System.out.println("전체 과목의 평균은" + avg + "점입니다.");
    }

}
