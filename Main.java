/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pajak;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data dari keyboard
        System.out.print("Masukkan nama vendor: ");
        String vendor = input.nextLine();

        System.out.print("Masukkan tipe produk: ");
        String tipe = input.nextLine();

        System.out.print("Masukkan harga produk (dalam Rupiah): ");
        double harga = input.nextDouble();

        // Buat objek Pajak
        Pajak produk = new Pajak(vendor, tipe, harga);

        // Hitung harga PPN
        double ppn = produk.hitungPPN();
        double totalHarga = produk.getHarga() + ppn;

        System.out.println("\nInformasi Produk:");
        System.out.println("Vendor: " + produk.getVendor());
        System.out.println("Tipe: " + produk.getTipe());
        System.out.println("Harga: Rp " + produk.getHarga());
        System.out.println("PPN: Rp " + ppn);
        System.out.println("Total Harga: Rp " + totalHarga);
    }
}

