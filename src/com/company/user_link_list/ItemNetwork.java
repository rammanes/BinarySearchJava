package com.company.user_link_list;

import java.util.Scanner;

public class ItemNetwork {
    private LinkedList itemList = new LinkedList();
    Scanner input = new Scanner(System.in);

    private Item createNewItem(){
        System.out.println("Create a new item");
        System.out.print("Enter item name:  ");
        var name= input.nextLine();
        System.out.print("Enter item manufacturer:  ");
        var manufacturer= input.nextLine();
        System.out.print("Enter item address:  ");
        var address= input.nextLine();
        System.out.print("Enter item model:  ");
        var model= input.nextLine();

        var item = new Item(name,manufacturer,model, address);
        return item;
    }

    public void createItemAtFirstLocation(){
        var new_item = createNewItem();
        itemList.addFirst(new_item);
    }
    public void createItemAtLastLocation(){
        var new_item = createNewItem();
        itemList.addLast(new_item);
    }

    public void searchItem(String item_name){
        boolean result = itemList.cotains(item_name);
        if (result)
            System.out.println("item is exist in Library");
        else
            System.out.println("item not found");
    }

    public void displayItems(){
        itemList.display();
    }
}
