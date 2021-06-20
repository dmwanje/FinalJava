package com.mwanje.basicthreads;

import java.util.Random;

public class DoingSomething implements Runnable {

    private String name;
    private int number;
    private int exercise;
    private int rand;

    public DoingSomething(String name, int number, int exercise) {

        this.name = name;
        this.number = number;
        this.exercise = exercise;

        Random random = new Random();
        this.rand = random.nextInt(1000);

    }

    public void run (){
        //have multiple versions of class run diff threads
        //create constructor
        System.out.println("\n\nExecuting with these parameters: = " + name + " Number + " + number + " Exercise setting = " + exercise + " Random number = " + rand + "\n\n");

        //for loop - go through steps depending on parameters
        for (int count = 1; count < rand; count++) {
            //use integer division using modulus
            if (count % number == 0){
                System.out.print(name + " is exercising. ");
                try {
                    Thread.sleep(exercise);
                } catch (InterruptedException e){
                    System.err.println(e.toString());
                }
            }
        }
        System.out.println("\n\n" + name + " is done. " + "\n\n");

    }

}

