package com.elvan.bookStore.service;

import com.elvan.bookStore.repository.projection.IPurchaseItem;
import com.elvan.bookStore.model.PurchaseHistory;

import java.util.List;

public interface IPurchaseHistoryService
{
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
