package SLA;
// Replace a character in String without builtin 
public class ReplaceChar {
    public static String replaceChar(String str, char oldChar, char newChar) {

        char[] arr = str.toCharArray();   // convert to char array

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == oldChar) {
                arr[i] = newChar;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "banana";
        System.out.println(replaceChar(s,'a','x'));
    }
}
