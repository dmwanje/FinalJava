package edu.byui.mwanje;

import java.util.*;

public class CollectionTypes {

    public static void main(String[] args) {

        System.out.println("-- List --");
        List list = new ArrayList();
        list.add("Hi");
        list.add("my");
        list.add("name");
        list.add("is");
        list.add("Daniel Mwanje");
        list.add("Hi");


        for (Object str : list) {
            System.out.println((String) str);

        }

            System.out.println("-- Set--");
            Set set = new TreeSet();
            set.add("Hi");
            set.add("my");
            set.add("name");
            set.add("is");
            set.add("Daniel Mwanje");
            set.add("Hi");

            for (Object str : set) {
                System.out.println((String) str);
            }
                System.out.println("-- Queue --");
                Queue queue = new PriorityQueue();
                queue.add("Hi");
                queue.add("my");
                queue.add("name");
                queue.add("is");
                queue.add("Daniel");
                queue.add("Hi");


                Iterator iterator = queue.iterator();
                while (iterator.hasNext()) {
                    System.out.println(queue.poll());
                }

            System.out.println("-- Map --");
            Map map = new HashMap();
            map.put(1,"Hi");
            map.put(2,"my");
            map.put(3,"name");
            map.put(4,"is");
            map.put(5,"Daniel Mwanje");
            map.put(4,"Hi");

            for (int i = 1; i < 6; i++) {
                String result = (String)map.get(i);
                System.out.println(result);
            }

        System.out.println("-- List using Generics --");
        List<DVDs> myList = new LinkedList<DVDs>();
        myList.add(new DVDs("Star Wars: Episode VII - The Force Awakens", "J.J. Abrams"));
        myList.add(new DVDs("Jurrasic World", "Colin Trevorrow"));
        myList.add(new DVDs("The Dark Knight", "Christopher Nolan"));
        myList.add(new DVDs("Shrek 2", "Andrew Adamson"));

        for (DVDs dvd : myList) {
            System.out.println(dvd);
        }



    }



    }



