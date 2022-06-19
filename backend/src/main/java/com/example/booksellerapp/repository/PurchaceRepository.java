package com.example.booksellerapp.repository;

import java.util.List;

import com.example.booksellerapp.entity.Purchase;
import com.example.booksellerapp.entity.PurchaseItem;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PurchaceRepository {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> getAllPurchasesItemsOfUser(String userId);
}
