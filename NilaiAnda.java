/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai.anda;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class NilaiAnda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String identitas = "Sabrina Amelia Royantika Putri / X RPL 2 / 34";
    System.out.println("Identitas : " + identitas);
    Scanner baca = new Scanner(System.in);
    
    int nilai;
       System.out.print("\nNilai Anda ? ");
       nilai = baca.nextInt();
       
       String grade = (nilai < 75) ? "belum kompeten" : "kompeten";
       System.out.println(nilai + " => " + grade);
    }
    
}
