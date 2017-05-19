package mustafa.loops.dowhileloop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Diagram on 19/05/2017.
 */
public class DoWhileLoops1 {

    public static void main(String[] args) {
        int toplam = 0;
        int i = 0;
        do{
            if(i%2 == 0)
                toplam += i;
        i++;
        }while(i<=40);
        System.out.println("(40) dahil 40 a kadar olan çift sayıların toplam  = " + toplam);
    }


}
