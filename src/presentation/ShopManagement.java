package presentation;

import bussiness.CustomerBusiness;
import bussiness.OrderBusiness;
import entity.Customer;
import entity.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopManagement {
        public static List<Customer> listCustomer = new ArrayList<>();
        public static List<Order> listOrder =new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerBusiness customerBusiness = new CustomerBusiness();
        OrderBusiness orderBusiness= new OrderBusiness();

        while (true){
            System.out.println("--------------SHOP MENU-----------");
            System.out.println("1. quan ly khach hang");
            System.out.println("2. quan ly don hang ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    boolean isRunningC= true;
                    do {
                        System.out.println("----Customer Menu-------");
                        System.out.println("1. danh sach khach hang ");
                        System.out.println("2. them moi khach hang ");
                        System.out.println("3. thoat");
                        int option =Integer.parseInt(sc.nextLine());
                        switch (option){
                            case 1:
                                customerBusiness.displayCustomers();
                                break;
                            case 2:
                                customerBusiness.addCustomer(sc);


                                break;
                            case 3:
                                isRunningC=false;
                                break;
                        }
                    }while(isRunningC);
                    break;

                case 2:
                    boolean isRunningO= true;
                    do {
                        System.out.println("----Order Menu-------");
                        System.out.println("1. ds don hang ");
                        System.out.println("2. them moi don hang  ");
                        System.out.println("3. cap nhat don hang ");
                        System.out.println("4. so luong don hang da giao");
                        System.out.println("7. thoat");
                        int option =Integer.parseInt(sc.nextLine());
                        int sum=0;
                        switch (option){
                            case 1:
                                orderBusiness.displayOrders();
                                break;
                            case 2:
                                orderBusiness.addOrder(sc);
                                break;
                            case 3:

                                orderBusiness.updateOrderStatus(sc);
                                break;
                            case 4:
                                long count=   listOrder.stream().filter(o ->o.isStatus()).count();
                                System.out.println(count);
                                break;
                            case 5:
                                 sum=0;
                                listOrder.stream().filter(o ->o.isStatus()).forEach(o -> sum +=o.getTotalAmount());
                                break;
                            case 7:
                                isRunningO=false;
                                break;
                        }
                    }while(isRunningO);
                    break;
            }
        }

    }
}
