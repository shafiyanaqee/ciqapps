package Com.ciq;
import java.util.*;

public class RemoveDuplicatesArray {
    public static Integer[] removeDuplicates(Integer[] arr) {
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
        return set.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 2, 4, 5, 1, 6};
        Integer[] uniqueArr = removeDuplicates(arr);

        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArr));
    }
}
