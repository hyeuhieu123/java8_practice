package bussiness;

import entity.Order;

import java.util.List;
import java.util.Scanner;

public interface IOrderBusiness {
    void addOrder(Scanner sc);
    void displayOrders();
    void updateOrderStatus(Scanner scanner);
    List<Order> getOrderOverdue();
//    default double getTotalRevenue()
//default double getTotalRevenue(List orders){
//
//};



}
