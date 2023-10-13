import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RemoveRepeatedNumbers {
    public RemoveRepeatedNumbers() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть числа розділені пробілами: ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");

        int[] A = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            A[i] = Integer.parseInt(inputArray[i]);
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : A) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int num : A) {
            if (frequencyMap.get(num) <= 3) {
                result.add(num);
            }
        }

        int[] compactedArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            compactedArray[i] = result.get(i);
        }

        System.out.println(Arrays.toString(compactedArray));

        scanner.close();
    }
}
