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
    private int id;
    private static int count = 1;
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
    
    public Customer() {
            id = count;
            count++;
    }
    
    public void addOrder(String restaurentName, String customerName, String deliveryMan, ArrayList<RestaurantMenu> Order, String cost, String deliveryAddress) {
        RestaurantOrder order=new RestaurantOrder();
        order.setOrderID(String.valueOf(id));
        order.setCustomerName(customerName);
        order.setRestaurentName(restaurentName);
        order.setDeliveryMan(deliveryMan);
        order.setRestaurantOrder(Order);
        order.setCost(cost);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
        id++;
    }
    
    
    @Override
    public String toString() {
        return firstName;
    }
}
