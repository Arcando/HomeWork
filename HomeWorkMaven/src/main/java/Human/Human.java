package Human;
import java.util.*;

    /**
     * Описание человека
     */
    public class Human {
        /**
         * В этом поле будет храниться ФИО пользователя
         */
        private String fullName;
        /**
         * В этом поле будет храниться возраст
         */
        private int age;
        /**
         * в этом поле будет храниться объект класса Human.Address(Фактический, полный адрес проживания)
         */
        private Address address;

        public Human(String fullName, int age, Address address) {
            this.fullName = fullName;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return "Human.Human{" +
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

        /**
         * Данный метод будет сортировать пользователей по их возрасту в порядке убывания(входным параметром будет объект класса Human.Human)
         * @param list
         */
        public void sortByAge(List<Human> list){
            Collections.sort(list, new Comparator<Human>() {
                @Override
                public int compare(Human o1, Human o2) {
                    if (o1.getAge() > o2.getAge()){
                        return 1;
                    }else if(o1.getAge() < o2.getAge()){
                        return -1;
                    }else{
                        return 0;}
                }
            });
        }

        /**
         * Данный метод будет сортировать пользователей по их ФИО в лексикографическом порядке(входным параметром будет объект класса Human.Human)
         * @param list
         */
        public void sortByFullName(List<Human> list){
            list.sort(Comparator.comparing(Human::getFullName));
        }

        /**
         * Данный метод сортирует пользователей по их адресу проживания в лексикографическом порядке(входным параметром будет объект класса Human.Human)
         * @param list
         */
        public void sortByAddress(List<Human> list){
            //list.sort(Comparator.comparing(Human::getAddress));
        }

        /**
         * Данный метод ищет дубликаты в коллекции через множества(Входным параметром будет список типа Human.Human)
         * @param list
         */
        public void findDuplicate(List<Human> list){
            final Set<Human> duplicates = new HashSet<>();
            final Set<Human> tracking = new HashSet<>();
            for(Human lists : list){
                if(!tracking.add((Human) list)){
                    duplicates.add((Human) list);
                }
            }
        }
    }
