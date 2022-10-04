/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pbo41022;

/**
 *
 * @author ASUS
 */
public class Supermarket {

    private String namaProduk;
    private String namaSupplier;
    private String lokasiSupplier;
    private String hargaJual;
    private int stokProduk;
    private String hargaBeli;
    
    float hargaJualConv = Float.parseFloat(hargaJual);
    float hargaBeliConv = Float.parseFloat(hargaBeli);
    
    public String getNamaProduk() {
        return namaProduk;
    }
    
    public String getNamaSupplier() {
        return namaSupplier;
    }
    
    public String getLokasiSupplier() {
        return lokasiSupplier;
    }
    
    public float gethargaJual() {
        return hargaJual;
    }
    
    public String getStokProduk() {
        return stokProduk;
    }
    
    public float getHargaBeli() {
        return hargaBeli;
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
