package dev.angelcruzl.purchasemicroservice.controller;

import dev.angelcruzl.purchasemicroservice.model.Purchase;
import dev.angelcruzl.purchasemicroservice.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/purchases")
public class PurchaseController {
  @Autowired
  private PurchaseService purchaseService;

  @PostMapping
  public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase) {
    return new ResponseEntity<>(
      purchaseService.savePurchase(purchase), HttpStatus.CREATED
    );
  }

  @GetMapping("/{userId}")
  public ResponseEntity<?> findAllPurchasesFromUser(@PathVariable Long userId) {
    return ResponseEntity.ok(
      purchaseService.findAllPurchasesFromUser(userId)
    );
  }
}
