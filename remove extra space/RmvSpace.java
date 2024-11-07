public class RmvSpace {
    public static void main(String[] args) {
        String s = "hello   rajn           nish";
        s += "\0";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != ' ') {
                System.out.print(s.charAt(i));

            } else if (s.charAt(i + 1) != ' ') {
                System.out.print(' ');
            }
        }
    }
}
