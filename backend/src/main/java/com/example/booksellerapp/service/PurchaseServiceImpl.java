package com.example.booksellerapp.service;

import java.time.LocalDateTime;
import java.util.List;

import com.example.booksellerapp.entity.Purchase;
import com.example.booksellerapp.entity.PurchaseItem;
import com.example.booksellerapp.repository.PurchaceRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class PurchaseServiceImpl implements PurchaseService {
    @Autowired
    private PurchaceRepository purchaceRepository;

    @Override
    public Purchase savePurchase(Purchase purchase) {
        purchase.setPurchaseDateTime(LocalDateTime.now());

        return purchaceRepository.savePurchase(purchase);
    }

    @Override
    public List<PurchaseItem> getAllPurchasesItemsOfUser(String userId) {
        return purchaceRepository.getAllPurchasesItemsOfUser(userId);
    }
}
