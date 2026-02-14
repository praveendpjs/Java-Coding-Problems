// https://www.geeksforgeeks.org/problems/c-program-to-remove-consonants-from-a-string1945/1?page=1&category=Strings&difficulty=Basic&sortBy=difficulty
// Remove consonants from a string
// Given a string S, remove all consonants and print the modified string that contains vowels only.

// Example 1:

// Input
// S = "abEkipo"
// Output
// aEio
// Explanation : a, E, i, o are only vowels in the string.
// Example 2:

// Input
// S = "rrty"
// Output
// No Vowel
// Explanation: There are no vowels.

package GeeksForGeeks.Strings;

public class RemoveConsonants {
    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
        }

    public String removeConsonants(String s) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(isVowel(curr)){
                result.append(curr);
            }
        }
        if(result.length() == 0){
            return "No Vowel";
        }
        return result.toString();
    }
}
