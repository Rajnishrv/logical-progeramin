import java.util.Scanner;

public class Strreverse {
    public static void main(String[] args) {
		String s = "He@ll56ohi#";
		String ch = "";
		int k = 0;
		// reverse only alpha
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if ((c >= 'a' && c<= 'z') || (c >= 'A' && c <= 'Z')) {
				ch = s.charAt(i) + ch;
			}
		}              
		// traversing string and add spacial char  
		String  ans = "";                                                                                        
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				ans += ch.charAt(k++);
			} else {
				ans += s.charAt(i);
			}
		}
		System.out.println(ans);
	}
}