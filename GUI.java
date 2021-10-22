import javax.swing.*;
import java.awt.Font;

public class GUI {

    public GUI(){
        JFrame frame = new JFrame("Hello Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
        JLabel l = new JLabel("𓆭𓆭𓆭Semilla a semilla para mejorar el mundo𓆭𓆭𓆭 ");
        l.setFont(new Font("Monaco", Font.PLAIN, 18));
        JPanel p = new JPanel();
        p.add(l);
        frame.add(p);
    }

}
