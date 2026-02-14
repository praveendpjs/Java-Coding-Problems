// https://www.geeksforgeeks.org/problems/sandwiched-vowels5158/1?page=1&category=Strings&difficulty=Basic&sortBy=difficulty
// Sandwiched_Vowels
// For a given string s comprising only lowercase English alphabets, eliminate the vowels from the string that occur between two consonants(sandwiched between two immediately adjacent consonants). Return the new string.

// Examples:

// Input : s = "bab"
// Output : bb
// Explanation: 'a' is a vowel occuring between two consonants i.e. b. Hence the updated string eliminates a.
// Input : s = "ceghij"
// Output : cghj
// Explanation: 'e' and 'i' are sandwitched vowels.

package GeeksForGeeks.Strings;

public class SandwichedVowel {

    public static void main(String[] args) {
        String s1 = "bab";
        String s2 = "ceghij";

        System.out.println(removeSandwichedVowels(s1));
        System.out.println(removeSandwichedVowels(s2));
    }

    public static String removeSandwichedVowels(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);

            // First and last characters can never be sandwiched
            if (i == 0 || i == s.length() - 1) {
                result.append(current);
                continue;
            }

            if (isVowel(current)) {
                char left = s.charAt(i - 1);
                char right = s.charAt(i + 1);

                // if vowel between two consonants -> skip it
                if (isConsonant(left) && isConsonant(right)) {
                    continue;
                }
            }

            result.append(current);
        }

        return result.toString();
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static boolean isConsonant(char ch) {
        return !isVowel(ch);
    }
}

