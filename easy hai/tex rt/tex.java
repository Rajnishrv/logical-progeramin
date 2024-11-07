import java.util.Scanner;
public class tex {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("Enter km");
    int km= sc.nextInt();
    double amount=30;
    if(km<=2){
        System.out.println(amount);
    }else if(km<=5){
        int dist = km-2;
        amount = (dist*10)+30;
        System.out.println(amount);
    }else if(km<=10){
        // int dist = km-2;
        // int dist1 = dist-5;
        int dist1 = km-7;
        amount = (dist1*15)+80;
        System.out.println(amount);
    }else if(km<=15){
        // int dist = km-2; 30
        // int dist1 = dist-5;
        // double amt = (5*10)+30; 
        // double amt2=5*15;
        int dist1 = km-12;
        amount =dist1 *20+155;
        System.out.println(amount);

    }else{
        int dist = km-2;
        int dist1 = dist-5;
        double amt = (5*10)+30;
        int dist2 = dist1-5;
        double amt1=5*15;
        int dist3 = dist2-5;
        double amt2 = 5*20;
        amount = (dist3*25)+amt2+amt1+amt;
        System.out.println(amount);
    }
    sc.close();
 }   
}