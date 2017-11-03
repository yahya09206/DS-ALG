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

    //modify list method new
    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyGroceryItem(position, newItem);
        }

    }
    //old modify function
    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    //new remove method
    public void removeItem(String item){
        int position = findItem(item);
        if(position >= 0){
            removeItem(position);
        }
    }


    //remove item from list method
    private void removeItem(int position){
        groceryList.remove(position);
    }

    //find items method modified
    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >= 0){
            return true;
        }
        return false;
    }
}
