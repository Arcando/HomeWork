package SortedHashMap;
import java.util.*;
/**
 * Сортировка HashMap
 */
public class OperationsOnHashMap {
        /**
         * Здесь описывается сортировка HashMap по ключу с использованием TreeMap(в данном случае будет только сортировка по ключу)
         */
        public static void sortedByKye(Map<Integer, String> map ) {
            Map sortedMap1 = new TreeMap<>(map);
            sortedMap1.entrySet().forEach(System.out::println);
            Map<Integer, String> treeMap = new TreeMap<>(map);
        }
    /**
     * Здесь описывается сортировка HashMap по ключу с использованием EntrySet(в данном случае будет сортировка как по значению, так и по ключу)
     */
    public static void SortHashMapByValue(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "="
                    + entry.getValue());}
    }
}

