package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class user1Record {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;

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

    @Override
    public String toString() {
        return "user1Record{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    //Many to one
    @ManyToOne(cascade = CascadeType.ALL)
    private UserRecord record;

    public UserRecord getRecord() {
        return record;
    }

    public void setRecord(UserRecord record) {
        this.record = record;
    }
}
