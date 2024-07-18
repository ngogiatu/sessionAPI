package com.ngogiatu.learn_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created at 18/07/2024 by Ngo Tu
 *
 * @author: Ngo Tu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "productdetail")
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "productid")
    private Product product;

    private Double price;

    private Integer size;

    private String color;
}
