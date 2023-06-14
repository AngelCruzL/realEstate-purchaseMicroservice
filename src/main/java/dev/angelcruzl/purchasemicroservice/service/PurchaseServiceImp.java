package dev.angelcruzl.purchasemicroservice.service;

import dev.angelcruzl.purchasemicroservice.model.Purchase;
import dev.angelcruzl.purchasemicroservice.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImp implements PurchaseService {
  @Autowired
  private PurchaseRepository purchaseRepository;

  @Override
  public Purchase savePurchase(Purchase purchase) {
    purchase.setPurchaseDate(LocalDateTime.now());

    return purchaseRepository.save(purchase);
  }

  @Override
  public List<Purchase> findAllPurchasesFromUser(Long userId) {
    return purchaseRepository.findAllByUserId(userId);
  }
}
