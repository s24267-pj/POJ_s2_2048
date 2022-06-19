package src;

import javax.swing.*;
import java.awt.*;

public class komorka extends JComponent {
    static final int ROZMIAR = 100;

    private int wartosc;

    public int getWartosc(){
        return wartosc;
    }
    public void setWartosc(int c){
        this.wartosc = c;
    }
    public komorka(int a){
        this.wartosc = a;
        this.setPreferredSize(new Dimension(ROZMIAR,ROZMIAR));

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.add(new komorka(100));
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
