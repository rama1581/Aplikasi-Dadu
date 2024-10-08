package com.mycompany.guessgame;


import java.util.Scanner;

/**
 * 
 * @author Rama
 */
public class Guessgame {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tebak tb = new Tebak();

        System.out.println("Selamat datang di Permainan Tebak Dadu!");
        System.out.println("Coba tebak hasil lemparan dadu (1-6):");

        boolean benar = false;
        while (!benar) {
            System.out.print("Masukkan tebakan Anda: ");
            int t = sc.nextInt();

            benar = tb.cekHasil(t);
            if (!benar) {
                System.out.println("Tebakan salah! Coba lagi.");
            }
        }

        System.out.println("Selamat! Anda menebak dengan benar setelah " + tb.getJmlTebak() + " kali mencoba.");
        sc.close();
    }
}
