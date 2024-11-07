public class fib2 {
        public static void main(String[] args) {
            int n=0;
            int n2 = 1;
            int sum=0;
            int i=0;
            while (i<50) {
                System.out.println(n);
                sum= n+n2;
                n=n2;
                n2=sum;
                i++;
            }
        }
    }
