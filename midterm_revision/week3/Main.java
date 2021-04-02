import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
/*  w ww  . j  a  v  a2s. co  m*/
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
  public static void main(String args[]) {
    JFrame f = new JFrame("Label Demo");
    f.setLayout(new FlowLayout());
    f.setSize(200, 360);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
    JLabel label= new JLabel("java2s.com");
    Border border = BorderFactory.createLineBorder(Color.BLACK);
    label.setBorder(border);
    label.setPreferredSize(new Dimension(150, 100));
    label.setHorizontalAlignment(JLabel.CENTER);
    
    f.add(label);

    f.setVisible(true);
  }
}