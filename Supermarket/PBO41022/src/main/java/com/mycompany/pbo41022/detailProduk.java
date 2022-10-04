/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pbo41022;

/**
 *
 * @author ASUS
 */
public class detailProduk extends detailSupplier{
  
    public final String namaProduk;
    public int stokProduk = 0;
    public int hargaJual;
    public int hargaBeli;
        
//    int hargaJualConv = Integer.parseInt(hargaJual);
//    int hargaBeliConv = Integer.parseInt(hargaBeli);
    
    public detailProduk(String namaSupplier, String lokasiSupplier, String namaProduk, int hargaBeli, int hargaJual) {
            super(namaSupplier, lokasiSupplier);
            this.namaProduk = namaProduk;
            this.stokProduk++;
            this.hargaBeli = hargaBeli;
            this.hargaJual = hargaJual;
        }
        
        public void beliProduk() {
            stokProduk--;
        }
        
        public String getNamaProduk() {
            return namaProduk;
        }
        
        public float getHargaJual() {
            return hargaJual;
        } 
        
        public float getHargaBeli() {
            return hargaBeli;
        }
        
        public void BeliProduk(String namaProduk, int hargaJual) {
            beliProduk();
            System.out.println("Produk " + namaProduk + hargaJual);
        }
        
        @Override
        public String toString() {
            return ("Nama Produk : " + getNamaProduk() + '\n' + "Jumlah Stok Produk : " + stokProduk + '\n' + "Harga Beli Produk : " + getHargaBeli() + "Harga Jual Produk : " + getHargaJual() + '\n' + '\n');
        }
    
        
}
