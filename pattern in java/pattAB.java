public class pattAB {
    public static void main(String[] args) {
        int k = 1;
        char l = 'A';
        for (char i = 1; i <= 5; i++) {

            for (char j = 1; j <= 5; j++) {
                if (i >= j) {
                    if (i % 2 == 0) {
                        System.out.print(k++ + " ");
                    } else {
                        System.out.print(l++ + " ");
                    }
                } else {
                    System.out.print("  ");

                }
            }
            System.out.println();
        }

    }
}
