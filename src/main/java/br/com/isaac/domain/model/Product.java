package br.com.isaac.domain.model;

import br.com.isaac.domain.enums.ProductStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@Entity
public class Product {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(updatable = false, nullable = false, name = "id", columnDefinition = "CHAR(36)")
    private UUID id;
    private String name;
    private BigDecimal price;
    private String description;
    private Integer stockQuantity;
    private ProductStatus status;
    private Instant createdAt;
    private Instant updatedAt;

}
