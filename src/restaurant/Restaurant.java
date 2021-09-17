package restaurant;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
        MenuItem newItem1 = new MenuItem(14.99, "Garlic linguine", "Dinner", true);
        MenuItem newItem2 = new MenuItem(16.99, "USDA Prime Steak", "Dinner", false);
        MenuItem newItem3 = new MenuItem(12.99, "Delicious wings", "Appetizer", true);

        Date today = Calendar.getInstance().getTime();
        ArrayList<MenuItem> startingMenu = new ArrayList<>();

        Menu ourMenu = new Menu(today, startingMenu);

        ourMenu.addItem(newItem1);
        ourMenu.addItem(newItem2);
        ourMenu.addItem(newItem3);

        System.out.println("1. Print the entire, updated menu to the screen.");
        System.out.println("Code : ourMenu.printMenu();\n");
        ourMenu.printMenu();

        System.out.println("\n");
        System.out.println("2. Print an individual menu item to the screen.");
        System.out.println("Code : ourMenu.printItem(newItem2);\n");
        ourMenu.printItem(newItem2);

        System.out.println("\n");
        System.out.println("3. Delete an item from a menu, then reprint the menu.");
        System.out.println("ourMenu.removeItem(newItem2);");
        System.out.println("Code : ourMenu.printMenu();\n");
        ourMenu.removeItem(newItem2);
        ourMenu.printMenu();

        System.out.println("\n");
        System.out.println("Printing price and category:");
        System.out.println("System.out.printf(\"%s\", newItem2.getDescription);");
        System.out.println("System.out.printf(\"%s\", newItem2.getCategory);");
        System.out.println("System.out.printf(\"%.2f\", newItem2.getPrice);\n");
        System.out.printf("%s \n", newItem2.getDescription());
        System.out.printf("%s \n", newItem1.getCategory());
        System.out.printf("%.2f \n", newItem1.getPrice());
    }
}
