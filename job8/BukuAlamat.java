// Created by 21343022_Ella Dwipujana Asyani
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package job8;

/**
 *
 * @author Ella Dwipujana Asyani
 */
public class BukuAlamat {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String [][] entry = {{"Florence", "735-1234", "Manila"},
                        {"Joyce", "983-3333", "Quezon City"},
                        {"Becca", "456-3322", "Manila"}
    };
        System.out.println("Name :" + entry[0][0]);
        System.out.println("Tel. # :" + entry[0][1]);
        System.out.println("Address :" + entry[0][2]);
        
        System.out.println("\nName :" + entry[1][0]);
        System.out.println("Tel. # :" + entry[1][1]);
        System.out.println("Address :" + entry[1][2]);
        
        System.out.println("\nName :" + entry[2][0]);
        System.out.println("Tel. # :" + entry[2][1]);
        System.out.println("Address :" + entry[2][2]);
}}