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
}
