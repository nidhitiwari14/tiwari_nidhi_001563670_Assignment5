/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private ArrayList<Restaurant> restaurantList;
    private Restaurant restaurant;
    
    
    public RestaurantDirectory(){
        restaurantList = new ArrayList<Restaurant>();
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
    
//    public Restaurant createRestaurant(String restaurantName, String restaurantAddress, String restaurantContact, String restaurantManager){
//        Restaurant restaurant = new Restaurant();
//        restaurant.setRestaurantName(restaurantName);
//        restaurant.setRestaurantAddress(restaurantAddress);
//        restaurant.setRestaurantManager(restaurantManager);
//        restaurantList.add(restaurant);
//        return restaurant;
//    }
    
    public Restaurant createRestaurantInfo(String userName){
        restaurant= new Restaurant(userName);
        restaurantList.add(restaurant);
        
        return restaurant;
    }
    
    public Restaurant getRestaurant(String restaurantName){
    for(Restaurant restaurant: restaurantList){
        if(restaurant.getRestaurantName() == restaurantName){
            return restaurant;
        }
    }
    return null;
    }
    
    public void deleteRestaurant(Restaurant restaurant){
        restaurantList.remove(restaurant); 
    }
}
