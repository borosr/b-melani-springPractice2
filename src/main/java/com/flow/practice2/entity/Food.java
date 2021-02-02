package com.flow.practice2.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Food {

    @Id
    private final String id;
    private final String name;
    private final String description;
    private final Double price;
//    @JsonIgnore
//    @ManyToMany
//    @JoinTable(
//            name = "ordered_food",
//            joinColumns = @JoinColumn(name = "food_id"),
//            inverseJoinColumns = @JoinColumn(name = "order_id"))
//    private List<Order> orders;


    public Food(String id, String name, String description, Double price
               //, List<Order> orders
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        //this.orders = orders;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

//    public List<Order> getOrders() {
//        return orders;
//    }

    @Override
    public String toString() {
        return "Food{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
              //  ", orders=" + orders +
                '}';
    }
}
