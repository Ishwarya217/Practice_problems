import java.util.*;
public class RemoveDuplicates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Input array size and elements
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array before removing duplicates
        Arrays.sort(arr);

        // Remove duplicates and store result
        int[] uniqueArr = RemoveDuplicatesInArray(arr);

        // Print the resulting array
        System.out.println("Array without duplicates:");
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
    }

    static int[] RemoveDuplicatesInArray(int[] arr) {
        if (arr.length == 0) {
            return arr; // Handle edge case for null input
        }

        int j = 1; // Pointer to store unique elements
        for (int i = 1; i < arr.length; i++) { 
            if (arr[i] != arr[i - 1]) { // Compare current element with the previous element
                arr[j++] = arr[i]; // Store unique element and increment pointer
            }
        }

        // Create a new array to return unique elements
        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = arr[i];
        }
        return result; // Return the array with unique elements
    }
}
