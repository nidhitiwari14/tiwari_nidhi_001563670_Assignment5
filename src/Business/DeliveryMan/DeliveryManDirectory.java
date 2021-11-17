/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> deliveryManList;
    
    public DeliveryManDirectory(){
        deliveryManList = new ArrayList<DeliveryMan>();
    }
    
    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(ArrayList<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
    
    public DeliveryMan createDeliveryMan(
            String firstName, 
            String lastName, 
            String contact,
            String address,
            String city,
            String state,
            String emailId){
        
        DeliveryMan deliveryMan = new DeliveryMan();
        deliveryMan.setFirstName(firstName);
        deliveryMan.setLastName(lastName);
        deliveryMan.setAddress(address);
        deliveryMan.setContact(contact);
        deliveryMan.setCity(city);
        deliveryMan.setEmailId(emailId);
        deliveryMan.setState(state);
        deliveryManList.add(deliveryMan);
        return deliveryMan;
    }
    
    public DeliveryMan getDeliveryMan(String firstName){
        for(DeliveryMan deliveryMan: deliveryManList){
            if(deliveryMan.getFirstName().equalsIgnoreCase(firstName)){
                return deliveryMan;
            }
        }
        return null;
    }
    
    public void deleteDeliveryMan(DeliveryMan deliveryMan){
        deliveryManList.remove(deliveryMan);
    }
}
