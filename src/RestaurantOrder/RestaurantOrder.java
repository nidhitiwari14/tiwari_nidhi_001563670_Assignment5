/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestaurantOrder;

import Business.Customer.Customer;
import Business.Restaurant.Restaurant;
import Business.WorkQueue.WorkRequest;
import RetaurantMenu.RestaurantMenu;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author nidhitiwari
 */
public class RestaurantOrder extends WorkRequest {
    private String orderID = UUID.randomUUID().toString();
    private String restaurentName;
    private String customerName;
    private Customer customer;
    private String deliveryAddress;
    private Restaurant restaurant;
    private String deliveryMan;
    private int quantity;
    private Double price;
//    private RestaurantMenu menu;
    private ArrayList<RestaurantMenu> RestaurantOrder;

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    
    public String getRestaurentName() {
        return restaurentName;
    }

    public void setRestaurentName(String restaurentName) {
        this.restaurentName = restaurentName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public String getDeliveryMan() {
        return deliveryMan;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
//    public ArrayList<RestaurantMenu> getRestaurantOrder() {
//        return RestaurantOrder;
//    }
//
//    public void setRestaurantOrder(ArrayList<RestaurantMenu> Order) {
//        this.RestaurantOrder = Order;
//    }
    
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void setDeliveryMan(String deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

//    public RestaurantMenu getMenu() {
//        return menu;
//    }
//
//    public void setMenu(RestaurantMenu menu) {
//        this.menu = menu;
//    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public boolean isAssign() {
        return assign;
    }

    public void setAssign(boolean assign) {
        this.assign = assign;
    }
    
    public ArrayList<RestaurantMenu> getRestaurantOrder() {
        return RestaurantOrder;
    }

    public void setRestaurantOrder(ArrayList<RestaurantMenu> Order) {
        this.RestaurantOrder = Order;
    }
    private String orderStatus;
    private boolean assign;
    
    @Override
    public String toString() {
        return orderID;
    }
}
