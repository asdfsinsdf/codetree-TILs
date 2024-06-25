import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        int a = sc.nextInt();
        char s = sc.next().charAt(0);
        
        
        int b = sc.nextInt();
        char s_1 = sc.next().charAt(0);

       
       if(a >= 19 && s =='M' || b >= 19 && s_1 == 'W'){
            System.out.println("1");
       }else{
            System.out.println("0");
       }
        
    }
}