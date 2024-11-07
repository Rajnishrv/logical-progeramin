import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first name" );
        //next not take space
        String fName= sc.next();
        System.out.println("Your first name is: "+fName);
        System.out.println("enter your full name");
        //nextLine is also take space
        String name = sc.nextLine();
        System.out.println("your full name is: "+name);
        sc.close();
    }
}
