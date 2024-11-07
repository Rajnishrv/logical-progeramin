import java.util.Scanner;
public class secont {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
			for (int i = 0; i < ch.length;) {
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				} else {
					break;
				}
			}
			System.out.print(ch[i] + "" + (count));
			i += (count);
		}
		sc.close();
	}
}