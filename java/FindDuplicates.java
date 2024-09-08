import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

    public static List<Integer> findModeNestedLoops(List<Integer> l) {
        // Tracking duplicates in a set to avoid duplicate values in return list
        Set<Integer> duplicatesSet = new HashSet<>();

        for (int i = 0; i < l.size(); i++) {
            int count = 0;

            for (int j = 0; j < l.size(); j++) {
                if (l.get(i) == l.get(j)) {
                    count++;
                }
            }

            // Count will be greater than two if there is a duplicate value, one if not,
            // because it counts itself.
            if (count >= 2) {
                duplicatesSet.add(l.get(i));
            }
        }

        // Convert to list before returning.
        List<Integer> duplicatesList = new ArrayList<>();
        duplicatesList.addAll(duplicatesSet);

        return duplicatesList;
    }

    public static void main(String[] args) {
        // some test strings:
        List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
        List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
        List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0));
        List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
        System.out.println("Sample 1: " + findModeNestedLoops(sample1));
        System.out.println("Sample 2: " + findModeNestedLoops(sample2));
        System.out.println("Sample 3: " + findModeNestedLoops(sample3));
        System.out.println("Sample 4: " + findModeNestedLoops(sample4));
    }

}