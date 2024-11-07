public class sum {
    public static void main(String[] args) {
       String s ="Hello hi 123 hi 20 bye 80" ;
       String[] arr = s.split(" ");
       int sum = 0;
       for(int i =0; i<arr.length; i++){
        try{
            int n= Integer.parseInt(arr[i]);
            sum+=n;
           }catch(NumberFormatException e){
        }
       }
System.out.println(sum);
    }
}
