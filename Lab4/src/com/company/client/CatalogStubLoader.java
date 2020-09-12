package com.company.client;

import com.company.stockList.Category;
import com.company.stockList.FoodItem;
import com.company.stockList.GenericItem;
import com.company.warehouse.ItemCatalog;

import java.util.Date;

public class CatalogStubLoader implements CatalogLoader {
    @Override
    public void load(ItemCatalog catalog) {
        GenericItem item1 = new GenericItem("Sony TV",23000, Category.GENERAL);
        FoodItem item2 = new FoodItem("Bread",12,null,new Date(),(short)10);
        catalog.addItem(item1);
        catalog.addItem(item2);

    }
}
