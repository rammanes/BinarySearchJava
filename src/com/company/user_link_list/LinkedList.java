package com.company.user_link_list;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;

    private class Node {
        private int value;
        private Node next;
        // this constructor add a value and set it to the value of the node
        public Node(int value){
            this.value = value;
        }
    }
    public void addLast(int item){
        var node = new Node(item);
        // if our linked list is empty set the first and last node to point to this value
        if(isEmpty())
            first = last = node;
        else{
            // set the last node link to point to current item
            last.next = node;
            // set last node to the new node
            last = node;
        }

    }
    public void addFirst(int item){
        var node = new Node(item);
        // if our linked list is empty set the first and last node to point to this value
        if(isEmpty())
            first = last = node;
        else{
            // set the node link to point to the first node in the list
            node.next = first;
            // set the new node as the first node
            first = node;
        }

    }
    public int indexOf(int item){
       // introduce a counter to  serve as an index
        int count = 0;
        var current = first;
        while (current !=null){
            if (current.value == item) return count;
            current = current.next;
            count++;
        }
        return -1;
    }
    public boolean cotains(int item){
        //traverse the list
        return indexOf(item)!= -1;
    }
    public void deleteFirst(){
        if (isEmpty())
            throw new NoSuchElementException();
        if(first == last){
            first = last = null;
            return;
        }
        var second = first.next;
        first.next = null;
        first = second;
    }
    public void display(){

        if (isEmpty())
            System.out.println("The link list is empty");

        var current = first;
        while(current.next != null) {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println(current.value);
    }
    private boolean isEmpty(){
        return first == null;
    }
}
