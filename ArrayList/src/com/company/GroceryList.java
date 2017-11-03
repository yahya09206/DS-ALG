package com.company;

import java.util.ArrayList;

public class GroceryList {

    //declare new array list
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item){
        //Add element to array list
        groceryList.add(item);
    }

    //print list method
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " in your grocery list");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i + 1) + ", " + groceryList.get(i));
        }
    }

    //modify list method
    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    //remove item from list method
    public void removeItem(int position){
        String theItem = groceryList.get(position-1);
        groceryList.remove(position);
    }

    //find items method
    public String findItem(String searchItem){
//        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position >= 0){
            return groceryList.get(position);
        }
        return null;
    }
}
