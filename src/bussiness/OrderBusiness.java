package bussiness;

import entity.Customer;
import entity.Order;

import java.util.List;
import java.util.Scanner;

import static presentation.ShopManagement.listCustomer;
import static presentation.ShopManagement.listOrder;

public class OrderBusiness implements IOrderBusiness {
    @Override
    public void    addOrder(Scanner sc) {


        Order  newOrder = new Order();
        newOrder.inputData(sc);
        listOrder.add(newOrder);

    }


    @Override
    public void displayOrders() {
        for (Order o : listOrder){
            System.out.println(o);
        }
    }

    @Override
    public void updateOrderStatus(Scanner sc) {
        System.out.println("nhap ma don hang ");
        int idO = Integer.parseInt(sc.nextLine());
        System.out.println("nhap trang thai");

        listOrder.stream().filter(o -> o.getId() == idO ).findFirst().ifPresent(o->o.setStatus(Boolean.parseBoolean(sc.nextLine())));


    }

    @Override
    public List<Order> getOrderOverdue() {
        return List.of();
    }
}
