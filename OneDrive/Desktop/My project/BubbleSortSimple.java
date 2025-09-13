public class BubbleSortSimple {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 2, 9}; 

        System.out.println("Before sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

    
        for (int i = 0; i < numbers.length - 1; i++) {        
            for (int j = 0; j < numbers.length - 1 - i; j++) { 
                if (numbers[j] > numbers[j + 1]) {             
                    
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("\nAfter sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
