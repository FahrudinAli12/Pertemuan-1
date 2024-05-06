package Percabangan;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int pil, porsi, harga = 0;
        System.out.println("Menu Makanan");
        System.out.println("1. Bakso\n2. Mie ayam");
        System.out.print("Pilih: ");
        pil = masuk.nextInt();
        switch(pil){
            case 1:
                System.out.print("Porsi : ");
                porsi = masuk.nextInt();
                System.out.println("Bakso(5k/porsi)");
                harga = 5000 * porsi;
                break;
            case 2:
                System.out.print("Porsi : ");
                porsi = masuk.nextInt();
                System.out.println("Mie ayam(7k/porsi)");
                harga = 7000 * porsi;
                break;
            default:
                System.out.println("Pilihan salah");
                break;
                
        }
        System.out.println("Total : Rp. "+harga);
    }
    
}
