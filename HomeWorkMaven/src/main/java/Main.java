import Human.Human;
import Human.Address;
import Human.OperationsOnHuman;
import SortedHashMap.OperationsOnHashMap;
import User.User;
import User.Role;
import User.OperationsOnUser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Human> listOfHuman = new ArrayList<>();
        List.of(
                (listOfHuman.add(new Human("Иванов Иван Иванович", 14, new Address("Москва", "Берников переулок", 2, 1)))),
                (listOfHuman.add(new Human("Семенов Игорь Иванович", 26, new Address("Москва", "Гончарная улица", 14, 2)))),
                (listOfHuman.add(new Human("Кузнецов Петр Викторович", 37, new Address("Москва", "Вишняковский переулок", 6, 13)))),
                listOfHuman.add(new Human("Саирова Анна Сергеевна", 42, new Address("Москва", "1-й Хвостов переулок", 11, 1))),
                listOfHuman.add(new Human("Семенов Игорь Иванович", 26, new Address("Москва", "Гончарная улица", 14, 2))),
                listOfHuman.add(new Human("Бодрова Анастасия Николаевна", 15, new Address("Москва", "Зубовский бульвар", 31, 4))),
                listOfHuman.add(new Human("Серов Сергей Викторович", 52, new Address("Москва", "Трубниковский переулок", 4, 12))),
                listOfHuman.add(new Human("Бодрова Анастасия Николаевна", 15, new Address("Москва", "Зубовский бульвар", 31, 4))),
                listOfHuman.add(new Human("Саирова Анна Сергеевна", 42, new Address("Москва", "1-й Хвостов переулок", 11, 1))));
        OperationsOnHuman.sortByAge(listOfHuman);
        System.out.println("Сортировка по возрасту:");
        System.out.println(listOfHuman);
        System.out.println();
        System.out.println("Сортировка по ФИО:");
        OperationsOnHuman.sortByFullName(listOfHuman);
        System.out.println(listOfHuman);
        System.out.println();
        OperationsOnHuman.sortByAddress(listOfHuman);
        System.out.println("Сортировка по адресу");
        System.out.println(listOfHuman);
        System.out.println();

        Map<Integer, String> map = new HashMap<>();
        map.put(14,"Anna");
        map.put(71, "John");
        map.put(1,"Andrew");
        map.put(17,"Pall");
        map.put(104, "Bob");
        map.put(29, "Mary");
        System.out.println("До отсортировки:");
        System.out.println(map);
        System.out.println("Сортировка по ключу:");
        OperationsOnHashMap.sortedByKye(map);
        System.out.println();
        System.out.println("Сортировка по значению:");
        OperationsOnHashMap.SortHashMapByValue(map);
        
        Role role = new Role("ADMIN", "вы являетесь пользователем с правами администратора");
        User user = new User("Иванов Иван Иванович",role);
        OperationsOnUser.infoAboutUser(user);
    }
}
