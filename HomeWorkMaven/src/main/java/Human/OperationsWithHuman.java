package Human;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OperationsWithHuman {
    /**
     * Данный метод будет сортировать пользователей по их возрасту в порядке убывания(входным параметром будет объект класса Human)
     *
     * @param humanList
     */
    public static void sortByAge(List<Human> humanList) {
        humanList.sort(Comparator.comparing(Human::getAge));
    }

    /**
     * Данный метод будет сортировать пользователей по их ФИО в лексикографическом порядке(входным параметром будет объект класса Human)
     *
     * @param humanList
     */
    public static void sortByFullName(List<Human> humanList) {
        humanList.sort(Comparator.comparing(Human::getFullName));
    }

    /**
     * Данный метод сортирует пользователей по их адресу проживания в лексикографическом порядке(входным параметром будет объект класса Human)
     *
     * @param humanList
     */
    public static void sortByAddress(List<Human> humanList) {
        humanList.sort(Comparator.comparing(Human::getFullAddress));
    }

    /**
     * Поиск дубликатов в коллекции
     *
     * @param humanList
     * @return Set<Human>
     */
    public static Set<Human> getDuplicates(List<Human> humanList) {
        HashSet<Human> humansSet = new HashSet<>();
        for (Human human : humanList) {
            if (!humansSet.contains(human) && (humanList.indexOf(human) != humanList.lastIndexOf(human))) {
                humansSet.add(human);
            }
        }
        return humansSet;
    }

    /**
     *Удаляет дубликаты из коллекции
     * @param humanList
     */
    public static void removeDuplicates(List<Human> humanList){
        for(Human human : getDuplicates(humanList)){
            humanList.remove(human);
        }
    }
}