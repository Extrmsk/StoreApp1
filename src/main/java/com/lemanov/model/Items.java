package com.lemanov.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by Extr on 16.12.2016.
 */

@Entity
public class Items {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int price;
    private int amount;

    @OneToOne
    private Groups group;

    public Items() {}

    public Items(String name, int price, int amount, Groups group) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.group = group;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    public Groups getGroup() {
        return group;
    }

    public void setGroup(Groups group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", groupID=" + group.getId() +
                '}';
    }
}
