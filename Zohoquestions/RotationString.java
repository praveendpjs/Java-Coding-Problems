// abcd rotational string would be bcda, cdab, dabc
// https://www.youtube.com/watch?v=wFxtrAnpxxg
public class RotationString {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "bcda";
        System.out.println(isRotation(s1,s2));
        

    }
    public static boolean isRotation(String s1, String s2){
        return s1.length() == s2.length() && (s1+s1).contains(s2); // abcdabcd will certainly have bcda, cdab, dabc
    }
}
