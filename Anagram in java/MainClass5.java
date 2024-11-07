import java.util.Scanner;

public class MainClass5 {
	public static String sort(String s) {
		char[] ch = s.toCharArray();
		char temp;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		return new String(ch);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		if (sort(s1).equals(sort(s2))) {
			System.out.println("Given String is Anagram");
		} else {
			System.out.println("Not A Anagram");
		}
		sc.close();
	}
}