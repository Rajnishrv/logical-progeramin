import java.util.Scanner;

public class pow {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter base no: ");
        int base = sc.nextInt();
        System.out.println("enter pow: ");
        int pow = sc.nextInt();
        int result=1;
        for(int i= 1;i<=pow;i++){
            result *=base;
        }
        System.out.println(result);
        sc.close();
    }
    
    
}
