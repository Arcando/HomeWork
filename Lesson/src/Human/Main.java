package Human;
import java.util.*;

/**
 * Это класс мэйн, в нем будут создаваться экземпляры классов и вызываться методы
 */
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

    }
}