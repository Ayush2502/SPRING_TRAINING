package com.example.RelationalMapping.Entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    boolean available;

    public Items() {
    }

    public Items(String name) {
        this.name = name;
    }

//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "items")
//    private List<Items>items;
//    @ManyToOne
//    @JoinColumn(name = "Customer_id")
//    private Customer customer;
//
//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }

    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "items")
    private Set<Customer> items = new HashSet<>();

    public Set<Customer> getItems() {
        return items;
    }

    public void setItems(Set<Customer> items) {
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
