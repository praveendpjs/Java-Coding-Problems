package GeeksForGeeks;

// I did this myself
public class PalindromicArr {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            int rev = 0;
            while(num > 0){
                int digit = num % 10;
                rev = rev * 10 + digit;
                num /= 10;
            }
            if(arr[i] != rev){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}
