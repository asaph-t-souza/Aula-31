package com.t3.onetomanybi.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="product_bi")
@Getter @Setter @NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int price;

    private int quantity;

    //Lado Dono
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cart_id")
    private Cart myCart;

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }
    
}

