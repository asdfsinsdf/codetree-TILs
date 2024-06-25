import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int math_a = sc.nextInt();
        int eng_a = sc.nextInt();
        int math_b = sc.nextInt();
        int eng_b = sc.nextInt();
        

        // 영어 점수와 상관없이 수학점수가 높다면
        // 수학 점수가 같다면 영어 점수가 높은 출력
        //A의 수학이 B의 수학점수보다 높다 ==>A

        //웅씨의 수학점수는 90 영어는 80
        // 원장씨의 수학점수는 95점 영어는 20점이에요
        //누가출력됨? 원장 
        if(math_a > math_b ){
            System.out.println("A");
        }else if(math_a == math_b && eng_a > eng_b){
            System.out.println("A");
        }else{
            System.out.println("B");
        }
        }

    }

// 수학점수가 1대장이다.
// 수학점수가 a가 높은경우 , 둘이 같은경우, b가높은경우
//         x             ,     o        , p
// 영어점수로 비교 영어점수가 a가 큰경우,b가큰경우.