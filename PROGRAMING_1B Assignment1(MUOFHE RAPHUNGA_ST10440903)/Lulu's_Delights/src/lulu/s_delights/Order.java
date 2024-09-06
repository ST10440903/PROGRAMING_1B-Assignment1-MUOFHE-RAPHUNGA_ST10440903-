/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lulu.s_delights;
 import java.util.ArrayList;
/**
 *
 * @author RC_Student_lab
 */
public class Order {
   
    private ArrayList<MenuItem> orderItems;
    private double totalPrice; 

    // Constructor to initialize an empty order
    public Order() {
        orderItems = new ArrayList<>();
        totalPrice = 0.0;
    }

    // Add item to the order
    public void addItem(MenuItem item) {
        orderItems.add(item);
        totalPrice += item.getPrice();
    }

    // Display the order summary
    public void displayOrder() {
        System.out.println("---- Order Summary ----");
        for (MenuItem item : orderItems) {
            item.displayItem();
        }
        System.out.println("Total Price: R" + totalPrice);
    }

    // Get total price
    public double getTotalPrice() {
        return totalPrice;
    }
}


     

