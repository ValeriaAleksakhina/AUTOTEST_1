package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    @SuppressWarnings("checkstyle:Indentation")
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        List<Integer> list2 = new ArrayList<>();
        list2.add(15);
        list2.add(25);
        list2.add(35);

        double avgList1 = calculateAverage(list1);
        System.out.println("Среднее значение списка 1: " + avgList1);

        double avgList2 = calculateAverage(list2);
        System.out.println("Среднее значение списка 2: " + avgList2);
        if (avgList1 > avgList2) {
            System.out.println("Среднее значение списка 1 больше среднего значения списка 2.");
        } else if (avgList1 < avgList2) {
            System.out.println("Среднее значение списка 2 больше среднего значения списка 1.");
        } else {
            System.out.println("Средние значения списка 1 и списка 2 равны.");
        }
    }

    @SuppressWarnings("checkstyle:Indentation")
    public static double calculateAverage(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        return (double) sum / list.size();
    }
}