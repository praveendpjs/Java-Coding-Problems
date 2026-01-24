// Given the array arr[] of heights of certain buildings that lie adjacent to each other, Sunlight starts falling from the left side of the buildings. If there is a building of a certain height, all the buildings to the right side of it having lesser heights cannot see the sun. The task is to find the total number of buildings that receive sunlight.

// Examples:

// Input: arr[] = [6, 2, 8, 4, 11, 13]
// Output: 4
// Explanation: Only buildings of height 6, 8, 11 and 13 can see the sun, hence output is 4.
// Input: arr[] = [2, 5, 1, 8, 3]
// Output: 3
// Explanation: Only buildings of height 2, 5 and 8 can see the sun, hence output is 3.
// Input: arr[] = [3, 4, 1, 0, 6, 2, 3]
// Output: 3

// Almost got it right
// https://www.geeksforgeeks.org/problems/buildings-receiving-sunlight3032/1?page=1&difficulty=Easy&sortBy=difficulty
package GeeksForGeeks;

public class BuildingsWithSunlight {
    public static int longest(int arr[]) {
        // write code here
        if (arr == null || arr.length == 0) return 0;

        int anchor = arr[0];
        int count = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] >= anchor){
                anchor = arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
