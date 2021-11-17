/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestaurantOrder;

import java.util.ArrayList;


/**
 *
 * @author nidhitiwari
 */
public class RestaurantOrderDirectory {
    private ArrayList<RestaurantOrder> orderList;
    
    public RestaurantOrderDirectory(){
       orderList = new ArrayList<RestaurantOrder>();
    }

    public ArrayList<RestaurantOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<RestaurantOrder> orderList) {
        this.orderList = orderList;
    }
    
    public RestaurantOrder createOrder(){
        RestaurantOrder order = new RestaurantOrder();
        orderList.add(order);
        return order;
    }
    
    public void deleteOrder(RestaurantOrder order){
        orderList.remove(order);
    }
    
    public RestaurantOrder getOrderID(String orderID){
        for(RestaurantOrder order: orderList){
            if(order.getOrderID() == orderID){
                return order;
            }
        }
        return null;
    }
}
