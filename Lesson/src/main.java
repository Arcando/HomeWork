
import java.lang.reflect.Array;
import java.util.*;

/**
 * Это класс мэйн, в нем будут создаваться экземпляры классов и вызываться методы
 */
public class main {
    public static void main(String[] args) {

        List<Human> listOfHuman = new ArrayList<>();

        listOfHuman.add(new Human("Иванов Иван Иванович", 14, new Address("Москва", "Берников переулок", 2, 1)));
        listOfHuman.add(new Human("Семенов Игорь Иванович", 26, new Address("Москва", "Гончарная улица", 14, 2)));
        listOfHuman.add(new Human("Кузнецов Петр Викторович", 37, new Address("Москва", "Вишняковский переулок", 6, 13)));
        listOfHuman.add(new Human("Саирова Анна Сергеевна", 42, new Address("Москва", "1-й Хвостов переулок", 11, 1)));
        listOfHuman.add(new Human("Семенов Игорь Иванович", 26, new Address("Москва", "Гончарная улица", 14, 2)));
        listOfHuman.add(new Human("Бодрова Анастасия Николаевна", 15, new Address("Москва", "Зубовский бульвар", 31, 4)));
        listOfHuman.add(new Human("Серов Сергей Викторович", 52, new Address("Москва", "Трубниковский переулок", 4, 12)));
        listOfHuman.add(new Human("Бодрова Анастасия Николаевна", 15, new Address("Москва", "Зубовский бульвар", 31, 4)));
        listOfHuman.add(new Human("Саирова Анна Сергеевна", 42, new Address("Москва", "1-й Хвостов переулок", 11, 1)));
        listOfHuman.add(new Human("Петров Петр Петрович", 21, new Address("Москва", "Сергея Макеева", 7, 21)));

        Human human = new Human();
//        human.SortByAge(listOfHuman);
//        System.out.println(listOfHuman);
//        human.SortByFullName(listOfHuman);
//        System.out.println(listOfHuman);

//        human.SortByFullName(listOfHuman);
//        System.out.println(listOfHuman);
//
//        human.SortByAddress(listOfHuman);
//        System.out.println(listOfHuman);

        human.FindDuplicate(listOfHuman);











    }
}

/**
 * Это класс Human в нем будет описываться человек
 */
class Human{
    /**
     * В этом поле будет храниться ФИО пользователя
     */
    private String fullName;
    /**
     * В этом поле будет храниться возраст
     */
    private int age;
    /**
     * в этом поле будет храниться объект класса Address(Фактический, полный адрес проживания)
     */
    private Address address;

    public Human(String fullName, int age, Address address) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }

    public Human() {
    }

    @Override
    public String toString() {
        return "Human{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public  String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }


    /**
     * Данный метод будет сортировать пользователей по их возрасту в порядке убывания(входным параметром будет объект класса Human)
     * @param list
     */
    public void SortByAge(List<Human> list){//сортировка по Возрасту
        Collections.sort(list, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                if (o1.getAge() > o2.getAge()){
                    return 1;
                }else if(o1.getAge() < o2.getAge()){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
    }

    /**
     * Данный метод будет сортировать пользователей по их ФИО в лексикографическом порядке(входным параметром будет объект класса Human)
     * @param list
     */
    public void SortByFullName(List<Human> list){///сортировка по ФИО
        Collections.sort(list, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.fullName.compareTo(o2.fullName);
            }
        });

    }

    /**
     * Данный метод сортирует пользователей по их адресу проживания в лексикографическом порядке(входным параметром будет объект класса Human)
     * @param list
     */
    public void SortByAddress(List<Human> list){////Сортировка по адресу
        Collections.sort(list, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.address.getStreet().compareTo(o2.address.getStreet());
            }
        });
    }

    /**
     * Данный метод ищет дубликаты в коллекции через множества(Входным параметром будет список типа Human)
     * @param list
     */
    public void FindDuplicate(List<Human> list){
        //множество с дубликатами
        final Set<Human> duplicates = new HashSet<>();
        //множество для отслеживания повторений
        final Set<Human> tracking = new HashSet<>();

        //пробегаемся по всем элементам
        for(Human lists : list){
            //если не получилось добавить, то элемент уже встречался
            if(!tracking.add((Human) list)){
                //добавляем элемент в множество дубликатов
                duplicates.add((Human) list);
            }
        }
    }

}

/**
 * Данный класс описывает фактический адрес проживания пользователя
 */
class Address{
    /**
     * в данном поле будет храниться название города, в котором проживает пользователь
     */
    private String town;
    /**
     * в данном поле будет храниться полное название улицы, на которой проживает пользователь
     */
    private String street;
    /**
     * в данном поле будет храниться номер дома, в котором проживает пользователь
     */
    private int house;
    /**
     * в данном поле будет храниться номер квартиры, в которой проживает пользователь
     */
    private int flat;

    public Address(String town, String street, int house, int flat) {
        this.town = town;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }


    public String getTown() {
        return town;
    }

    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }

    public int getFlat() {
        return flat;
    }

    @Override
    public String toString() {
        return "Address{" +
                "town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                ", flat=" + flat +
                '}';
    }
}
