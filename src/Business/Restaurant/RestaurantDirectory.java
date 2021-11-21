/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import RetaurantMenu.RestaurantMenu;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private ArrayList<Restaurant> restaurantList;
    private Restaurant restaurant;
    private RestaurantMenu menu;
    
    
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
    
     public Restaurant createRestaurantInfo(String restaurantName, String username, String address,String contact){
        Restaurant restaurant = new Restaurant();
        restaurant.setAdminUserName(username);
        restaurant.setRestaurantName(restaurantName);
        restaurant.setRestaurantContact(contact);
        restaurant.setRestaurantAddress(address);
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
    
//    public void deleteRestaurant(Restaurant restaurant){
//        restaurantList.remove(restaurant); 
//    }
    
    public void updateRestaurantInfo(Restaurant restro,String restaurantName,String contact,String address){
        restro.setRestaurantName(restaurantName);
        restro.setRestaurantAddress(address);
        restro.setRestaurantContact(contact);
    }
    
    public RestaurantMenu AddMenuItems(Restaurant restro,String dishName,Double price){
        menu=new RestaurantMenu(dishName, price);
        restro.addDishes(menu);
        return menu;
    }
    
    public void DeleteDishes(Restaurant restro,RestaurantMenu menu){
        restro.removeDishes(menu);
        
    }
    
    public void deleteRestaurant(String username){
        for(int i=0;i<restaurantList.size();i++){
            if(restaurantList.get(i).getAdminUserName().equals(username)){
                restaurantList.remove(i);
            }
        }
    }
    
    public void deleteRestaurant(){
        for(int i=0;i<restaurantList.size();i++){
            restaurantList.remove(i);
        }
    }
    
    
}
