//Write a program to Search an Element in an Array in java.

import java.util.Scanner;

public class class2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare an array
        int[] arr = {12, 34, 56, 78, 90, 23, 45};

        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        boolean found = false;

        // Iterate through the array to search for the element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index " + i);
                found = true;
                break; // Exit the loop once the element is found
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }
}
