package com.example.RelationalMapping.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    String address;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_item")
//    @JoinTable(name="Customer_item",joinColumns = {@JoinColumn(name = "Customer_id")},
//    inverseJoinColumns = {@JoinColumn(name = "Items_id")})
//    private Items items;
//
//    public Items getItems() {
//        return items;
//    }
//
//    public void setItems(Items items) {
//        this.items = items;
//    }
//
//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "customer")
//    private List<Items> items = new ArrayList<>();
//
//    public List<Items> getItems() {
//        return items;
//    }
//
//    public void setItems(List<Items> items) {
//        this.items = items;
//    }
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Items> items = new HashSet<>();

    public Set<Items> getItems() {
        return items;
    }

    public void setItems(Set<Items> items) {
        this.items = items;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}
