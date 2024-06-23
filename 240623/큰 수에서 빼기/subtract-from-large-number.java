import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int a = sc.nextInt();
       int b = sc.nextInt();
       
        
        // 출력
        if(a < b)
            System.out.println(b - a);
        if(a >= b)
            System.out.println(a - b);
    }
}