import java.util.Scanner;
public class palindrom{
 public static boolean isPalindrome(String s) {
        String rev = "";
        for (int i= s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev.equals(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 1; i < s.length(); i++) {
            String temp = "" + s.charAt(i);
            for (int j = i+1; j < s.length(); j++) {
                temp = temp + s.charAt(j);
                if (isPalindrome(temp)) {
                    System.out.println(temp);
                }
            }
        }
    }
}