public class print123 {
    static int c =1;
    static void printNo(int n){
        if (c<n) {
            System.out.println(c);
            printNo(c++);
            System.out.println(n);
        }
    }
    
        public static void main(String[] args) {
            printNo(3);
        }
}
