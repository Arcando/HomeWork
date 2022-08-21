
import java.util.*;

/**
 * это класс SortHashMap, в нем будет реализована сортировка HashMap по ключу и по значению
 */
public class SortHashMap {
    public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();

    map.put(14,"Anna");
    map.put(71, "John");
    map.put(1,"Andrew");
    map.put(17,"Pall");
    map.put(104, "Bob");
    map.put(29, "Mary");

        /**
         * Здесь описывается сортировка HashMap по ключу с использованием TreeMap(в данном случае будет только сортировка по ключу)
         */

        Map sortedMap1 = new TreeMap<>(map);
        sortedMap1.entrySet().forEach(System.out::println);//сортировка по ключу

        System.out.println("//////////////////////////////////////////////////////////////////");



        Map<Integer, String> treeMap = new TreeMap<>(map);
        printMap(treeMap);



    }
    /**
     * Здесь описывается сортировка HashMap по ключу с использованием EntrySet(в данном случае будет сортировка как по значению, так и по ключу)
     */
    public static void printMap(Map<Integer, String> map) {///сортирует по значению
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " Value : " + entry.getValue());
        }
    }
}






