package bussiness;

import entity.Customer;

import java.util.Scanner;

import static presentation.ShopManagement.listCustomer;

public class CustomerBusiness {
    public static void  addCustomer(Scanner sc){
        Customer newCustomer = new Customer();
        newCustomer.inputData(sc);
        listCustomer.add(newCustomer);

    }
    public static void displayCustomers(){
        for (Customer ctm : listCustomer){
            System.out.println(ctm);
        }
    }
}
