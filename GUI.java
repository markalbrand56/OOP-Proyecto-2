import javax.swing.*;

public class GUI {

    public GUI(){
        JFrame frame = new JFrame("Hello Tree");      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        frame.setSize(300, 300);        
        frame.setVisible(true);  
        
        // Creando MenuBar y agregando componentes   
        JMenuBar mb = new JMenuBar();       
        JMenu m1 = new JMenu("ARCHIVO");       
        JMenu m2 = new JMenu("Ayuda");       
        mb.add(m1);       
        mb.add(m2);       
        JMenuItem m11 = new JMenuItem("Abrir");       
        JMenuItem m22 = new JMenuItem("Guardar como");       
        m1.add(m11);       
        m1.add(m22); 
    }

}
