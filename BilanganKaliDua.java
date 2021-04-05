package bilangankalidua;
/**
 * @author E41202029_Billy Damas
 */
public class BilanganKaliDua {
    public static void main(String[] args) {
        
        int hasil = 0;
        int angka = 1;
               
            System.out.println("====================");
            System.out.println("Bilangan Kelipatan 2");
            System.out.println("====================");
            
            do {
               hasil = angka * 2;
               if (hasil < 100){
                   System.out.print(hasil + " ");
               }
               angka = hasil;
            } while (angka < 100);
        }
    }

