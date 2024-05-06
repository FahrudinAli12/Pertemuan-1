package Perulangan;
import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int awal, akhir;
        System.out.println("Bilangan ganap");
        System.out.print("awal  : ");
        awal = masuk.nextInt();
        System.out.print("akhir : ");
        akhir = masuk.nextInt();
        if(awal < akhir){
            for(int a = awal; a <= akhir; a++){
                int hasil = a % 2;
                if(hasil == 0){
                    System.out.print(a+" ");
                }
            }
            System.out.println("");
        }else {
            System.out.println("Awal > Akhir");
        }
    }
}
