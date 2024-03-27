package Xadrez;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class telaInicial {
    final ImageIcon image = new ImageIcon(getClass().getClassLoader().getResource("./images/rei.png"));
    final JFrame frame = new JFrame();
    final JButton botao = new JButton("New Game");
    final JPanel panel1 = new JPanel(new FlowLayout());
    final JPanel panel2 = new JPanel(new FlowLayout());
    final JPanel panel3 = new JPanel(new FlowLayout());
    final JPanel panel4 = new JPanel(new FlowLayout());
    final JLabel label = new JLabel();
    public telaInicial(){
        //Label da tela
        label.setText("Chess");
        label.setFont(new Font("Tahoma",Font.BOLD,70));
        
        //Botao da tela
        botao.setFont(new Font("Tahoma",Font.PLAIN,20));
        botao.setBackground(new Color(0xadd8e6));
        botao.setForeground(new Color(0xffffff));
        botao.setFocusable(false);
        //Painel superior
        panel2.add(label);
        //Painel central
        panel3.add(botao);
        //Frame tela inicial
        this.frame.setTitle("Xadrez");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setResizable(true);
        this.frame.setSize(1000,750);
        this.frame.setLayout(new GridLayout(4,1));
        this.frame.setIconImage(image.getImage());
        this.frame.add(panel1);
        this.frame.add(panel2);
        this.frame.add(panel3);
        this.frame.add(panel4);
        this.frame.setVisible(true);
        
        
    }
}
