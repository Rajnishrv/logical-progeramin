public class patABC {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {
            int k = 1;
            for (char j = 'A'; j <= 'E'; j++) {
                if (i >= j) {
                    if (i % 2 == 0) {
                        System.out.print(j + " ");

                    } else {
                        System.out.print(k + " ");
                    }
                } else {
                    System.out.print("  ");

                }
                k++;

            }
            System.out.println();
        }

    }
}
