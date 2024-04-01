package presentation;

import javax.swing.*;

public class MainGame extends JFrame {
    public  MainGame()
    {
        setTitle("Xadrez");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] a)
    {
        new MainGame();
    }
}
