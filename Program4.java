import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
      
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        for (int num : numbers) {
            for (int divisor = 1; divisor <= 9; divisor++) {
                if (num % divisor == 0) {
                    countMap.put(divisor, countMap.get(divisor) + 1);
                }
            }
        }

        System.out.println("Output:");
        System.out.println(countMap);
    }
}
