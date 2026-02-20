// import java.util.HashMap;

public class FindUniqueElementinArr {
    static int UniqueElementsArr(int arr[]){
        int result = 0;
        for(int n:arr){
            result ^= n;
        }
        return result;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,4,2,4};
        System.out.println(UniqueElementsArr(arr));
    }
}

// Using hashmaps Time: O(n) good but space complexity is O(n) too which can be avoided
// public class FindUniqueElementinArr {
//     static int UniqueElementsArr(int arr[]){
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int num:arr){
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }
//         for(int num:arr){
//             if(map.get(num) == 1){
//                 return num;
//             }
//         }
//         return -1;

//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,1,3,4,2,4};
//         System.out.println(UniqueElementsArr(arr));
//     }
// }

// Brute force approach time complexity O(n^2)
// public class FindUniqueElementinArr {
//     static int UniqueElementsArr(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             int count = 0;
//             for(int j = 0; j < arr.length; j++){
//                 if(arr[i] == arr[j]){
//                     count++;
//                 }
//             }
//             if(count == 1){
//                 return arr[i];
//             }
//         }
//         return -1;

//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,1,3,4,2,4};
//         System.out.println(UniqueElementsArr(arr));
//     }
// }
