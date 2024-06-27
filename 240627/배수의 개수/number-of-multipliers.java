import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // 3의 배수와 5의 배수의 개수를 저장할 변수
        int count3 = 0;
        int count5 = 0;

        // 10개의 숫자를 입력받아 검사
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            
            // 3의 배수인 경우
            if (num % 3 == 0) {
                count3++;
            }
            
            // 5의 배수인 경우
            if (num % 5 == 0) {
                count5++;
            }
        }
        
        // 결과 출력
        System.out.println(count3 + " " + count5);
    }
}