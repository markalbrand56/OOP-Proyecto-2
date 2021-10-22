import javax.swing.*;

public class GUI {

    public GUI(){
        JFrame frame = new JFrame("Hello Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
        JLabel l = new JLabel("Hola");
        JPanel p = new JPanel();
        p.add(l);
        frame.add(p);
    }

}
