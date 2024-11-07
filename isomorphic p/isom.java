import java.util.Scanner;

public class isom {
        static String repeatCheck(String s) {
            s += "\0"; String res = ""; int count = 1;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                } else {
                    res += s.charAt(i);
                    res += count;
                    count = 1;
                }
            }
            return res;
        }
        static boolean tocheckIsommorphic(String s1,String s2) {
            for(int i=1;i<s1.length();i+=2) {
                    if(s1.charAt(i)!=s2.charAt(i)) {
                        return false;
                    }
            }
            return true;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s1 = "GGJJTTUOI";
            String s2 = "aaee99h";
            boolean flag=false;
            if(s1.length()==s2.length()) {
                s1=repeatCheck(s1);
                s2=repeatCheck(s2);
                if(tocheckIsommorphic(s1, s2)) {
                    flag=true;
                }
            }
            if(flag) {
                System.out.println("Isomorphic");
            }
            else {
                System.out.println("Not a Isomorphic");
            }
            sc.close();
        }
    }