package com.company.user_link_list;

import java.util.Scanner;

public class Item {
    private String item_name;
    private String item_manufacturer;
    private String model_number;
    private String item_address;


    Item(String item_name, String item_manufacturer, String model_number, String item_address){
        this.item_name = item_name;
        this.item_manufacturer = item_manufacturer;
        this.model_number = model_number;
        this.item_address = item_address;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_manufacturer() {
        return item_manufacturer;
    }

    public void setItem_manufacturer(String item_manufacturer) {
        this.item_manufacturer = item_manufacturer;
    }

    public String getModel_number() {
        return model_number;
    }

    public void setModel_number(String model_number) {
        this.model_number = model_number;
    }

    public String getItem_address() {
        return item_address;
    }

    public void setItem_address(String item_address) {
        this.item_address = item_address;
    }

    public String getItem_name() {
        return item_name;
    }

    public String toString(){
        return  ".......................................... \n"+
                "Item Name               " + item_name +"\n"+
                "Item Manufacturer              "+ item_manufacturer+ "\n" +
                "Model number                "+ model_number+"\n"+
                "Item address               "+item_address;
    }

}
