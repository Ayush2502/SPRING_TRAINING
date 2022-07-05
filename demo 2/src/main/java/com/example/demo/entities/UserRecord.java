package com.example.demo.entities;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
@Table

public class UserRecord {

    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    int ph;

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

    public int getPh() {
        return ph;
    }

    public void setPh(int ph) {
        this.ph = ph;
    }

    @Override
    public String toString() {
        return "UserRecord{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                '}';
    }

    public UserRecord() {
        super();
    }

    public UserRecord save(UserRecord record1) {
        return record1;
    }


// one to one mapping
    @OneToOne(cascade = CascadeType.ALL)
    private user1Record user1;

    public user1Record getUser1() {
        return user1;
    }

    public void setUser1(user1Record user1) {
        this.user1 = user1;
    }

    // one to many
    @OneToMany(cascade = CascadeType.ALL)
    private List<user1Record> items;

    public List<user1Record> getItems() {
        return items;
    }

    public void setItems(List<user1Record> items) {
        this.items = items;
    }
}
