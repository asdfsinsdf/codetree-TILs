import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 정수 a 입력받기
        
        int a = sc.nextInt();
        
        // a가 홀수라면 3을 더하기
        if (a % 2 != 0) {
            a += 3;
        }
        
        // a가 3의 배수라면 3으로 나누기
        if (a % 3 == 0) {
            a /= 3;
        }
        
        // 결과 출력
        System.out.println(a);
        
        
    }
}