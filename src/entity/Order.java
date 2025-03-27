package entity;

import java.time.LocalDate;
import java.util.Scanner;

import static presentation.ShopManagement.listCustomer;

public class Order implements IApp{
    private static int autoId=0;
    private int id;
    private Customer customer;
    private LocalDate orderDate;
    private double totalAmount;
    private boolean status;

    public Order() {
    }

    public Order( Customer customer, LocalDate orderDate, double totalAmount, boolean status) {

        this.customer = customer;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public Customer findId(int id){
        for (Customer ctm : listCustomer){
            if(ctm.getId() ==id){
                return ctm;
            }
        }
        return null;
    }
    @Override
    public void inputData(Scanner sc) {
        this.id = ++autoId;
        System.out.println("nhap id khach hang ");
        this.customer = findId(Integer.parseInt(sc.nextLine()));
        this.orderDate = LocalDate.now();
        System.out.println("nhap tong tien don hang ");
        this.totalAmount = Double.parseDouble(sc.nextLine());
        this.status=false;

    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer=" + customer.getId() +
                ", orderDate=" + orderDate +
                ", totalAmount=" + totalAmount +
                ", status=" + status +
                '}';
    }
}
