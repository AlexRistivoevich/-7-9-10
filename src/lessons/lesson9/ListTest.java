package lessons.lesson9;

import java.util.List;
import java.util.Random;

public class ListTest {
    private static final int ELEMENTS = 1_000_000;
    private static final int READS = 100_000;

    static void testList(List<Integer> list) {
        for (int i = 0; i < ELEMENTS; i++) {
            list.add(i);
        }
        Random random = new Random();
        long start = System.currentTimeMillis();

        for (int i = 0; i < READS; i++) {
            int index = random.nextInt(ELEMENTS);
            list.get(index);
        }

        long end = System.currentTimeMillis();

        System.out.println(list.getClass().getSimpleName()
                + " время: " + (end - start) + " мс");
    }
}