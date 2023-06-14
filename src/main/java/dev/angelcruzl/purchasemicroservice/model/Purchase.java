package dev.angelcruzl.purchasemicroservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "purchases")
public class Purchase {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "user_id", nullable = false)
  private Long userId;

  @Column(name = "property_id", nullable = false)
  private Long propertyId;

  @Column(name = "title", nullable = false)
  private String title;

  @Column(name = "price", nullable = false)
  private Double price;

  @Column(name = "purchase_date", nullable = false)
  private LocalDateTime purchaseDate;
}
