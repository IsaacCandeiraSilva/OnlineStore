package br.com.isaac.api.controller;

import br.com.isaac.api.dto.ProductRequest;
import br.com.isaac.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping()
    public ResponseEntity create(@RequestBody() ProductRequest request) {
        service.createProduct(request);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity save(
            @PathVariable("id")
            Long id,
            @RequestBody()
            ProductRequest request) {
        return ResponseEntity.ok().build();
    }


}
