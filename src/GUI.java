package src;

import javax.swing.*;
import java.awt.*;
import java.lang.Math;

public class GUI {
    public static void main(String[] args){
        /*
        frame - "okno" gry
        panel glowny (lightgray) - w nim znajduje sie panel z plansza oraz teksty
        panel_plansza (rozowy) - grid do gry


         */

        int ROZMIAR_PLANSZY = 16;

        JFrame frame = new JFrame("2048 klon");
        JPanel panel_glowny = new JPanel();
        JLabel Wynik_tekst = new JLabel("Wynik: ");


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600, 800);

        panel_glowny.setBackground(Color.lightGray);
        panel_glowny.setPreferredSize(new Dimension(400,400));
        panel_glowny.setLayout(new BoxLayout(panel_glowny, BoxLayout.Y_AXIS));
        frame.add(panel_glowny);


        JPanel panel_plansza = new JPanel();
        panel_plansza.setLayout(new GridLayout(4,4));

        for (int i = 0; i < ROZMIAR_PLANSZY; i++){
            panel_plansza.add(new JLabel("Cell"));
        }

        panel_plansza.setBackground(Color.pink);
        panel_glowny.add(panel_plansza);
        panel_glowny.add(Wynik_tekst);



        frame.setVisible(true);
    }
}
