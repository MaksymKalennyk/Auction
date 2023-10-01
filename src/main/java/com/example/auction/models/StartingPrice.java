package com.example.auction.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "startingPrice")
public class StartingPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int price;
}
