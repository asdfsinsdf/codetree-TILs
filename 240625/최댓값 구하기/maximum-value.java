import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a >=b){
            if(a >=c){
                System.out.println("1");
            }else{
                System.out.println("5");
            }
        }else{
            if(b >=c){
                System.out.println("3");
            }else{
                System.out.println("5");
            }
        }         
    }
}