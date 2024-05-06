package Operator;

public class Logika {
    public static void main(String[] args) {
        //Logika NOT (!)
        boolean lulus = false;
        boolean hasil = !lulus;
        System.out.println(hasil);
        //Logika AND (&&)
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = a && b && c;
        System.out.println(d);
        //Logika OR (||)
        boolean e = false;
        boolean f = true;
        boolean g = e || f;
        System.out.println(g);
    }
}
