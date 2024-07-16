package com.ngogiatu.learn_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created at 16/07/2024 by Ngo Tu
 *
 * @author: Ngo Tu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "product")

public class Product {
    // tên thuộc tính cảu đối tượng chỉ viết thường
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // khóa chính

    private String productname; // tên sản phẩm

    private Double price; // giá sản phẩm

    private LocalDateTime createat; // ngày tạo
}
