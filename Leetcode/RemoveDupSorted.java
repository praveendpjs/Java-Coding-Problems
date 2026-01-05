class RemoveDupSorted {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[count] != nums[i]) {
                count++;
                nums[count] = nums[i];
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        RemoveDupSorted s = new RemoveDupSorted();

        int[] nums = {1, 1, 2, 2, 3, 3, 3};

        int newLength = s.removeDuplicates(nums);

        System.out.println("Unique count: " + newLength);

        // Print only the unique portion
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}