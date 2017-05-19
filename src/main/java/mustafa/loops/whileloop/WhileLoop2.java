package mustafa.loops.whileloop;

import javax.swing.*;

/**
 * Created by Diagram on 20/05/2017.
 */
public class WhileLoop2 {
    //Toplam Puanı hesaplayan class
    public static void main(String[] args) {
        String takimlar[][] = new String[1][5];
        int takim = 0;
        int puan = 0;
        while (takim<1){
            takimlar[takim][0] = JOptionPane.showInputDialog("Takım Adını Giriniz "); //BEŞİKTAŞ
            takimlar[takim][1] = JOptionPane.showInputDialog(takimlar[takim][0] + "Galibiyet Sayısı "); //BEŞİKTAŞ
            takimlar[takim][2] = JOptionPane.showInputDialog(takimlar[takim][0] + "Beraberlik Sayısı "); //BEŞİKTAŞ
            takimlar[takim][3] = JOptionPane.showInputDialog(takimlar[takim][0] + "Mağlubiyet Sayısı "); //BEŞİKTAŞ
            takim++;
        }
        while(takim>0){
            takim--;
            puan += Integer.valueOf(takimlar[takim][1])*3 +  1*Integer.valueOf(takimlar[takim][2]);
        }
        JOptionPane.showMessageDialog(null,takimlar[takim][0] +" 'n"+ " Toplam Puanı =" + puan);
    }
}
