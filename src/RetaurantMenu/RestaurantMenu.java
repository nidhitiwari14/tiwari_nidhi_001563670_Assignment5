/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RetaurantMenu;

/**
 *
 * @author nidhitiwari
 */
public class RestaurantMenu {
    private String restaurantName;
    private String dishName;
    private double price;
    
    public RestaurantMenu(String dishName,Double price) {
        this.dishName=dishName;
        this.price=price;
    }
    
    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }
    
    public RestaurantMenu() {
    };
    
    @Override
    public String toString(){
        return dishName;
    }
}
