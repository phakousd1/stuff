package edu.canisius.csc.lsp.exam3;

import java.util.ArrayList;

public class Looping {

    public static void main(String[] args) {
        loopConstructUnderstanding();
    }

    private static void loopConstructUnderstanding() {
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < 100; i++){
            if(i % 10 == 0){
                list.add("added"); //list is 10 because 0, 10, 20, 30, 40, 50, 60, 70
                                    //80, 90 are all divisible by 10
            }
        }
        // What is the list's size at this point
        // Tests you understand for loop syntax and modulus
        System.out.println("list size: " + list.size()); //there are 10 elements in the list that are
        //divisible by 10

        boolean insert = true;
        do{
            if(list.size() == 100){
                break; //break will get it out of the loop when it reaches 100
                // continue will just lead to an infinite loop that will keep going
                //because "insert" is never changed within the loop, so it remains
                //'true', causing an infinite loop
            }
            list.add("added");
        }
        while(insert == true);

        // What is the list's size at this point
        // Tests you understand breaking concepts
        // You should know the difference between breaks and continues
        System.out.println("list size: " + list.size());// 100 because the list will stop at 100

        list.remove("added"); //remove one iteration of list that is now 100 in the list
        // What is the list's size at this point
        // Tests you understand object equality in Java and how to read API documentation
        // https://download.java.net/java/early_access/panama/docs/api/java.base/java/util/ArrayList.html
        System.out.println("list size: " + list.size()); //will print out 99 because you removed one iteration
        ArrayList<String> removes = new ArrayList<String>();
        removes.add("added");
        list.removeAll(removes); //removes everything in the list
        // What is the list's size at this point
        // Tests you understand object equality in Java and how to read API documentation
        System.out.println("list size: " + list.size()); // you removed the list, it is 0
    }


}
