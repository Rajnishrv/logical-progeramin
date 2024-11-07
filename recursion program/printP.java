public class printP {
    static void printNo(int n){
        if (n!=0) {
            System.out.println(n);
            printNo(n-1);
            System.out.println(n);
        }else {
            
        }
    }
        public static void main(String[] args) {
            printNo(3);
        }
}
