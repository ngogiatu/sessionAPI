package com.ngogiatu.learn_api.dto;

import com.ngogiatu.learn_api.entity.Product;
import com.ngogiatu.learn_api.entity.ProductDetail;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created at 18/07/2024 by Ngo Tu
 *
 * @author: Ngo Tu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProdetailDTO {
    private Long id;


    private Double price;

    private Integer size;

    private String color;

    public static ProdetailDTO prdConvertToPrdDTO(ProductDetail prd){
        ProdetailDTO prdPTO = ProdetailDTO.builder()
                .id(prd.getId())
                .price(prd.getPrice())
                .size(prd.getSize())
                .color(prd.getColor())
                .build();
        return prdPTO;
    }
}
