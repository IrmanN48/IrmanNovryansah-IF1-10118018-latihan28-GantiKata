/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author Aero
 * NAMA  : IRMAN NOVRYANSAH
 * KELAS : IF 1
 * NIM   : 10118018
 * Deskripsi Program : Program ini untuk mengubah suatu kata dari kalimat yang 
 *                     disimpan di sistem atau replace.
 */
public class Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //deklarasi variable
        String kalimatAwal, kalimatBaru, gantiKata, jadiKata;
        
        //scanner
        Scanner scanner = new Scanner(System.in);
        
        //input
        System.out.println("=======Program Ganti Kata=======");
        System.out.print("Masukkan Kalimat : ");
        kalimatAwal = scanner.nextLine();
        System.out.print("Ganti Kata : ");
        gantiKata = scanner.next();
        System.out.print("Menjadi Kata : ");
        jadiKata = scanner.next();
        
        //proses pergantian kata
        kalimatBaru = (kalimatAwal).replaceAll(gantiKata, jadiKata);
        
        //output
        System.out.println("\n======Hasil Formatting======");
        System.out.println("Kalimat Awal : "+kalimatAwal);
        System.out.println("Kalimat Baru : "+kalimatBaru);
    }
}
