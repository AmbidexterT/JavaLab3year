package com.itmo;

import com.itmo.client.CatalogFileLoader;
import com.itmo.client.CatalogLoader;
import com.itmo.client.CatalogStubLoader;
import com.itmo.exceptions.CatalogLoadException;
import com.itmo.exceptions.ItemAlreadyExistsException;
import com.itmo.stockList.Category;
import com.itmo.stockList.GenericItem;
import com.itmo.sync.Bank;
import com.itmo.sync.BankThread;
import com.itmo.warehouse.ItemCatalog;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.logging.FileHandler;

import static java.lang.Thread.sleep;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Task1");
        task1();

        System.out.println("Task3");
        task3();

    }
    public static void task1() {
        ItemCatalog catalog = new ItemCatalog();
        CatalogLoader loader = new CatalogStubLoader();
        //CatalogFileLoader laud = new CatalogFileLoader("file.txt");
        try {
            loader.load(catalog);
           // laud.load(catalog);
            catalog.addItem(catalog.findItemByID(1));
        } catch (CatalogLoadException | ItemAlreadyExistsException ex) {
            ex.printStackTrace();
        }
         catalog.printItems();
    }

    public static void task3() {
        ItemCatalog catalog = new ItemCatalog();
        CatalogLoader catalogLoader = new CatalogFileLoader("file.txt");

        try {
            catalogLoader.load(catalog);
        } catch (CatalogLoadException ex) {
            ex.printStackTrace();
        }

        System.out.println(catalog);
    }

}
