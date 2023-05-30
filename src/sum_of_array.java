public class sum_of_array {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int sum = 0;

        // Calculate the sum of array elements
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Print the sum
        System.out.println("Sum of the array elements: " + sum);
    }
}
