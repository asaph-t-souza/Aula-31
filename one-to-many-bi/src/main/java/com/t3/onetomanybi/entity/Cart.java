package com.t3.onetomanybi.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cart_bi")
@Getter @Setter @NoArgsConstructor
public class Cart {

    @Id
    @GeneratedValue
    private Long id;

    private String color;

    //Lado Inverso
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "myCart")
    private Set<Product> cartProducts;

    public void add(Product product){
        if(product != null){
            if(cartProducts == null){
                cartProducts = new HashSet<>();
            }

            cartProducts.add(product);
        }
    }

    @Override
    public String toString() {
        return "Cart [id=" + id + ", color=" + color + "]";
    }

}

