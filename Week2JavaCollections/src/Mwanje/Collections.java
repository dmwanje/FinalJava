package Mwanje;

import java.util.*;

public class Collections {

    public static void main(String[] args) {

        System.out.println("-- List --");
        java.util.List list = new ArrayList();
        list.add("Lehi");
        list.add("Sariah");
        list.add("Laman");
        list.add("Lemuel");
        list.add("Sam");
        list.add("Nephi");

        for (Object str : list) {
            System.out.println((String) str);

        }

        System.out.println("-- Queue --");
        java.util.Queue queue = new PriorityQueue();
        queue.add("Lehi");
        queue.add("Sariah");
        queue.add("Laman");
        queue.add("Lemuel");
        queue.add("Sam");
        queue.add("Nephi");


        Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(queue.poll());

        }

        System.out.println("-- Tree --");
        java.util.Set set = new TreeSet();
        set.add("Lehi");
        set.add("Sariah");
        set.add("Laman");
        set.add("Lemuel");
        set.add("Sam");
        set.add("Nephi");

        for (Object str : set) {
            System.out.println((String) str);
        }

        System.out.println("-- My Set --");

        Set<String> hash_Set = new HashSet<String>();

        hash_Set.add("Lehi");
        hash_Set.add("Sariah");
        hash_Set.add("Laman");
        hash_Set.add("Lemuel");
        hash_Set.add("Sam");
        hash_Set.add("Nephi");

        System.out.println(hash_Set);

    }

}