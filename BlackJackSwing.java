import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Dimension;

class BlackJackSwing extends JFrame{
  public static void main(String args[]){
    BlackJackSwing frame = new BlackJackSwing("タイトル");
    frame.setVisible(true);
  }

  BlackJackSwing(String title){
    setTitle(title);
    setBounds(100, 100, 800, 700);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();
    int number = 1;
    JLabel label = new JLabel(number+" heart");
    label.setPreferredSize(new Dimension(90,120));
    label.setBorder(new LineBorder(Color.BLUE, 3, true));

    p.add(label);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}
