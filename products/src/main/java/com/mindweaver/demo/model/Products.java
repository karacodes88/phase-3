package com.mindweaver.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;


    private String brand;


    private String size;


    private double price;


    private String stock;


    private int quantity;
}
