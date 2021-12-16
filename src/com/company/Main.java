package com.company;

import com.company.user_link_list.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] items = {4, 6, 7, 9, 10, 27};
        var search = new BinarySearch();

        int result = search.binarySearch(items, 9);
        if(result != -1)
            System.out.println("items is found at index  "+ result);
        else
            System.out.println("Element not found");

        //Linked List Implementation
        var listItems = new LinkedList();
        listItems.addFirst(10);
        listItems.addLast(20);
        listItems.addLast(20);
        listItems.display();
    }
}
