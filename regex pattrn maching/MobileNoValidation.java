import java.util.regex.Pattern;

public class MobileNoValidation {
        public static void main(String[] args) {
        String s = "9135233163";
        String ex ="[6-9][0-9]{9}";
        System.out.println(Pattern.matches(ex, s));
    }
}
