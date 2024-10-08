/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessgame;

/**
 *
 * @author Rama
 */
import java.util.Random;

public class Tebak {
    private int jmlTebak;
    private int target;

    public Tebak() {
        Random rand = new Random();
        this.target = rand.nextInt(6) + 1; // Angka acak antara 1 dan 6
        this.jmlTebak = 0;
    }

    public boolean cekHasil(int t) {
        jmlTebak++;
        return t == target;
    }

    public int getJmlTebak() {
        return jmlTebak;
    }
}
