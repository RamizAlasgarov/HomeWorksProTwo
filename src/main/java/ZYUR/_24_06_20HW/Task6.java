package ZYUR._24_06_20HW;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 6 Дана мапа, где ключ – id задачи, а значение – список записей о работе.
 * Запись о работе содержит id сотрудника и время, затраченное на задачу.
 * Подсчитайте общее время выполнения каждой задачи.
 * Подсчитайте суммарное время выполнения всех задач
 */
public class Task6 {
    public static void main(String[] args) {
        Map<Integer, List<String>> idToDo = new HashMap<>();

    }

    static Map<Integer, Integer> getWorkToHours(Map<Integer, List<Work>> workIdToWorkList) {
        return workIdToWorkList.entrySet().stream().collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()
                .stream().mapToInt(work -> work.empHours()).sum()));
    }
}

record Work(int empId, int empHours) {

}
