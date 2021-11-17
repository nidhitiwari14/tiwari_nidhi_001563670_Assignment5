/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import RestaurantOrder.RestaurantOrder;
import RetaurantMenu.RestaurantMenu;
import RetaurantMenu.RestaurantMenuDirectory;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantContact;
    private String restaurantManager;
    private RestaurantMenuDirectory restaurantMenuDirectory; 
    private ArrayList<RestaurantMenu> Menu;
    private ArrayList<RestaurantOrder> orderList;
    private String adminUserName;
    
    public Restaurant(String UserName) {
        this.adminUserName=UserName;
        Menu=new ArrayList<RestaurantMenu>();
        orderList=new ArrayList<RestaurantOrder>();
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }
    
    public String getAdminUserName() {
        return adminUserName;
    }

    public void setAdminUserName(String adminUName) {
        this.adminUserName = adminUName;
    }
    
    public ArrayList<RestaurantOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<RestaurantOrder> orderList) {
        this.orderList = orderList;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantContact() {
        return restaurantContact;
    }

    public void setRestaurantContact(String restaurantContact) {
        this.restaurantContact = restaurantContact;
    }

    public String getRestaurantManager() {
        return restaurantManager;
    }

    public void setRestaurantManager(String restaurantManager) {
        this.restaurantManager = restaurantManager;
    }

    public RestaurantMenuDirectory getRestaurantMenuDirectory() {
        return restaurantMenuDirectory;
    }

    public void setRestaurantMenuDirectory(RestaurantMenuDirectory restaurantMenuDirectory) {
        this.restaurantMenuDirectory = restaurantMenuDirectory;
    }
    
    public void addDishes(RestaurantMenu menu){
        
        Menu.add(menu);
    }
    
    public void removeDishes(RestaurantMenu menu){
        
        Menu.remove(menu);
    }
    
    @Override
    public String toString(){
        return restaurantName;
    }
}

