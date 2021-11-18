/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author nidhi
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        this.customerList = new ArrayList<Customer>();
    }
    
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
   
    public Customer createCustomer(
         String firstName,
         String lastName,
         String contact,
         String address,
         String city,
         String state,
         String emailId,
         String username
    ){
        
        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setAddress(address);
        customer.setContact(contact);
        customer.setCity(city);
        customer.setState(state);
        customer.setEmailId(emailId);
        customer.setUsername(username);
        customerList.add(customer);
        return customer;
    }
    
    public Customer getCustomer(String firstName){
        for(Customer customer: customerList){
            if(customer.getFirstName().equalsIgnoreCase(firstName)){
                return customer;
            }
        }
        return null;
    }
    
    public void deleteCustomer(String username){
        for(int i=0;i<customerList.size();i++){
            if(customerList.get(i).getUsername().equals(username)){
                customerList.remove(i);
            }
        }
    }
}
