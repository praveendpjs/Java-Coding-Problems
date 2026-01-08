public class LinearSortArr {
    public static void main(String[] args) {
        int[] arr = {8,9,6,5,7,4};
        int target = 6;
        int index = -1; //Store found position

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.println(target + " Found at index " + index);
        }
    }
}
