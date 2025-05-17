 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Count extends JFrame implements ActionListener {
    JLabel l1;
    JButton b1;
    JTextField t1;
    JPanel p;
    int c = 0;   
    
    public Count() {
   
        FlowLayout l = new FlowLayout();
        p = new JPanel();
        p.setLayout(l);
        
        
        l1 = new JLabel("Count");
        t1 = new JTextField(20);
        b1 = new JButton("Count"); 
        b1.addActionListener(this); 
        
      
        p.add(l1);
        p.add(t1);
        p.add(b1);
        
       
        this.add(p);
        
       
        this.setSize(300, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
   
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            c++;  
            t1.setText(c + ""); 
        }
    }
    
    public static void main(String[] st) {
        new Count();
    }
}
