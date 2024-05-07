/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pajak;


import java.util.Scanner;

class Pajak {
    private String vendor;
    private String tipe;
    private double harga;

    // Konstruktor
    public Pajak(String vendor, String tipe, double harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }

    // Getter untuk vendor
    public String getVendor() {
        return vendor;
    }

    // Getter untuk tipe
    public String getTipe() {
        return tipe;
    }

    // Getter untuk harga
    public double getHarga() {
        return harga;
    }

    // Metode untuk menghitung PPN berdasarkan aturan
    public double hitungPPN() {
        double ppn;
        if (harga > 4500000) {
            ppn = 0.05 * harga;
        } else if (harga >= 4200000) {
            ppn = 0.02 * harga;
        } else {
            ppn = 0.01 * harga;
        }
        return ppn;
    }
}

