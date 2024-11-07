import java.util.Scanner;

public class AToa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if (c>='a'&&c <='z') {
            System.out.println(c-=32);
        }else if (c>='A'&&c <='Z') {
            System.out.println(c+=32);
        }else{
            System.out.println(c);
        }
        sc.close();
    }
}