package com.company;
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
    }
}
