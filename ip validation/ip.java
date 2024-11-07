import java.util.regex.Pattern;
public class ip {
    public static void main(String[] args) {
        int c = 0;
        String s = "184.50.133.0";
        String[] s1 = s.split("[.]");
        String ex;
        // for (int i = 0; i < s1.length; i++) {
        //     if (s1[i].length() == 1) {
        //         ex = "[0-9]";
        //     } else if (s1[i].length() == 2) {
        //         ex = "[0-9][0-9]";
        //     } else {
        //         ex = "[0-2][0-5][0-5]";
        //     }
        //     if (Pattern.matches(ex, s1[i]) && s1.length == 4) {
        //         c++;
        //     }
        // }
        // if (c == 4) {
        //     System.out.println("Valid IP address");
        // } else {
        //     System.out.println("Invalid IP address");
        // }
        if (s1.length==4) {
            boolean flag = true;
            for(int i =0; i<s1.length; i++){
                int n = Integer.parseInt(s1[i]);
            if (n<0||n>255) {
                flag =false;
            }
        
            }
            System.out.println(flag?"Valid Ip":"invalid IP address");
        }else{
            System.out.println("invalid IP address");
        }


    }
}