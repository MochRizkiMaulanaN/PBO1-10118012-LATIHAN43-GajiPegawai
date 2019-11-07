/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gajipegawai;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Gaji {
    private String nama;
    private String alamat;
    private int uangTransport;
    private int uangTunjangan;
    private int gajiPokok;
    private int gajiTotal;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getGajiTotal() {
        return gajiTotal;
    }

    public void setGajiTotal(int gajiTotal) {
        this.gajiTotal = gajiTotal;
    }
    
    public int totalGaji(int uangTunjangan,int gajiPokok,int uangTransport){
        int total=uangTunjangan+gajiPokok+uangTransport;
        return total;
    }
    
    public void tampilData(String nama,String alamat,int uangTransport,int uangTunjangan,int gajiPokok,int total){
        System.out.println("### Data Gaji Karyawan PT. Kakatu ###");
        System.out.println("-------------------------------------");
        System.out.println("Nama Karyawan : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("Uang Transport : "+uangTransport);
        System.out.println("Uang Tunjangan : "+uangTunjangan);
        System.out.println("Gaji Pokok : "+gajiPokok);
        System.out.println("Total Gaji : "+total);
        
    }
    
    
}
