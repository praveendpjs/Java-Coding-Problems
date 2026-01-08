// Using Bubble sort
public class SortingArrBubble {
    public static void main(String[] args) {

        int[] arr = {5,2,3,9,1};
        for(int i = 0; i < arr.length - 1; i++){ // i, avoids already sorted elements at the end. 
            for(int j = 0; j < arr.length - i - 1; j++){
                // swapping the elements
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int num:arr){
            System.err.print(num + " ");
        }
    }
}
