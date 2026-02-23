import java.util.Arrays;
// Method 1: Sorting (clean and reliable)
public class AnagramCheck {
    public static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("hello", "world"));   // false
    }
}

// Method 2: Frequency counting (elite solution)
// public class AnagramCheck {
//     public static boolean isAnagram(String s1, String s2) {
//         if(s1.length() != s2.length()) return false;

//         int[] count = new int[26];

//         for(int i = 0; i < s1.length(); i++) {
//             count[s1.charAt(i) - 'a']++;
//             count[s2.charAt(i) - 'a']--;
//         }

//         for(int c : count) {
//             if(c != 0) return false;
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         System.out.println(isAnagram("listen", "silent")); // true
//         System.out.println(isAnagram("rat", "car"));       // false
//     }
// }


// Method 3: HashMap (works, but overkill)
// import java.util.HashMap;

// public static boolean isAnagram(String s1, String s2) {
//     if(s1.length() != s2.length()) return false;

//     HashMap<Character,Integer> map = new HashMap<>();

//     for(char c : s1.toCharArray())
//         map.put(c, map.getOrDefault(c,0)+1);

//     for(char c : s2.toCharArray()) {
//         if(!map.containsKey(c)) return false;
//         map.put(c, map.get(c)-1);
//         if(map.get(c)==0) map.remove(c);
//     }

//     return map.isEmpty();
// }