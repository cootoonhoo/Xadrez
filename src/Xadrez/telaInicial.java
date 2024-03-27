package Xadrez;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaInicial extends JFrame implements ActionListener{
    final ImageIcon image = new ImageIcon(getClass().getClassLoader().getResource("./images/rei.png"));
    
    final JButton botao = new JButton("New Game");
    final JPanel panel1 = new JPanel(new FlowLayout());
    final JPanel panel2 = new JPanel(new FlowLayout());
    final JPanel panel3 = new JPanel(new FlowLayout());
    final JPanel panel4 = new JPanel(new FlowLayout());
    final JLabel label = new JLabel();
    public TelaInicial(){
        //Label da tela
        label.setText("Chess");
        label.setFont(new Font("Tahoma",Font.BOLD,70));
        
        //Botao da tela
        botao.setFont(new Font("Tahoma",Font.PLAIN,20));
        botao.setBackground(new Color(0xadd8e6));
        botao.setForeground(new Color(0xffffff));
        botao.setFocusable(false);
        botao.addActionListener(this);
        //Painel superior
        panel2.add(label);
        //Painel central
        panel3.add(botao);
        //Frame tela inicial
        this.setTitle("Xadrez");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(1000,750);
        this.setLayout(new GridLayout(4,1));
        this.setIconImage(image.getImage());
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.add(panel4);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==botao){
            
        }
    }
}
