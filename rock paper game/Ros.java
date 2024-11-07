import java.util.Scanner;

public class Ros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==welcome in RPS game System==");
        int p = 0, c = 0;
        String[] arr = { "Rock", "Paper", "Scissor" };
        System.out.println("Enter Maxmum numaber");

        int max = sc.nextInt();
        System.out.println("Plese Enter Value Like:- ");
        System.out.println("Rock\nPaper\nScissor");
        System.out.println("===========================");
        System.out.println("=====Game Begins=====");

        while (true) {
            System.out.println("=========================");
            System.out.println("Player Turn:- ");
            String v1 = sc.next();
            int index = (int) (Math.random() * 3);
            String v2 = arr[index];

            System.out.println("Player: " + v1 + "   Computer: " + v2);
            if (v1.equals(v2)) {
                System.out.println("Draw......!!!");
            } else if ((v1.equals("Rock") && v2.equals("Scissor")) || (v1.equals("Paper") && v2.equals("Rock"))) {
                System.out.println("Player won this round...!!");
                p++;
            } else {
                System.out.println("Computer won this Round");
                c++;
            }
            System.out.println("p: " + p + " c: " + c);
            if (p == max) {
                System.out.println("Player won The game");
                break;
            } else if (c == max) {
                System.out.println("Player won The game");
                break;
            }
        }
        sc.close();
    }
}