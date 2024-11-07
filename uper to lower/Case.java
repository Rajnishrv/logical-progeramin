public class Case {
    public static void main(String[] args) {
        String str = "HELLo12Bye@hl#";
        String cap = "";
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch>='A' && ch<='Z') {
                ch+=32;
            }else if(ch>='a' && ch<='z'){
                ch-=32;
            }
                cap+=ch;
            }
            System.out.println(cap);
    }
}
