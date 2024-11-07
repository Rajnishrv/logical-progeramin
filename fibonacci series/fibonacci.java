public class fibonacci{
    public static void main(String[] args) {
        int n=0; int n2 = 1;
        int sum=0; int end =200;
        while (n<=end) {
            System.out.println(n);
            sum= n+n2;
            n=n2;
            n2=sum;
        }
    }
}