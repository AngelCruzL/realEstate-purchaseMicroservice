package dev.angelcruzl.purchasemicroservice.service;

import dev.angelcruzl.purchasemicroservice.model.Purchase;

import java.util.List;

public interface PurchaseService {
  Purchase savePurchase(Purchase purchase);

  List<Purchase> findAllPurchasesFromUser(Long userId);
}
