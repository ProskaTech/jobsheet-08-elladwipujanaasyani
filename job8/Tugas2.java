// Created by 21343022_Ella Dwipujana Asyani
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package job8;

import javax.swing.JOptionPane;
/**
 *
 * @author Ella Dwipujana Asyani
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int[] a = new int[11];
        String[] n = new String[11];
        int terbesar = 0;
        
        for(int i=1;i+1<=a.length;i++)
        {
            System.out.println(i); 
            n[i] = JOptionPane.showInputDialog("Masukkan angka ke-"+i+" :");
            a[i] = Integer.parseInt(n[i]);
            if(terbesar>a[i])
            {
                if(terbesar>a[i])
                {
                    terbesar=terbesar;
                    System.out.println(terbesar); 
                }
            }
            else
            {if(a[i]>a[i-1])
                {terbesar=a[i];}
                else
                {terbesar=a[i-1];
                }
                System.out.println(terbesar); 
            }
        }
        String hasil="Terbesar adalah "+terbesar;
        JOptionPane.showMessageDialog(null,hasil);  
    }
}
