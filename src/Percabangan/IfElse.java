package Percabangan;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        System.out.print("total = ");
        double total = masuk.nextDouble();
        System.out.println("Belanja = Rp. "+total);
        if(total >= 400000){
            System.out.println("Dapat diskon 20%");
            double diskon = 20 * total / 100;
            total -= diskon;
        } else if(total >= 300000){
            System.out.println("Dapat diskon 15%");
            double diskon = 15 * total / 100;
            total -= diskon;
        } else if(total >= 200000){
            System.out.println("Dapat diskon 10%");
            double diskon = 10 * total / 100;
            total -= diskon;
        }
        else {
            System.out.println("Tidak dapat diskon");
        }
        System.out.println("Total akhir = Rp. "+total);
            
                    
            
        }
        
    }
  
