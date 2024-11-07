import java.util.regex.Pattern;

public class email {
    public static void main(String[] args) {
        String s = "\bc#34@gmail.com";
        String ex ="[a-z,A-Z]{2,4}#*[0-9]{3,5}@gmil[.]com";
        System.out.println(Pattern.matches(ex, s));
    }
}
