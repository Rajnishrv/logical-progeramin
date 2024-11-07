  //split the string into words and print each word in palindrome.
public class word{
    public static void main(String[] args) {
        String s = "Hello hi bye welcome";
        String[] arr = s.split(" ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
    }
}
} 