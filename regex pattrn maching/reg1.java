import java.util.regex.*;
public class reg1{
    public static void main(String[] args) {
        String s = "abcd1234";
        String ex ="[a-z,A-Z]{4}[0-9]{3}";
        System.out.println(Pattern.matches(ex, s));
    }
}