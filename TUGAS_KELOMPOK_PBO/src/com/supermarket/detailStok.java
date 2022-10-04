package com.supermarket;

public class detailStok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        detailProduk facewash;
        facewash = new detailProduk("Maju Jaya Supplier", "Jakarta", "Face Wash", 100000, 120000);
        detailProduk beverages;
        beverages = new detailProduk("Unilivir", "Denpasar", "Beverages", 20000, 25000);
        detailProduk food;
        food = new detailProduk("Mie Jaya", "Surabaya", "Food", 21000, 25000);
        detailProduk Clean;
        Clean = new detailProduk("Sayap-sayap", "Sidoarjo", "Cleaning Product", 30000, 35000);
        
        facewash.toString();
        beverages.toString();
        food.toString();
        Clean.toString();
        
    }
}