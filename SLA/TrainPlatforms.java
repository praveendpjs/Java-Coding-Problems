// calculate the minimum number of platforms required so that no train waits
// Given two arrays arr[] and dep[], that represent the arrival and departure time of i-th train respectively. Find the minimum number of platforms required so that no train has to wait. If the departure time of one train is the same as the arrival time of another train, both trains cannot use the same platform at that time.

// Note: Time intervals are in the 24-hour format (HHMM), where the first two characters represent hour (between 00 to 23) and the last two characters represent minutes (this will be <= 59 and >= 0). Leading zeros for hours less than 10 are optional (e.g., 0900 is the same as 900).

// Input: Arrival time =[900, 940, 950, 1100, 1500, 1800] Depature time = [910,1200,1120,1130,1900,2000]
// Output: 3 (Minimum platform needed)

// Imagine this timeline:

// Train A:  900 -------- 910
// Train B:      940 ----------- 1200
// Train C:         950 ------- 1120
// Train D:            1100 ---- 1130

// Now simulate what actually happens in time order.

// At 900 → Train A arrives → platforms needed = 1
// At 910 → Train A leaves → platforms needed = 0

// At 940 → Train B arrives → platforms needed = 1
// At 950 → Train C arrives → platforms needed = 2
// At 1100 → Train D arrives → platforms needed = 3 ← peak
// At 1120 → Train C leaves → platforms needed = 2
// At 1130 → Train D leaves → platforms needed = 1
// At 1200 → Train B leaves → platforms needed = 0

// Maximum ever needed = 3

// That’s the answer.

// The exact same problem appears on LeetCode as “253. Meeting Rooms II.” It’s the same physics, just disguised as meeting rooms instead of train platforms.

// Trains = meetings
// Platforms = meeting rooms

// Same overlap logic. Different costumes.

// But it's locked for premium users

import java.util.Arrays;

public class TrainPlatforms {
    public static int findPlatforms(int[] arrival, int[] departure) {

        Arrays.sort(arrival);
        Arrays.sort(departure);

        int platforms = 1;
        int maxPlatforms = 1;

        int i = 1, j = 0;

        while (i < arrival.length && j < departure.length) {

            if (arrival[i] <= departure[j]) {
                platforms++;  // new train arrives before previous departs
                i++;
            } else {
                platforms--;  // train departs, platform freed
                j++;
            }

            maxPlatforms = Math.max(maxPlatforms, platforms);
        }

        return maxPlatforms;
    }

    public static void main(String[] args) {

        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println(findPlatforms(arrival, departure)); // Output: 3
    }
}

// First, after sorting:

// Arrival:

// [900, 940, 950, 1100, 1500, 1800]

// Departure:

// [910, 1120, 1130, 1200, 1900, 2000]

// Initial state:

// platforms = 1
// maxPlatforms = 1
// i = 1
// j = 0

// Why platforms = 1 initially? Because the first train (900) has already "arrived."

// Now we simulate step by step.

// Step 1
// Compare:

// arrival[i] = 940
// departure[j] = 910

// Question: Did the next train arrive before the current one left?

// 940 > 910 → NO → departure happens first

// So:

// platforms--
// platforms = 0
// j++
// j = 1

// Station is empty now.

// maxPlatforms stays:

// maxPlatforms = 1

// Step 2
// Compare:

// arrival[i] = 940
// departure[j] = 1120

// 940 ≤ 1120 → YES → arrival happens before departure

// Train arrives → need platform

// platforms++
// platforms = 1
// i++
// i = 2

// maxPlatforms remains:

// maxPlatforms = 1

// Step 3
// Compare:

// arrival[i] = 950
// departure[j] = 1120

// 950 ≤ 1120 → arrival happens

// platforms++
// platforms = 2
// i++
// i = 3

// Update max:

// maxPlatforms = 2

// Now two trains present simultaneously.

// Step 4
// Compare:

// arrival[i] = 1100
// departure[j] = 1120

// 1100 ≤ 1120 → arrival happens

// platforms++
// platforms = 3
// i++
// i = 4

// Update max:

// maxPlatforms = 3

// This is the peak moment. Three trains occupying platforms.

// Timeline visualization:

// 940   Train arrives
// 950   Train arrives
// 1100  Train arrives
// 1120  First departure

// So between 1100–1120 → 3 trains coexist

// Step 5
// Compare:

// arrival[i] = 1500
// departure[j] = 1120

// 1500 > 1120 → departure happens

// platforms--
// platforms = 2
// j++
// j = 2

// maxPlatforms stays 3

// Step 6
// Compare:

// arrival[i] = 1500
// departure[j] = 1130

// 1500 > 1130 → departure happens

// platforms--
// platforms = 1
// j++
// j = 3

// Step 7
// Compare:

// arrival[i] = 1500
// departure[j] = 1200

// 1500 > 1200 → departure happens

// platforms--
// platforms = 0
// j++
// j = 4

// Station empty again.

// Step 8
// Compare:

// arrival[i] = 1500
// departure[j] = 1900

// 1500 ≤ 1900 → arrival

// platforms++
// platforms = 1
// i++
// i = 5

// Step 9
// Compare:

// arrival[i] = 1800
// departure[j] = 1900

// 1800 ≤ 1900 → arrival

// platforms++
// platforms = 2
// i++
// i = 6

// Loop ends.

// Final answer:

// maxPlatforms = 3