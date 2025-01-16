import Esercizio.Customer;
import Esercizio.GestioneSteam;
import Esercizio.Order;
import Esercizio.Product;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//creazione Prodotti
       Product p1 = new Product(1,"Book1","Books",12);
        Product p2 = new Product(2,"Book2","Books",8);
        Product p3 = new Product(3,"Book3","Baby",15);
        Product p4 = new Product(4,"Book4","Baby",17);
        Product p5 = new Product(5,"Book5","Boys",20);
        Product p6 = new Product(6,"Book6","Boys",12);

        List<Product>products = Arrays.asList(p1,p2,p3,p4,p5,p6);

        //Creazione Clienti
        Customer c1 = new Customer(1,"Pino Daniele",1);
        Customer c2 = new Customer(1,"Gigi D'Alessio",2);
        Customer c3 = new Customer(1,"Enzo Avitabile",3);

        //Creazione Ordini
        Order o1 = new Order(1,"Confirmed",LocalDate.of(2021,2,15),LocalDate.of(2021,2,20), Arrays.asList(p1, p2),c1);
        Order o2 = new Order(2,"Confirmed",LocalDate.of(2021,2,16),LocalDate.of(2021,2,18), Arrays.asList(p3, p5),c2);
        Order o3 = new Order(3,"Confirmed",LocalDate.of(2021,2,13),LocalDate.of(2021,2,26), Arrays.asList(p4, p6),c3);

        //Test funzionamento

        System.out.println("Prodotti Books > 100: ");
        GestioneSteam.getProductBook100(products).forEach(product-> System.out.println(product.getName()));

        System.out.println("Ordini con prodotti Baby:");
        GestioneSteam.getOrderProductBaby(orders).forEach(order -> System.out.println(order.getId()));

        System.out.println("Prodotti Boys con sconto:");
        GestioneSteam.getOrderProductBoys(products).forEach(product -> System.out.println(product.getName() + " - " + product.getPrice()));

        System.out.println("Prodotti ordinati da clienti Tier 2 tra 01-Feb-2021 e 01-Apr-2021:");
        GestioneSteam.getOrderCustomerTier(Order).forEach(product -> System.out.println(product.getName()));



    }
}