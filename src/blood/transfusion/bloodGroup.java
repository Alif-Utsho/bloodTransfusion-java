
package blood.transfusion;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class bloodGroup extends JFrame{
    
    private Container c;
    private JLabel image, grpTxt,hello,nameLabel,home;
    private Panel panel1,panel2;
    private ImageIcon img,homeIcon;
    private Font f1,f2,f3,f4;
    public static JComboBox cb;
    private JButton submitBtn;
    private Cursor cr;
    private String[] bloodGroup= {"A (+)ve","A (-)ve","B (+)ve","B (-)ve","AB (+)ve", "AB (-)ve", "O (+)ve", "O (-)ve"};
    private String name= BloodTransfusion.nameField.getText();
    
    bloodGroup(){
        this.setBounds(450,200,910,554);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Blood Transfusion");
        this.setIconImage(BloodTransfusion.icon.getImage());
        this.setUndecorated(true);
        //this.setResizable(false);
        
        initComponents();
        
    }
    
    public void initComponents(){
        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.RED);
        
        img= new ImageIcon(getClass().getResource("Drop.png"));
        homeIcon= new ImageIcon(this.getClass().getResource("home.png"));
        
        f1= new Font("Rockwell",Font.BOLD,35);
        f2= new Font("TW Cen MT",Font.BOLD,30);
        f3= new Font("Lucida Fax",Font.BOLD,40);
        f4= new Font("Tahoma",Font.ITALIC,18);
        
        cr= new Cursor(Cursor.HAND_CURSOR);
        
        panel1= new Panel();
        panel1.setLayout(null);
        panel1.setBounds(2,2,450,550);
        panel1.setBackground(Color.WHITE);
        c.add(panel1);
        
        image= new JLabel();
        image.setIcon(img);
        image.setBounds(-90,5,img.getIconWidth(),img.getIconHeight());
        panel1.add(image);
        
        panel2= new Panel();
        panel2.setBounds(450,1,460,560);
        panel2.setLayout(null);
        panel2.setBackground(Color.RED);
        c.add(panel2);
        
        hello= new JLabel("Hello");
        hello.setBounds(20,20,100,50);
        hello.setFont(f1);
        hello.setForeground(Color.WHITE);
        panel2.add(hello);
        
        nameLabel= new JLabel("<html>"+name+"</html>");
        nameLabel.setBounds(120,20,300,100);
        nameLabel.setFont(f3);
        nameLabel.setForeground(Color.WHITE);
        panel2.add(nameLabel);
        
        grpTxt= new JLabel("Select your blood group:");
        grpTxt.setFont(f2);
        grpTxt.setBounds(50,150,350,50);
        grpTxt.setForeground(Color.WHITE);
        panel2.add(grpTxt);
        
        cb= new JComboBox(bloodGroup);
        cb.setBounds(50,230,350,50);
        cb.setBackground(Color.WHITE);
        cb.setForeground(Color.RED);
        cb.setFont(f2);
        panel2.add(cb);
        
        submitBtn= new JButton();
        submitBtn.setText("Submit");
        submitBtn.setFont(f4);
        submitBtn.setBounds(300,320,100,50);
        submitBtn.setBackground(Color.WHITE);
        submitBtn.setCursor(cr);
        panel2.add(submitBtn);
        
        home= new JLabel();
        home.setIcon(homeIcon);
        home.setBounds(432,525,homeIcon.getIconWidth(),homeIcon.getIconHeight());
        panel2.add(home);
        
        home.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                dispose();
                BloodTransfusion fr= new BloodTransfusion();
                fr.setVisible(true);
            }
        });
        
        submitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
                bloodDist fr= new bloodDist();
                fr.setVisible(true);
            }
        });
    }
    
    
    public static void main(String[] args) {
        bloodGroup frame= new bloodGroup();
        frame.setVisible(true);
    }
    
}
