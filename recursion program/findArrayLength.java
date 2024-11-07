public class findArrayLength {
    static void findLength(int[] arr, int index ){
        try{
            arr[index]++;
        }catch (ArrayIndexOutOfBoundsException e){

        }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,8,6};
        int index = 0;
        findLength(arr, index);
    }
}
