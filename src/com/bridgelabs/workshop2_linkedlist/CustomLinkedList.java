package com.bridgelabs.workshop2_linkedlist;

public class CustomLinkedList {
    Node head;
    public void add(int data) {
        Node node = new Node(data);
        if(head == null) { //if node is null we are feeding the node data to head
            head = node;
        } //56, 30, 70
        else {
            Node temp = head; //feeding the value of head to temp node
            while(temp.next != null) { //while temp.next which has the head becomes null this loop will continue
                temp = temp.next; //until temp.next becomes null the temp.next will be feeded to temp;
            }
            temp.next = node;
        }
    }
    public void get() {
        Node node = head; //we are feeding head to the node
        while(node.next != null) { //until it becomes null it will get printed
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data); //this is because the while loop can't print the node.next which has null, the tail node
    }
}
