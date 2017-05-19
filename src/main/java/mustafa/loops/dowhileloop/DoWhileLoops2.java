package mustafa.loops.dowhileloop;

import javax.swing.*;

/**
 * Created by Diagram on 20/05/2017.
 */
public class DoWhileLoops2 {
    public static void main(String[] args) {
        int i = -1;
        //Sayıları teker teker artıran program
        do{
            JOptionPane.showMessageDialog(null,i);
            i++;
        }while (i<5);
    }
}
