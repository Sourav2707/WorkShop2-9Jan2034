package com.bridgelabs.workshop2_linkedlist;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to workshop 2 assesment program - Custom linked list");
        //Write a java program to make simple linked List
        //Linked list should be simple with 40,50,70,89 values.
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add(40);
        customLinkedList.add(50);
        customLinkedList.add(70);
        customLinkedList.add(89);
        customLinkedList.get();
    }
}
