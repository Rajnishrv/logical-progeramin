import java.util.Scanner;

public class ass{
    public static void swap(int a, int b){
        System.out.println("\nBefore Swaping-");
        System.out.println("First Number: "+a);
        System.out.println("Second Number: "+b);
        //using temp variable
        // int temp = a;
        // a = b;
        // b = temp;
        
        //withot extra variable
        a=a+b; //6+5=11
        b=a-b; //11-5=6
        a=a-b; //11-6=5
        System.out.println("\nAfter Swaping-");
        System.out.println("First Number: "+a);
        System.out.println("Second Number: "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter your Second number: ");
        int num2 = sc.nextInt();
        swap(num1, num2);
        sc.close();
    }
}