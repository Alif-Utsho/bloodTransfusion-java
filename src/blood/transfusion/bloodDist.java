
package blood.transfusion;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class bloodDist extends JFrame{
    private Panel panel1,panel2,panel3;
    private Container c;
    private ImageIcon imgIn,imgOut,homeIcon;
    private Font f1,f2,f3;
    private JLabel home,bldIn,bldOut, bldGrp, give,rcv, Apos1,Aneg1,Bpos1,Bneg1,ABpos1,ABneg1,Opos1,Oneg1,Apos2,Aneg2,Bpos2,Bneg2,ABpos2,ABneg2,Opos2,Oneg2;
    private String grpName= bloodGroup.cb.getSelectedItem().toString();
//    private int indx= bloodGroup.cb.getSelectedIndex();

    
    bloodDist(){
        this.setLayout(null);
        this.setBounds(450,200,1002,551);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(BloodTransfusion.icon.getImage());
        //this.setResizable(false);
        this.setUndecorated(true);
        initComponents();
    }
    public void initComponents(){
        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        
        imgIn= new ImageIcon(this.getClass().getResource("blood_in.png"));
        imgOut= new ImageIcon(this.getClass().getResource("blood_out.png"));
        homeIcon= new ImageIcon(this.getClass().getResource("home.png"));
        
        f1= new Font("Wide Latin",Font.BOLD,30);
        f2= new Font("Arial",Font.PLAIN,23);
        f3= new Font("Nirmala UI",Font.BOLD,23);
        
        panel1= new Panel();
        panel1.setLayout(null);
        panel1.setBounds(1,1,1000,130);
        panel1.setBackground(Color.WHITE);
        c.add(panel1);
        
        bldIn= new JLabel();
        bldIn.setIcon(imgIn);
        bldIn.setBounds(80,1,imgIn.getIconWidth(),imgIn.getIconHeight());
        panel1.add(bldIn);
        
        bldGrp= new JLabel();
        bldGrp.setText(grpName);
        bldGrp.setBounds(400,30,250,60);
        bldGrp.setForeground(Color.RED);
        bldGrp.setFont(f1);
        panel1.add(bldGrp);
        
        bldOut= new JLabel();
        bldOut.setIcon(imgOut);
        bldOut.setBounds(800,1,imgOut.getIconWidth(),imgOut.getIconHeight());
        panel1.add(bldOut);
        
        panel2= new Panel();
        panel2.setLayout(null);
        panel2.setBounds(1,132,502,418);
        panel2.setBackground(Color.WHITE);
        c.add(panel2);
        
        rcv= new JLabel();
        rcv.setText("You can receive from these groups:");
        rcv.setBounds(15,5,400,60);
        rcv.setFont(f2);
        rcv.setForeground(Color.RED);
        panel2.add(rcv);
        
        panel3= new Panel();
        panel3.setLayout(null);
        panel3.setBounds(505,132,496,418);
        panel3.setBackground(Color.WHITE);
        c.add(panel3);
        
        give= new JLabel();
        give.setText("You can give to these groups:");
        give.setBounds(30,5,350,60);
        give.setFont(f2);
        give.setForeground(Color.RED);
        panel3.add(give);
        
        Apos1= new JLabel("  A (+)ve  ");
        Apos1.setBounds(50,80,110,50);
        Apos1.setFont(f3);
        Apos1.setBackground(Color.RED);
        Apos1.setForeground(Color.WHITE);
        Apos1.setOpaque(true);
        panel2.add(Apos1);
        
        Bpos1= new JLabel("  B (+)ve  ");
        Bpos1.setBounds(50,150,110,50);
        Bpos1.setFont(f3);
        Bpos1.setBackground(Color.RED);
        Bpos1.setForeground(Color.WHITE);
        Bpos1.setOpaque(true);
        panel2.add(Bpos1);
        
        ABpos1= new JLabel(" AB (+)ve ");
        ABpos1.setBounds(50,220,110,50);
        ABpos1.setFont(f3);
        ABpos1.setBackground(Color.RED);
        ABpos1.setForeground(Color.WHITE);
        ABpos1.setOpaque(true);
        panel2.add(ABpos1);
        
        Opos1= new JLabel("  O (+)ve  ");
        Opos1.setBounds(50,290,110,50);
        Opos1.setFont(f3);
        Opos1.setBackground(Color.RED);
        Opos1.setForeground(Color.WHITE);
        Opos1.setOpaque(true);
        panel2.add(Opos1);
        
        Aneg1= new JLabel("   A (-)ve  ");
        Aneg1.setBounds(200,80,110,50);
        Aneg1.setFont(f3);
        Aneg1.setBackground(Color.RED);
        Aneg1.setForeground(Color.WHITE);
        Aneg1.setOpaque(true);
        panel2.add(Aneg1);
        
        Bneg1= new JLabel("   B (-)ve  ");
        Bneg1.setBounds(200,150,110,50);
        Bneg1.setFont(f3);
        Bneg1.setBackground(Color.RED);
        Bneg1.setForeground(Color.WHITE);
        Bneg1.setOpaque(true);
        panel2.add(Bneg1);
        
        ABneg1= new JLabel(" AB (-)ve ");
        ABneg1.setBounds(200,220,110,50);
        ABneg1.setFont(f3);
        ABneg1.setBackground(Color.RED);
        ABneg1.setForeground(Color.WHITE);
        ABneg1.setOpaque(true);
        panel2.add(ABneg1);
        
        Oneg1= new JLabel("   O (-)ve  ");
        Oneg1.setBounds(200,290,110,50);
        Oneg1.setFont(f3);
        Oneg1.setBackground(Color.RED);
        Oneg1.setForeground(Color.WHITE);
        Oneg1.setOpaque(true);
        panel2.add(Oneg1);
        
        Apos2= new JLabel("  A (+)ve  ");
        Apos2.setBounds(50,80,110,50);
        Apos2.setFont(f3);
        Apos2.setBackground(Color.RED);
        Apos2.setForeground(Color.WHITE);
        Apos2.setOpaque(true);
        panel3.add(Apos2);
        
        Bpos2= new JLabel("  B (+)ve  ");
        Bpos2.setBounds(50,150,110,50);
        Bpos2.setFont(f3);
        Bpos2.setBackground(Color.RED);
        Bpos2.setForeground(Color.WHITE);
        Bpos2.setOpaque(true);
        panel3.add(Bpos2);
        
        ABpos2= new JLabel(" AB (+)ve ");
        ABpos2.setBounds(50,220,110,50);
        ABpos2.setFont(f3);
        ABpos2.setBackground(Color.RED);
        ABpos2.setForeground(Color.WHITE);
        ABpos2.setOpaque(true);
        panel3.add(ABpos2);
        
        Opos2= new JLabel("  O (+)ve  ");
        Opos2.setBounds(50,290,110,50);
        Opos2.setFont(f3);
        Opos2.setBackground(Color.RED);
        Opos2.setForeground(Color.WHITE);
        Opos2.setOpaque(true);
        panel3.add(Opos2);
        
        Aneg2= new JLabel("   A (-)ve  ");
        Aneg2.setBounds(200,80,110,50);
        Aneg2.setFont(f3);
        Aneg2.setBackground(Color.RED);
        Aneg2.setForeground(Color.WHITE);
        Aneg2.setOpaque(true);
        panel3.add(Aneg2);
        
        Bneg2= new JLabel("   B (-)ve  ");
        Bneg2.setBounds(200,150,110,50);
        Bneg2.setFont(f3);
        Bneg2.setBackground(Color.RED);
        Bneg2.setForeground(Color.WHITE);
        Bneg2.setOpaque(true);
        panel3.add(Bneg2);
        
        ABneg2= new JLabel(" AB (-)ve ");
        ABneg2.setBounds(200,220,110,50);
        ABneg2.setFont(f3);
        ABneg2.setBackground(Color.RED);
        ABneg2.setForeground(Color.WHITE);
        ABneg2.setOpaque(true);
        panel3.add(ABneg2);
        
        Oneg2= new JLabel("   O (-)ve  ");
        Oneg2.setBounds(200,290,110,50);
        Oneg2.setFont(f3);
        Oneg2.setBackground(Color.RED);
        Oneg2.setForeground(Color.WHITE);
        Oneg2.setOpaque(true);
        panel3.add(Oneg2);
        
        Apos1.setVisible(false);
        Bpos1.setVisible(false);
        ABpos1.setVisible(false);
        Opos1.setVisible(false);
        
        Aneg1.setVisible(false);
        Bneg1.setVisible(false);
        ABneg1.setVisible(false);
        Oneg1.setVisible(false);
        
        Apos2.setVisible(false);
        Bpos2.setVisible(false);
        ABpos2.setVisible(false);
        Opos2.setVisible(false);
        
        Aneg2.setVisible(false);
        Bneg2.setVisible(false);
        ABneg2.setVisible(false);
        Oneg2.setVisible(false);
        
        
        if(grpName.equals("A (+)ve")){
            Apos1.setVisible(true);
            Aneg1.setVisible(true);
            Opos1.setBounds(50,150,110,50);
            Opos1.setVisible(true);
            Oneg1.setBounds(200,150,110,50);
            Oneg1.setVisible(true);
            
            Apos2.setVisible(true);
            ABpos2.setBounds(200,80,110,50);
            ABpos2.setVisible(true);
        }
        
        else if(grpName.equals("A (-)ve")){
            Aneg1.setBounds(50,80,110,50);
            Aneg1.setVisible(true);
            Oneg1.setBounds(200,80,110,50);
            Oneg1.setVisible(true);
            
            Apos2.setVisible(true);
            Aneg2.setVisible(true);
            ABpos2.setBounds(50,150,110,50);
            ABpos2.setVisible(true);
            ABneg2.setBounds(200,150,110,50);
            ABneg2.setVisible(true);            
        }
        
        else if(grpName.equals("B (+)ve")){
            Bpos1.setBounds(50,80,110,50);
            Bpos1.setVisible(true);
            Bneg1.setBounds(200,80,110,50);
            Bneg1.setVisible(true);
            Opos1.setBounds(50,150,110,50);
            Opos1.setVisible(true);
            Oneg1.setBounds(200,150,110,50);
            Oneg1.setVisible(true);
            
            Bpos2.setBounds(50,80,110,50);
            Bpos2.setVisible(true);
            ABpos2.setBounds(200,80,110,50);
            ABpos2.setVisible(true);
        }
        
        else if(grpName.equals("B (-)ve")){
            Bneg1.setBounds(50,80,110,50);
            Bneg1.setVisible(true);
            Oneg1.setBounds(200,80,110,50);
            Oneg1.setVisible(true);
            
            Bpos2.setBounds(50,80,110,50);
            Bpos2.setVisible(true);
            Bneg2.setBounds(200,80,110,50);
            Bneg2.setVisible(true);
            ABpos2.setBounds(50,150,110,50);
            ABpos2.setVisible(true);
            ABneg2.setBounds(200,150,110,50);
            ABneg2.setVisible(true);
        }
        
        else if(grpName.equals("AB (+)ve")){
            Apos1.setVisible(true);
            Bpos1.setVisible(true);
            ABpos1.setVisible(true);
            Opos1.setVisible(true);
            Aneg1.setVisible(true);
            Bneg1.setVisible(true);
            ABneg1.setVisible(true);
            Oneg1.setVisible(true);
        
            ABpos2.setBounds(50,80,110,50);
            ABpos2.setVisible(true);
        }
        
        else if(grpName.equals("AB (-)ve")){
            Aneg1.setVisible(true);
            Bneg1.setVisible(true);
            ABneg1.setVisible(true);
            Oneg1.setVisible(true);
            
            ABpos2.setBounds(50,80,110,50);
            ABpos2.setVisible(true);
            ABneg2.setBounds(200,80,110,50);
            ABneg2.setVisible(true);
        }
        
        else if(grpName.equals("O (+)ve")){
            Opos1.setBounds(50,80,110,50);
            Opos1.setVisible(true);
            Oneg1.setBounds(200,80,110,50);
            Oneg1.setVisible(true);
            
            Apos2.setVisible(true);
            Bpos2.setVisible(true);
            ABpos2.setVisible(true);
            Opos2.setVisible(true);
        }
        
        else if(grpName.equals("O (-)ve")){
            Oneg1.setBounds(50,80,110,50);
            Oneg1.setVisible(true);
            
            Apos2.setVisible(true);
            Bpos2.setVisible(true);
            ABpos2.setVisible(true);
            Opos2.setVisible(true);
            Aneg2.setVisible(true);
            Bneg2.setVisible(true);
            ABneg2.setVisible(true);
            Oneg2.setVisible(true);
        }
        
        
        home= new JLabel();
        home.setIcon(homeIcon);
        home.setBounds(465,390,homeIcon.getIconWidth(),homeIcon.getIconHeight());
        panel3.add(home);
        
        home.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                dispose();
                BloodTransfusion fr= new BloodTransfusion();
                fr.setVisible(true);
            }
        });
        
    }
    
    public static void main(String[] args) {
        bloodDist frame= new bloodDist();
        frame.setVisible(true);
    }
}
