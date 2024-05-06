package Perulangan;
import java.util.Scanner;
public class DoWhile {
public static void main(String[] args) {
    String nama, alamat, loop;
    do{
        Scanner masuk = new Scanner(System.in);
        System.out.print("nama   : ");
        nama = masuk.nextLine();
        System.out.print("alamat : ");
        alamat = masuk.nextLine();
        System.out.println("------------------------");
        System.out.println(nama +" tinggal di "+ alamat);
        System.out.print("ulang (y/n): ");
        loop = masuk.next();
    } while(loop.equalsIgnoreCase("y"));
    System.out.println("Program selesai");
        
    }
        
        
}
