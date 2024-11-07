import java.util.Scanner;
public class Prime {
    public static boolean isPrime(int num) {
        for (int i = 2; i <=num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        int c = 0; int i = 2;
        while (true) {
            if (isPrime(i)) {
                c++;
            }
            if (c == end) {
                System.out.println(i);
                break;
            }
            i++;
        }
        sc.close();
    }

}