import java.util.Scanner;
public class Calculate {
    public static double sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double mult(int num1, int num2) {
        return num1 * num2;
    }

    public static double sub(int num1, int num2) {
        return num1 - num2;
    }

    public static double div(int num1, int num2) {
        return num1 / num2;
    }

    public static double mod(int num1, int num2) {
        return num1%num2;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. sum\n2. sub\n3. mult\n4. div\n5. mod\n6.exit");
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your choice");
            int choice = sc.nextInt();
            int num1 = 0;
            int num2 = 0;
            if (choice >= 1 && choice <= 5) {
                System.out.println("enter first no");
                num1 = sc.nextInt();
                System.out.println("enter your second no.");
                num2 = sc.nextInt();
            }
            switch (choice) {
                case 1:
                    System.out.println("sum " + sum(num1, num2));
                    break;
                case 2:
                    System.out.println("sub" + sub(num1, num2));
                    break;
                case 3:
                    System.out.println("mult " + mult(num1, num2));
                    break;
                case 4:
                    System.out.println("div " + div(num1, num2));
                    break;
                case 5:
                    System.out.println("mod " + mod(num1, num2));
                    break;
                case 6:
                    System.out.println("thank you visit again");
                    System.exit(0);
                default:
                    System.out.println("Enter valid option");
            }

        }
    }
}