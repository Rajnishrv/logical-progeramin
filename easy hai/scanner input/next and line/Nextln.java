import java.util.Scanner;
public class Nextln {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("enter member n1: ");
        int n1= ip.nextInt();
        System.out.println("enter string s: ");
        ip.nextLine();
        String s= ip.nextLine();
        System.out.println("Number: "+n1);
        System.out.println("String: "+s);
        ip.close();
    }
}
