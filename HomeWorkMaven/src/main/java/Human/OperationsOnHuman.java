package Human;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OperationsOnHuman {
    /**
     * Данный метод будет сортировать пользователей по их возрасту в порядке убывания(входным параметром будет объект класса Human)
     * @param list
     */
    public static void sortByAge(List<Human> list){
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
     * Данный метод будет сортировать пользователей по их ФИО в лексикографическом порядке(входным параметром будет объект класса Human)
     * @param list
     */
    public static void sortByFullName(List<Human> list){
        list.sort(Comparator.comparing(Human::getFullName));
    }

    /**
     * Данный метод сортирует пользователей по их адресу проживания в лексикографическом порядке(входным параметром будет объект класса Human)
     * @param list
     */
    public static void sortByAddress(List<Human> list){
        list.sort(Comparator.comparing(Human::getFullAddress));
    }
}
