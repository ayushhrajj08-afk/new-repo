public class BinarySearch{

    // Method to perform iterative binary search
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            // Calculates middle index safely to prevent integer overflow
            int mid = low + (high - low) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid; 
            }

            // If target is greater, ignore the left half
            if (arr[mid] < target) {
                low = mid + 1;
            } 
            // If target is smaller, ignore the right half
            else {
                high = mid - 1;
            }
        }

        // Return -1 if the element is not present in the array
        return -1;
    }

    public static void main(String[] args) {
        // Input array must be sorted!
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        int result = binarySearch(sortedArray, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
