package Perulangan;
import java.util.Scanner;
public class While {
public static void main(String[] args) {
    Scanner masuk = new Scanner(System.in);
    int awal, akhir, split;
    System.out.println("Bilangan Genap");
    System.out.print("awal  : ");
    awal = masuk.nextInt();
    System.out.print("akhir : ");
    akhir = masuk.nextInt();
    int a = awal;
    split = 1;
    while(a <= akhir){
        int hasil = a % 2;
        if(hasil == 0){
            System.out.print(a+" ");
            if(split == 5){
                System.out.println("");
                split = 0;
            }
            split++;
        }
        a++;
    }
        
        
    }
    
}
