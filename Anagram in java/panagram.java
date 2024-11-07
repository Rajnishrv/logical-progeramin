public class panagram {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        int[] arr = new int[127];
        s = s.toUpperCase();
        for(int i = 0; i<s.length(); i++) {
            arr[s.charAt(i)]++;
        }
        
        boolean flag = true;
        for(int i = 65; i<=90; i++){
            if (arr[i]==0) {
                flag=false;
                break;
            }
        }
        System.out.println(flag?"Yes, it is a panagram":"No, it is not a panagram");
    }
}