package bilangangenap;
import java.util.Scanner;
/**
 * @author E41202029_Billy Damas
 */
public class BilanganGenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int awal,akhir;
        
        System.out.print("Tentukan Batas Awal : ");
        awal = sc.nextInt();
        
        System.out.print("Tentukan Batas Akhir : ");
        akhir = sc.nextInt();
        
        System.out.print("Deret Bilangan Genap ");
        for (int x = awal; x <= akhir; x++){
            if (x % 2 == 0){
                System.out.print(x + " ");
            }
        }
        
    }
    
}
