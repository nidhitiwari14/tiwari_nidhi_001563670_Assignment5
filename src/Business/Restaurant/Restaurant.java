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
    private int id = 1001;
//    private static int count = 1001;

    public ArrayList<RestaurantMenu> getMenu() {
        return Menu;
    }

    public void setMenu(ArrayList<RestaurantMenu> Menu) {
        this.Menu = Menu;
    }
    private ArrayList<RestaurantOrder> orderList;
    private String adminUserName;
    
    
    public Restaurant(String restaurantName, String username, String address,String contact) {
        this.adminUserName=username;
        this.restaurantName = restaurantName;
        this.restaurantAddress = address;
        this.restaurantContact = contact;
        Menu=new ArrayList<RestaurantMenu>();
        orderList=new ArrayList<RestaurantOrder>();
    }
    
    public Restaurant() {
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
    
    public void addOrder(String restaurantName, String customerName, String deliveryMan, ArrayList<RestaurantMenu> Order, Double price, String deliveryAddress) {
        RestaurantOrder order=new RestaurantOrder();
        order.setOrderID(String.valueOf(id));
        order.setCustomerName(customerName);
        order.setRestaurantName(restaurantName);
        order.setDeliveryMan(deliveryMan);
        order.setRestaurantOrder(Order);
        order.setPrice(price);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        order.setComment(" ");
        orderList.add(order);
        id++;
//        id = count;
//        count++;
    }
    
    @Override
    public String toString(){
        return restaurantName;
    }
}

