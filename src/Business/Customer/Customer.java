/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import RestaurantOrder.RestaurantOrder;
import RetaurantMenu.RestaurantMenu;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String contact;
    private String address;
    private String city;
    private String state;
    private String emailId;
    private String username;
    private int id = 1001;
    private int custId = 101;
    private static int count = 1001;
    private static int custCount = 101;

    private ArrayList<RestaurantOrder> orderList;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public ArrayList<RestaurantOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<RestaurantOrder> order) {
        this.orderList = order;
    }
    
    public Customer(String username){
        this.username=username;
        orderList=new ArrayList<RestaurantOrder>();
        custId++;
    }
    
    public Customer(){
        orderList = new ArrayList<RestaurantOrder>();
        custId++;
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
        orderList.add(order);
        id++;
//        id = count;
//        count++;
    }
    
    
    @Override
    public String toString() {
        return firstName;
    }
}
