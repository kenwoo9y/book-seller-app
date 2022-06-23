package com.example.booksellerapp.controller;

import java.nio.file.attribute.UserPrincipal;

import com.example.booksellerapp.entity.Purchase;
import com.example.booksellerapp.service.PurchaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/purchase")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @PostMapping
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase) {
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllPurchasesItemsOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal) {
        return ResponseEntity.ok(purchaseService.getAllPurchasesItemsOfUser(userPrincipal.getId()));
    }
}
