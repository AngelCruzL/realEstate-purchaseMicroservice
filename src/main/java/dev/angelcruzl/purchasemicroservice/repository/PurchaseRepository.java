package dev.angelcruzl.purchasemicroservice.repository;

import dev.angelcruzl.purchasemicroservice.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
  List<Purchase> findAllByUserId(Long userId);
}
