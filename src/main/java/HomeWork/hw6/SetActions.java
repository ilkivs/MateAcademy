package HomeWork.hw6;

import java.util.HashSet;
import java.util.Set;

public class SetActions {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> firstSet = new HashSet<>(set1);
        Set<T> secondSet = new HashSet<>(set2);
        firstSet.removeAll(set2);
        secondSet.removeAll(set1);
        firstSet.addAll(secondSet);
        return firstSet;
    }
}
