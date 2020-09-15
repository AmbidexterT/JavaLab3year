package com.itmo;


import com.itmo.sync.Bank;
import com.itmo.sync.BankThread;

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
public class Main2 {
    public static void main(String[] args) {
        System.out.println("Task");
        task();

}
private static void task() {
        Bank bankMain = new Bank();
        Thread threadOne = new BankThread(bankMain, 100, 2000);
        threadOne.setName("ThreadOne");
        threadOne.setPriority(Thread.MAX_PRIORITY);
        //threadOne.start();
        Thread threadTwo = new BankThread(bankMain, 50, 300);
        threadTwo.setName("ThreadTwo");
        threadTwo.setPriority(Thread.MAX_PRIORITY);

        threadOne.start();
        threadTwo.start();

        System.out.println("Main thread end: " + Thread.currentThread().getName());

    }
    }


