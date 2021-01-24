
package blood.transfusion;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BloodTransfusion extends JFrame{
    
    private Container c;
    private ImageIcon img, red;
    public static ImageIcon icon;
    private Font f1,f2,f3;
    private Panel panel1,panel2;
    private JLabel image, EnterName,name;
    public static TextField nameField;
    private JButton submitBtn;
    private Cursor cr;
    
    BloodTransfusion(){
        this.setBounds(400,200,1000,620);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Blood Transfusion");
        this.setResizable(false);
        //this.setUndecorated(true);
        
        initComponents();
    }
    
    public void initComponents(){
        
        c= this.getContentPane();
        c.setBackground(Color.WHITE);
        c.setLayout(null);
        
        img= new ImageIcon(getClass().getResource("bloodDrop.jpg"));
        red= new ImageIcon(getClass().getResource("redColor.png"));
        icon=new ImageIcon(getClass().getResource("icon.png"));
        
        this.setIconImage(icon.getImage());
        
        cr= new Cursor(Cursor.HAND_CURSOR);
        
        f1= new Font("Arial",Font.BOLD,28);
        f2= new Font("Tahoma",Font.ITALIC,18);
        f3= new Font("TW Cen MT",Font.BOLD,30);
        
        panel1= new Panel();
        panel1.setBounds(10,0,490,580);
        panel1.setLayout(null);
        panel1.setBackground(Color.RED);
        c.add(panel1);
        
        image= new JLabel();
        image.setIcon(img);
        image.setBounds(1,1,img.getIconWidth(),578);
        panel1.add(image);
        
        panel2= new Panel();
        panel2.setBounds(490,0,495,580);
        panel2.setLayout(null);
        panel2.setBackground(Color.RED);
        c.add(panel2);
        
        
        
        EnterName= new JLabel("Enter your Name: ");
        EnterName.setBounds(50,130,300,50);
        EnterName.setForeground(Color.WHITE);
        EnterName.setFont(f3);
        panel2.add(EnterName);
        
        nameField= new TextField();
        nameField.setBounds(50,200,400,50);
        nameField.setFont(f1);
        nameField.setBackground(Color.RED);
        nameField.setForeground(Color.WHITE);
        panel2.add(nameField);
        
        submitBtn= new JButton();
        submitBtn.setText("Submit");
        submitBtn.setFont(f2);
        submitBtn.setBounds(350,270,100,50);
        submitBtn.setBackground(Color.WHITE);
        submitBtn.setCursor(cr);
        panel2.add(submitBtn);
        
        submitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(nameField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Enter your name", "Something missing", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    dispose();
                    bloodGroup fr= new bloodGroup();
                    fr.setVisible(true);
                }
            }
        });
        
        nameField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(nameField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Enter your name", "Something missing", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    dispose();
                    bloodGroup fr= new bloodGroup();
                    fr.setVisible(true);
                }
            }
        });
        
        
    }

    public static void main(String[] args){
        
        BloodTransfusion frame= new BloodTransfusion();
        frame.setVisible(true);
        
    }
    
}
