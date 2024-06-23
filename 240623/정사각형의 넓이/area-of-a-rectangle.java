import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자 입력을 받음
        Scanner sc = new Scanner(System.in);
        
        // 사용자로부터 정수를 입력받음
        int n = sc.nextInt();
        
        // 정사각형의 넓이를 계산하여 출력
        System.out.println(n * n);
        
        // 입력받은 정수가 5 미만인지 확인
        if (n < 5) {
            // 정수가 5 미만이면 "tiny"를 출력
            System.out.println("tiny");
        }
        
    }
}