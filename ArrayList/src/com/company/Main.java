package com.company;
import java.util.*;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("206543567");
//    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){

        }

    }


}

//    boolean quit = false;
//        int choice = 0;
//        printInstructions();
//        while(!quit){
//            System.out.println("Enter your choice: " );
//            choice = scanner.nextInt();
//            scanner.nextLine();
//
//            switch(choice){
//                case 0:
//                    printInstructions();
//                    break;
//                case 1:
//                    groceryList.printGroceryList();
//                    break;
//                case 2:
//                    addItem();
//                    break;
//                case 3:
//                    modifyItem();
//                    break;
//                case 4:
//                    removeItem();
//                    break;
//                case 5:
//                    searchForItem();
//                    break;
//                case 6:
//                    quit = true;
//                    break;
//            }
//        }
//
//    }
//
//    public static void printInstructions() {
//        System.out.println("\nPress ");
//        System.out.println("\t 0 - To print choice options.");
//        System.out.println("\t 1 - To print the list of grocery items.");
//        System.out.println("\t 2 - To add an item to the list.");
//        System.out.println("\t 3 - To modify an item in the list.");
//        System.out.println("\t 4 - To remove an item from the list.");
//        System.out.println("\t 5 - To search for an item in the list.");
//        System.out.println("\t 6 - To quit the application.");
//    }
//
//
//    public static void addItem(){
//        System.out.print("Please enter the grocery item: ");
//        groceryList.addGroceryItem(scanner.nextLine());
//    }
//
//    public static void modifyItem(){
//        System.out.print("Enter item name: ");
//        String itemNum = scanner.nextLine();
//        System.out.println("Enter replacement item: ");
//        String newItem = scanner.nextLine();
//        groceryList.modifyGroceryItem(itemNum, newItem);
//    }
//
//    public static void removeItem(){
//        System.out.print("Enter item name: ");
//        String itemNum = scanner.nextLine();
//        scanner.nextLine();
//        groceryList.removeItem(itemNum);
//    }
//
//    public static void searchForItem(){
//        System.out.println("Item to search for: ");
//        String searchItem = scanner.nextLine();
//        if(groceryList.onFile(searchItem)){
//            System.out.println("Found search item in our grocery list");
//        }else{
//            System.out.println("Search item is not in our list");
//        }
//    }
