package TipeData;


public class Biodata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat biodata dengan 5 tipe data yang berbeda
        String nim = "2355201034" ;
        String nama = "M Fahrudin Ali N" ;
        Double BB = 70.5 ;
        int umur = 19 ;
        char goldar = 'A' ;
        boolean lakilaki = true ;
        
        System.out.println("=========BIODATA=========");
        System.out.println("NIM         : " + nim);
        System.out.println("NAMA        : " + nama);
        System.out.println("Berat Badan : " + BB);
        System.out.println("Umur        : " + umur);
        System.out.println("Goldar      : " + goldar);
        if(lakilaki==true){
        System.out.println("Gender      : Laki-Laki");
        }
                
    }
    
}
