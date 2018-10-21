/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan48_kalkulator;

import java.util.Scanner;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Menghitung 2 buah nilai dengan pertambahan, pengurangan,
 *                 perkalian, dan pembagian
 */
public class PBO2_10117081_Latihan48_Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        Hitung kalkulator = new Hitung();
        
        System.out.print("Masukkan Value 1 : ");
        double a = scn.nextDouble();
        System.out.print("Masukkan Value 2 : ");
        double b = scn.nextDouble();
        System.out.println();
        
        kalkulator.setNameProject("Project Calculator");
        kalkulator.setNoteProject("The project shown you how to manage method in java");
        
        System.out.println();
        System.out.println("Result Add is = " + kalkulator.add(a, b));
        System.out.println("Result Minus is = " + kalkulator.minus(a, b));
        System.out.println("Result Multiple = " + kalkulator.multiplication(a, b));
        System.out.println("Result Division = " + kalkulator.division(a, b));
    }
    
}
