package lessons.lesson9;

import java.util.*;

import static lessons.lesson9.CollectionUtils.removeDuplicates;
import static lessons.lesson9.ListTest.testList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4);
        Collection<Integer> withoutDuplicates = removeDuplicates(list);
        System.out.println(withoutDuplicates);

         testList(new ArrayList<>());
         testList(new LinkedList<>());

        Map<User, Integer> scoreMap = new HashMap<>();
        scoreMap.put(new User("Alex"), 120);
        scoreMap.put(new User("Alux"), 150);
        scoreMap.put(new User("Ana"), 300);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        User user = new User(name);
        if (scoreMap.containsKey(user)) {
            System.out.println("Верно: " + scoreMap.get(user));
        } else {
            System.out.println("Пользователь не найден");
        }
    }
}

