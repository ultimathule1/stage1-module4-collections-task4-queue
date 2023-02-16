package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public static void main(String[] args) {
        String[] str = new String[] {
                "Java", "PriorityQueue", "class"
        };
        List<String> firstList = new ArrayList<>(Arrays.asList(str));
        String[] str2 = new String[] {
                "It", "is", "different", "from", "standard", "queues", "where", "FIFO"
        };
        List<String> secondList = new ArrayList<>(Arrays.asList(str2));

        PriorityQueue<String> pq = createPriorityQueue(firstList, secondList);
        System.out.println(pq);
    }
    public static PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        int firstPtr = 0;
        int secondPtr = 0;
        PriorityQueue<String> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            if(o1.compareTo(o2) < 0) return 1;
            else if (o1.compareTo(o2) > 0) return -1;
            return 0;
        });
//        firstList.sort((o1, o2) -> {
//            if(o1.compareTo(o2) < 0) return 1;
//            else if (o1.compareTo(o2) > 0) return -1;
//            return 0;
//        });
//        secondList.sort((o1, o2) -> {
//            if(o1.compareTo(o2) < 0) return 1;
//            else if (o1.compareTo(o2) > 0) return -1;
//            return 0;
//        });
        System.out.println(firstList);
        System.out.println(secondList);

        while (firstPtr < firstList.size() && secondPtr < secondList.size()) {
            if (firstList.get(firstPtr).compareTo(secondList.get(secondPtr)) > 0) {
                priorityQueue.add(firstList.get(firstPtr++));
            } else {
                priorityQueue.add(secondList.get(secondPtr++));
            }
        }

        while(firstPtr < firstList.size()) {
            priorityQueue.add(firstList.get(firstPtr++));
        }

        while(secondPtr < secondList.size()) {
            priorityQueue.add(secondList.get(secondPtr++));
        }

        return priorityQueue;
    }
}