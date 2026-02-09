package lessons.lesson9;

import java.util.Collection;
import java.util.HashSet;

public class CollectionUtils {
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
