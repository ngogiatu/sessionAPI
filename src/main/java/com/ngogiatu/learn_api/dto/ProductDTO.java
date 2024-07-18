package com.ngogiatu.learn_api.dto;

import com.ngogiatu.learn_api.entity.Product;
import com.ngogiatu.learn_api.entity.ProductDetail;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created at 18/07/2024 by Ngo Tu
 *
 * @author: Ngo Tu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {
    private Long id; // khóa chính

    private String productname; // tên sản phẩm

    // private Double price; // giá sản phẩm

    private List<ProdetailDTO> prodetailDTOS;

    private LocalDateTime createat; // ngày tạo

    public static ProductDTO productConvertToProductDTO(Product p){
        ProductDTO prdto = ProductDTO.builder()
                .id(p.getId())
                .productname(p.getProductname())
                .prodetailDTOS(p.getProductDetails().stream().map(ProdetailDTO::prdConvertToPrdDTO).toList())
                .createat(p.getCreateat())
                .build();

        return prdto;
    }
}
