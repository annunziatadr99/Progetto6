package Esercizio;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private int id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products;
    private Customer customer;

    public Order(int id, String status, LocalDate orderDate, LocalDate deliveryDate, List<Product> products, Customer customer){
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.products = products;
        this.customer = customer;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public LocalDate getOrderDate(){
        return orderDate;
    }
    public void setOrderDate(LocalDate orderDate){
        this.orderDate = orderDate;
    }
    public LocalDate getDeliveryDate(){
        return deliveryDate;
    }
    public void setDeliveryDate(LocalDate deliveryDate){
        this.deliveryDate = deliveryDate;
    }
    public List<Product> getProducts(){
        return products;
    }
    public  void setProducts(List<Product> products){
        this.products = products;
    }
    public Customer getCustomer(){
        return customer;
    }
    public  void setCustomer(Customer customer){
        this.customer = customer;
    }
}
