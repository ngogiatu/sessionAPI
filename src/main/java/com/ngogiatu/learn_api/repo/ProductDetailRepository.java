package com.ngogiatu.learn_api.repo;

import com.ngogiatu.learn_api.entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created at 18/07/2024 by Ngo Tu
 *
 * @author: Ngo Tu
 */
public interface ProductDetailRepository extends JpaRepository<ProductDetail, Long> {
}
