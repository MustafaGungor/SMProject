package mustafa.loops.whileloop;

import java.util.Scanner;

/**
 * Created by Diagram on 19/05/2017.
 */
public class WhileLoops1 {
    public static void main(String[] args) {
        /*
        * while(i<sayi)
        *     i++;
        * */
        //1.döngü
        int toplam = 0;
        System.out.println("5 Sayı girin");
        Scanner s = new Scanner(System.in);
        int i=1;
        while (i<6){
            System.out.println(i+".sayıyı girin");
            int sayi = s.nextInt();
            toplam+=sayi;
            i++;
        }
        System.out.println("Toplam" + toplam);
    }
}
