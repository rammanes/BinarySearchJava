package com.company;

import com.company.user_link_list.ItemNetwork;
import com.company.user_link_list.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var itemNetwork = new ItemNetwork();

        itemNetwork.createItemAtFirstLocation();
        itemNetwork.displayItems();
        itemNetwork.searchItem("samsung");
    }
}
