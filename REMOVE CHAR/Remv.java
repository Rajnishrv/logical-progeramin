import java.util.Scanner;

public class Remv {
    static String removeLeft(String str) {
        String s = "";
        for (int i = 1; i < str.length(); i++) {
            s = s + str.charAt(i);
        }
        return s;
    }

    static String removeRight(String str) {
        String s = "";
        for (int i = 0; i < str.length() - 1; i++) {
            s = s + str.charAt(i);
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int size =s.length();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                s = removeRight(s);
                System.out.println(s);
            } else {
                s = removeLeft(s);
                System.out.println(s);
            }
        }
    }
}