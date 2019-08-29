/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.pembayarn.listrik;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class ProgramPembayarnListrik {
    private static Object scanner;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int kwh;
        double Total;
        double biaya;
        
        System.out.print("/nProgram Pembayaran Tagihan Listrik");
        
        //input pemakaian
        Scanner baca = new Scanner(System.in);
        kwh = baca.nextInt();
        
        if(kwh <= 450) {
            System.out.println("kalian semua termasuk Golongan C ");
            biaya = 20000 + (kwh * 1000);
            System.out.println("biaya: " + biaya);
            
            Total = (biaya * 10/100) + biaya;
            System.out.println("total : " + Total);
            
        }else if (kwh <= 900) {
            System.out.println("kalian semua Golongan B");
            biaya = 35000 + (kwh * 2500);
            System.out.println("biaya: " + biaya);
            
            Total = (biaya * 15/100)+ biaya;
            System.out.println("Total : " + Total);
            
        }else if (kwh <= 1200) {
            System.out.println("kalian semua termasuk Golongan A");
            biaya = 50000 + (kwh * 3000);
            System.out.println("biaya: " + biaya);
            
            Total = (biaya * 20/100)+ biaya;
            System.out.println("Total :" + Total);
            
            
            
            
        }
        
        
        
        
                
        
        
        
        
       
        
        
        
        
    }
    
}
