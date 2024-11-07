public class div {

    public static void main(String[] args) {
        int num = 21;
        boolean flage= false;
        while (num>0) {
            num -=7;
            if (num==0) {
                flage = true;
            }
        }
        if (flage) {
            System.out.println("divisible by 7");
        }else{
            System.out.println("not divisible by 7");
        }
    }
}