/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resep;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Resep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String identitas = "Sabrina Amelia / X RPL 2 / 34";
        System.out.println("identitas: " + identitas);
        
        
        System.out.print("\nSaran Resep dari Bahan Milik Anda");
        Scanner baca = new Scanner(System.in);
        
        System.out.println("Bahan Pertama: ");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.println("Masukkan no pilihan anda :");
        int bahan1 = baca.nextInt();
        
        if (bahan1 == 1 || bahan1 == 2)
        {
            System.out.println("bahan kedua: ");
            if(bahan1 == 1) {
                System.out.println("1. susu");
                System.out.println("2. minyak goreng");
                System.out.println("3. tidak ada");
            }else{
                System.out.println("1. minyak goreng");
                System.out.println("2. roti");
                System.out.println("3. tidak ada");
            }
            System.out.println("masukkan no pilihan anda");
            int bahan2 = baca.nextInt();
            
        }else
            System.out.println("mohon maaf pilihan tidak ditemukan, "
                    +"tidak dapat memberikan saran resep");
        int bahan2 = baca.nextInt();
        if(bahan2 < 1 || bahan2 > 3) {
        }if(bahan1==1)
            switch(bahan2)
            {
                case 1: System.out.println(
                        "anda dapat membuat telur mata sapi"); break;
                case 2: System.out.println(
                        "anda dapat membuat sandwich telur"); break;
                case 3: System.out.println(
                        "anda dapat membuat telur rebus");
                    
            }else
            System.out.print("Mohon Maaf, Pilihan anda tidak ditemukan, "
                    + "tidak dapat memberikan resep");
    }
}
    

    
    
    
            
            
       
