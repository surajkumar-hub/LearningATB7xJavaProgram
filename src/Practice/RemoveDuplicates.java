package Practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : arr)
        {
            uniqueSet.add(num);
        }
        System.out.println("Array without duplicates: " + uniqueSet);
    }
    }
