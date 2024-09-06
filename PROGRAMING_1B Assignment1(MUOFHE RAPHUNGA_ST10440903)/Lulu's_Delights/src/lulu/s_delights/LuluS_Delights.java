/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lulu.s_delights;
 import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class LuluS_Delights {

    public static void main(String[] args) {
        
        MenuItem cake1 = new MenuItem("Red Velvet Cake", 5.00, "Cake");
        MenuItem cake2 = new MenuItem("Black Forest Cake", 6.50, "Cake");
        MenuItem dessert1 = new MenuItem("Chocolate Mousse", 4.00, "Dessert");
        MenuItem dessert2 = new MenuItem("Cheesecake", 5.25, "Dessert");

        
        MenuItem[] menu = {cake1, cake2, dessert1, dessert2};

       //New order
        Order customerOrder = new Order();
        Scanner scanner = new Scanner(System.in);
        boolean ordering = true;

        // Ordering
        while (ordering) {
            System.out.println("---- LULU'S DELIGHTS MENU ----");
            for (int i = 0; i < menu.length; i++) {
                System.out.print((i + 1) + ". ");
                menu[i].displayItem();
            }

            System.out.println("Enter the number of the item you want to order (or 0 to finish): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                ordering = false;
            } else if (choice > 0 && choice <= menu.length) {
                customerOrder.addItem(menu[choice - 1]);
                System.out.println(menu[choice - 1].getName() + " has been added to your order.");
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }

        //display
        customerOrder.displayOrder();
    }
}
 
 
    

