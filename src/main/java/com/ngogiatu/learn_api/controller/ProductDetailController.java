package com.ngogiatu.learn_api.controller;

import com.ngogiatu.learn_api.repo.ProductDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created at 18/07/2024 by Ngo Tu
 *
 * @author: Ngo Tu
 */
@CrossOrigin("http://localhost:4200/")
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/product-detail")
public class ProductDetailController {
    private final ProductDetailRepository prdrepo;

    @GetMapping("get-all")
    public ResponseEntity<?> getAllDetail(){
        return new ResponseEntity<>(prdrepo.findAll(), HttpStatus.OK);
    }
}
