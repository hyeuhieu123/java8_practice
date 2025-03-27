package entity;

import java.util.Optional;
import java.util.Scanner;

public class Customer implements IApp {
    private static  int autoId=0;
    private int id;
    private String name;
    private Optional<String> email;

    public Customer( String name, Optional<String> email) {

        this.name = name;
        this.email = email;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }



    @Override
    public void inputData(Scanner sc) {
        this.id = ++autoId;
        System.out.println("nhap ten kh ");
        this.name=sc.nextLine();
        System.out.println("nhap email kh");
        this.email = Optional.of(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email=" + email.get() +
                '}';
    }
}
