public class simp {
    public static void main(String[] args) {
        int km = 21;
        double amount=0;
        if (km <= 2) {
            amount =30;
        } else if (km <= 7) {
            amount = ((km - 2)*10 )+ 30;
        } else if (km <= 12) {
            amount = ((km - 7) * 15) + 80;
        } else if (km <= 17) {
            amount = ((km - 12) * 20) + 155;
        } else {
            amount = ((km - 17) * 25) + 255;
        }
        System.out.println(amount);
    }
}
