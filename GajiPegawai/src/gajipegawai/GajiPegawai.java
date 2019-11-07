/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gajipegawai;

import java.util.Scanner;

/**
 * NAMA      : Moch Rizki Maulana N
 * KELAS     : IF-1
 * NIM       : 10118012
 * Deskripsi Program   : Program ini berisi program menghitung gaji pegawai
 *
 * @author Moch Rizki Maulana N
 */
public class GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gaji G = new Gaji();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama : ");
        G.setNama(input.nextLine());
        System.out.print("Alamat : ");
        G.setAlamat(input.nextLine());
        System.out.print("Uang Tunjangan : ");
        int uj = input.nextInt();
        G.setUangTunjangan(uj);
        System.out.print("Uang Transport : ");
        int ut=input.nextInt();
        G.setUangTransport(ut);
        System.out.print("Gaji Pokok : ");
        int gp = input.nextInt();
        G.setGajiPokok(gp);
        System.out.println("");
        G.tampilData(G.getNama(), G.getAlamat(), G.getUangTransport(), G.getUangTunjangan(), G.getGajiPokok(), G.totalGaji(uj, gp, ut));
    }
    
}
