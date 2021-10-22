import javax.swing.*;
import java.awt.Font;

public class GUI {

    public GUI(){
        JFrame frame = new JFrame("Hello Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 800);
        frame.setVisible(true);
        JLabel l = new JLabel("Semilla a semilla para mejorar el mundo");
        l.setFont(new Font("Monaco", Font.PLAIN, 16));
        JPanel p = new JPanel();
        p.add(l);
        frame.add(p);
    }

}
