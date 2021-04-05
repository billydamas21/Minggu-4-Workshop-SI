package minmax;
import java.util.Scanner;
/**
 * @author E41202029_Billy Damas
 */
public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i = 1;
        int nilai;
        double jumlah = 0;
        double avg = 0;
        int max = 0 ;
        int min = 1000;

        System.out.print("Masukan banyaknya data nilai : ");
        nilai = sc.nextInt();
        
        while (i <= nilai){
            int jml=i+1;
            int[]simpan = new int[jml];
            
            System.out.print("Masukan data ke-"+i+" ");
            simpan[i] = sc.nextInt();
            jumlah = simpan[i] + jumlah;
            if(simpan[i] > max){
                max = simpan[i];
            }
            if ((simpan[i] < min) && (simpan [i] >= 1)){
                min = simpan [i];
            }
            i++;
        }
        
        avg=jumlah /(i - 1);
        System.out.println("=====================");
        System.out.println("Total: "+jumlah);
        System.out.println("Rata - Rata : " +avg);
        System.out.println("Angka Terkecil: " +min);
        System.out.println("Angka Terbesar: " +max);
        System.out.println("=====================");
    }
    
}
