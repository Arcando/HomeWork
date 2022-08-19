
import java.util.*;


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

        Human.getDuplicatesWithIteration(listOfHuman);







    }
}

class Human{
    private String fullName;
    private int age;
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

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }


    public void SortByFullName(List<Human> list){


    }
    public static <E> List<E> getDuplicatesWithIteration(List<E> a) {
        Set<E> duplicates = new HashSet<>();
        Iterator iterator = duplicates.iterator();
        int n = 15;
        int index1 = 0;
        while (iterator.hasNext()) {
            index1 = duplicates.hashCode()&(n-1);
        }
           while (iterator.hasNext()){
               int index2 = 0;
               index2 = duplicates.hashCode()&(n-1);
               if (index1 == index2){
                   duplicates.add();
               }
           }
    }



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
}

class Address{
    private String town;
    private String street;
    private int house;
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
