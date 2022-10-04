/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo41022;

/**
 *
 * @author ASUS
 */
public class detailSupplier {
    public String namaSupplier;
    private final String lokasiSupplier;
    
    public detailSupplier(String namaSupplier, String lokasiSupplier) {
        
        this.lokasiSupplier = lokasiSupplier;
        this.namaSupplier = namaSupplier;
    }
    
    public String getNamaSupplier() {
        return namaSupplier;
    }
    
    public String getLokasiSupplier()  {
        return lokasiSupplier;
    }
    
    @Override
        public String toString() {
            return ("Nama Supplier : " + getNamaSupplier() + '\n' + "Lokasi Supplier : " + getLokasiSupplier() + '\n' + '\n');
        }
}
