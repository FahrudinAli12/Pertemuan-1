package Operator;
import java.util.Scanner;
public class Aritmatika {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int a, b, c;
        System.out.print("masukan a = ");
        a = input.nextInt();
        System.out.print("masukan b = ");
        b = input.nextInt ();
        //Penjumlahan
        c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        //Pengurangan
        c = b - a;
        System.out.println(b + " - " + a + " = " + c);
        //Perkalian
        c = a * b;
        System.out.println(a + " x " + b + " = " + c);
        //Pembagian
        c = b / a;
        System.out.println(b + " : " + a + " = " + c);
        //Modulus
        c = b % a;
        System.out.println(b + " % " + a + " = " + c);
         
    }
  
}
