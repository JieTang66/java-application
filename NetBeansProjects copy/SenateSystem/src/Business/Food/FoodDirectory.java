/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Food;
import Business.Client.*;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class FoodDirectory {

    private ArrayList<Food> foodList;

    public FoodDirectory() {
        foodList = new ArrayList();
    }

    public ArrayList<Food> getFoodList() {
        return foodList;
    }
    
    public Food createFood(String fod){
        Food food = new Food();
        food.setFood(fod);
        foodList.add(food);
        return food;
    }

    public ArrayList<Food> addFood() {
        Food food = new Food();
        foodList.add(food);
        return foodList;
    }
}
