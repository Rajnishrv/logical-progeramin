import java.util.Scanner;

public class palindorme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your no.: ");
        int num = sc.nextInt();
        int r, sum = 0, temp;
        temp = num;
        while (num > 0) {
            r = num % 10; // getting remainder
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (temp == sum){
            System.out.println("palindrome number ");
        } else{
            System.out.println("not palindrome");
        }
        sc.close();
    }
}