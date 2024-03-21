import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class test {

    @Test
    void testCalculateAverage() { // Проверка, что среднее значение рассчитано верно
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        List<Integer> list2 = new ArrayList<>();
        list2.add(15);
        list2.add(25);
        list2.add(35);

        double avgList1 = Main.calculateAverage(list1);
        double avgList2 = Main.calculateAverage(list2);

        assertEquals(20, avgList1);
        assertEquals(25, avgList2);
    }

    @Test
    void testComparison() { // Проверка, что сравнение средних значений верно
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        List<Integer> list2 = new ArrayList<>();
        list2.add(15);
        list2.add(25);
        list2.add(35);

        double avgList1 = Main.calculateAverage(list1);
        double avgList2 = Main.calculateAverage(list2);

        String comparisonMsg1 = "Среднее значение списка 1 больше среднего значения списка 2.";
        String comparisonMsg2 = "Среднее значение списка 2 больше среднего значения списка 1.";
    }
}