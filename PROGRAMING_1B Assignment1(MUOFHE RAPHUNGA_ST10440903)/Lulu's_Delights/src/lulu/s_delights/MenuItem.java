/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lulu.s_delights;
public class MenuItem {
     private String name;
    private double price;
    private String type;

    // Constructor to initialize MenuItem
    public MenuItem(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    // Display menu item details
    public void displayItem() {
        System.out.println(type + ": " + name + " R " + price);
    }
}

