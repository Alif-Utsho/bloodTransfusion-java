
package blood.transfusion;

import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
        BloodTransfusion frame= new BloodTransfusion();
        frame.setBounds(400,200,1000,620);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Blood Transfusion");
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
