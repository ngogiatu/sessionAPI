package com.ngogiatu.learn_api.controller;

import com.ngogiatu.learn_api.entity.Product;
import com.ngogiatu.learn_api.repo.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Created at 16/07/2024 by Ngo Tu
 *
 * @author: Ngo Tu
 */
@RestController // câu hình đây là 1 controller trả về 1 đói tượng là file json
@RequestMapping("api/v1/product")// tạo base api cho lớp controller
@RequiredArgsConstructor // DI các phụ thuộc vào đối tượng private final giống @Autowired
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping("get-all")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(productRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("search/{id}")
    public ResponseEntity<?> search(
            //@RequestParam(required = false, defaultValue = "1") Long id
            @PathVariable long id
    ) throws Exception {
        // truyền dữ liệu qua đường dẫn bao gồm 2 loại
        // param : ?id=1
        // path variable /1
        return new ResponseEntity<>(productRepository.findById(id), HttpStatus.OK);
    }

    // Các request cơ bản
    // post là thêm
    // get lấy dữ liệu
    // put update
    // patch update 1 phần dữ liệu
    // delete xóa
    @PostMapping("save") // cấu hình đường dẫn lưu dữ liệu vào csdl
    public ResponseEntity<?> save(
            @RequestBody Product product // lấy dữ liệu từ body của request

            ) throws Exception {
        return new ResponseEntity<>(productRepository.save(product), HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> delete(
        @PathVariable long id
        ) throws Exception {
            Optional<Product> product = productRepository.findById(id);
            if (product.isEmpty()){
                return new ResponseEntity<>("Không có sp này", HttpStatus.BAD_REQUEST);
            }
            productRepository.delete(product.get());
            String message = "Oke";
            return new ResponseEntity<>(message, HttpStatus.OK);
    }

}
