package com.example.booksellerapp.service;

import java.util.List;

import com.example.booksellerapp.entity.Purchase;
import com.example.booksellerapp.entity.PurchaseItem;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> getAllPurchasesItemsOfUser(String userId);
}
