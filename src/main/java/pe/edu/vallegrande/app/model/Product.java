package pe.edu.vallegrande.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table("product")
public class Product {
    @Id
    private Long id;
    
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stock;
    private String category;
    private String barcode;
    private String status;
    
    @Column("created_at")
    private LocalDateTime createdAt;
}
