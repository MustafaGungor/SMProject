package mustafa.loops.forloop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Diagram on 19/05/2017.
 */
public class ForLoops {

    public static void main(String[] args) {
        /**
         * for ( 1. deger (baslangiç degeri-initialization) ; 2.deger (kosul kontrolü) ; 3.deger (islemler) )
         {
         // sarta bagli tekrarlanmasini istedigimiz kodlar
         }*/
        int artirilacakDeger;
        int dizi[] = {45,12,11,10,57,18};
        for(artirilacakDeger = 0;artirilacakDeger<dizi.length;artirilacakDeger++){
            System.out.println(dizi[artirilacakDeger]);
        }
        /**
         * for(degişken : koleksiyon)
         *    dizideki tüm değerleri değeişkene atar.
         * */
        // Ornek 1 :
        /////////////////////////////////////////////////////////
        int toplam = 0;
        for(int x:dizi)
            toplam+=x;
        System.out.print("Ornek1 icin -> ");
        System.out.println("Toplam = " + toplam);
        //Ornek 2 :
        ///////////////////////////////////////////////////////////
        int numbers[] = {10,20,30,11,21,31,12,22,32};
        int searchNumber = 21;
        boolean state = false;
        for (int sm: numbers) {
            if(sm == searchNumber){
                state = true;
                break;
            }
        }
        if(state)
            System.out.println("Ornek 2 -> Değer bulundu");
        else
            System.out.println("Ornek 2 -> Değer Bulunamadı");
        //Ornek3
        ///////////////////////////////////////////////////////////////
        Map<String,Object> jsonObject = new HashMap<String, Object>();
        jsonObject.put("Yaş",25);
        jsonObject.put("Ad","Mustafa");
        jsonObject.put("Soyad","Güngör");
        jsonObject.put("dt","27.04.1992");
        jsonObject.put("Baba Adı : ", "Menderes");
        jsonObject.put("Ana Adı : ", "Zeynep");
        System.out.println("Ornek 3 ->;");
        for(Map.Entry<String,Object> entry: jsonObject.entrySet())
            System.out.println("Değer : " + entry.getKey() + " Sonuç : " + entry.getValue());
        //Ornek4
        ///////////////////////////////////////////////////////////////////
        //Java List
        List<String> items = new ArrayList<String>();
        items.add("Mustafa");
        items.add("Serkan");
        items.add("Nadir");
        items.add("Yunus");
        System.out.println("Ornek4 --> için");
        for(String item : items)
            System.out.println(item);

    }
}
