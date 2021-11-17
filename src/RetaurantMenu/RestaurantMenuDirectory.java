/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RetaurantMenu;

import java.util.ArrayList;

/**
 *
 * @author nidhitiwari
 */
public class RestaurantMenuDirectory {
    private ArrayList<RestaurantMenu> restaurantMenuList;
    
    public RestaurantMenuDirectory(){
        restaurantMenuList = new ArrayList();
    }

    public ArrayList<RestaurantMenu> getRestaurantMenuList() {
        return restaurantMenuList;
    }

    public void setRestaurantMenuList(ArrayList<RestaurantMenu> restaurantMenuList) {
        this.restaurantMenuList = restaurantMenuList;
    }
    
    public RestaurantMenu createRestaurantDish(String dishName, double price, String restaurantName){
        RestaurantMenu restaurantMenu = new RestaurantMenu();
        restaurantMenu.setDishName(dishName);
        restaurantMenu.setPrice(price);
        restaurantMenu.setRestaurantName(restaurantName);
        restaurantMenuList.add(restaurantMenu);
        return restaurantMenu;
    }
    
    public void deleteMenu(RestaurantMenu restaurantMenu){
        restaurantMenuList.remove(restaurantMenu);
    }
}
