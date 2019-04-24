/*
 * Copyright (c) RESONANCE JSC, 22.04.2019
 */

package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Dmitriy Bludov
 */

public class Receipt {
    private List<ReceiptItem> receiptItems = Collections.synchronizedList(new ArrayList<>());

    void addItem(ReceiptItem item) {
        if (!receiptItems.contains(item))
            receiptItems.add(item);
        else {
            ReceiptItem existingItem = receiptItems.get(receiptItems.indexOf(item));
            existingItem.addQuantity(item.getQuantity());
        }
    }

    void removeItem(int itemIndex) {
        receiptItems.remove(itemIndex);
    }

    void setItemQuantity(int itemIndex, float newQuantity){
        receiptItems.get(itemIndex).setQuantity(newQuantity);
    }
}
