package array;

public class Swap {
    public static void main(String[] args) {
        int[] numbers = {11, 42, -5, 27, 0, 89};
        
        // Đảo ngược mảng
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        // In mảng đã đảo ngược
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
