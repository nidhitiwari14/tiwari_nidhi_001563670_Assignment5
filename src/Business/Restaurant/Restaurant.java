/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import RetaurantMenu.RestaurantMenuDirectory;

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
    
    public Restaurant(){     
    };

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
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
    
    @Override
    public String toString(){
        return restaurantName;
    }
}

