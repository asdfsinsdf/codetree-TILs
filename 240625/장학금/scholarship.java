import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //중간고사 90점 받은자 ---> 기말고사 95점이상이면 10만원
        //중간고사 90점 받은자 ---> 기말고사 90점이상이면 5만원
        //중간고사 90점 받은자 ---> 기말고사 90점미만이면 0만원

        
        if((a >= 90) && (b >= 95)){
            System.out.println("100000");
        }else if((a >= 90) && (b >= 90)){
            System.out.println("50000");
        }else{
            System.out.println("0");
        }
    }
}