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
    
    
}
