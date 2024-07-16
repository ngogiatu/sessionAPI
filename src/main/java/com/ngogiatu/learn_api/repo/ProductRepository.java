package com.ngogiatu.learn_api.repo;

import com.ngogiatu.learn_api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created at 16/07/2024 by Ngo Tu
 *
 * @author: Ngo Tu
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
