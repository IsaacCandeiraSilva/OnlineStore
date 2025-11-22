package br.com.isaac.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductRequest {
    String name;
    String description;
    BigDecimal price;
    Integer stockQuantity;
}
