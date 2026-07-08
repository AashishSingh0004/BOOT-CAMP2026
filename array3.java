public class array3 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 55, 6, 7, 8, 9, 10};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("maximum value in the array is: " + max);
       
    }
    
}
