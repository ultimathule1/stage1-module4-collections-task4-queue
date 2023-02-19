package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        //Queue<Integer> queue = new ArrayDeque<>();
        List<Integer> dishes = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            dishes.add(i);
        }

        int step = everyDishNumberToEat - 1;
        int i = 0;
        while (!dishes.isEmpty()) {
            i = (i + step) % dishes.size();
            int n = dishes.remove(i);
            result.add(n);
        }

        return result;
    }
}
