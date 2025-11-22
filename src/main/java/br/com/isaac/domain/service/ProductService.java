package br.com.isaac.domain.service;

import br.com.isaac.api.dto.ProductRequest;
import br.com.isaac.api.dto.ProductResponse;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public void createProduct(ProductRequest request) {
        // Lógica para criar um produto
    }

    public void updateProduct(Long productId, ProductRequest request) {
        // Lógica para atualizar um produto
    }

    public void deleteProduct(Long productId) {
        // Lógica para deletar um produto
    }

    public List<ProductResponse> searchProducts(String name, BigDecimal minPrice, BigDecimal maxPrice) {
        // Lógica para buscar produtos com base nos critérios fornecidos
        return new ArrayList<>();
    }

    public ProductResponse findProductById(Long productId) {
        // Lógica para encontrar um produto por ID
        return new ProductResponse();
    }

}
