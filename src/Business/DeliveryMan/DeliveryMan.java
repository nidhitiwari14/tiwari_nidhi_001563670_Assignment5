/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import RestaurantOrder.RestaurantOrder;
import RetaurantMenu.RestaurantMenu;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    private String name;
    private String firstName;
    private String lastName;
    private String UserName;
    private int id;
    private int deliId;
    private static int count = 1001;
    private static int deliCount = 101;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeliId() {
        return deliId;
    }

    public void setDeliId(int deliId) {
        this.deliId = deliId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        DeliveryMan.count = count;
    }

    public static int getDeliCount() {
        return deliCount;
    }

    public static void setDeliCount(int deliCount) {
        DeliveryMan.deliCount = deliCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
    
    private ArrayList<RestaurantOrder> orderList;

    public ArrayList<RestaurantOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<RestaurantOrder> orderList) {
        this.orderList = orderList;
    }
    
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    
    public DeliveryMan(String UserName){
        this.UserName=UserName;
        orderList = new ArrayList<RestaurantOrder>();
        deliId = deliCount;
        deliCount++;
    }
    
    public DeliveryMan(){
        orderList = new ArrayList<RestaurantOrder>();
        deliId = deliCount;
        deliCount++;
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
        id = count;
        count++;
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

    private String contact;
    private String address;
    private String city;
    private String state;
    private String emailId;
    
    @Override
    public String toString() {
        return name;
    }
}
