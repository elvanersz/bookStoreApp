package com.elvan.bookStore.service;

import com.elvan.bookStore.repository.IPurchaseHistoryRepository;
import com.elvan.bookStore.repository.projection.IPurchaseItem;
import com.elvan.bookStore.model.PurchaseHistory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseHistoryService implements IPurchaseHistoryService
{
    private final IPurchaseHistoryRepository purchaseHistoryRepository;

    public PurchaseHistoryService(IPurchaseHistoryRepository purchaseHistoryRepository)
    {
        this.purchaseHistoryRepository = purchaseHistoryRepository;
    }

    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory)
    {
        purchaseHistory.setPurchaseTime(LocalDateTime.now());

        return purchaseHistoryRepository.save(purchaseHistory);
    }

    @Override
    public List<IPurchaseItem> findPurchasedItemsOfUser(Long userId)
    {
        return purchaseHistoryRepository.findAllPurchasesOfUser(userId);
    }
}
