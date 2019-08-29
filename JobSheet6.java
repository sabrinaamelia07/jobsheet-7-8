/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class JobSheet6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String identitas = "Sabrina Amelia R.P / X RPL 2 / 34";
        System.out.println("identitas : " + identitas);
        Scanner read = new Scanner(System.in);
        System.out.println("Nilai a ? ");
        int a = read.nextInt();
        
        System.out.println("/nIF.. 1");
        if (a < 5) System.out.println("nilai a kurang dari 5");
        
        System.out.println("/nIF.. 2");
        if(a == 5) System.out.println("nilai a sama dengan 5");
        
        System.out.println("/nIF.. 3");
        if (a > 5) {
            System.out.println("isi variabel a : " + a);
            System.out.println("nilai a lebih dari 5");
        
        }
    }
}
