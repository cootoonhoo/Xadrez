package Xadrez;

import java.awt.Color;
import java.awt.Dimension;
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
import javax.swing.JTextField;

public class TelaInicial extends JFrame implements ActionListener{
    final ImageIcon image = new ImageIcon(getClass().getClassLoader().getResource("./images/rei.png"));
    final JTextField jog1 = new JTextField();
    final JTextField jog2 = new JTextField();
    final JButton botao = new JButton("New Game");
    final JButton botao2 = new JButton("Confirmar");
    final JPanel panel1 = new JPanel(new FlowLayout());
    final JPanel panel2 = new JPanel(new FlowLayout());
    final JPanel panel3 = new JPanel(new FlowLayout());
    final JPanel panel4 = new JPanel(new FlowLayout());
    final JPanel panel5 = new JPanel(new FlowLayout());
    final JPanel panel6 = new JPanel(new FlowLayout());
    final JPanel panel7 = new JPanel(new FlowLayout());
    final JLabel label1 = new JLabel();
    final JLabel label2 = new JLabel();
    public TelaInicial(){
        //Label da tela
        label1.setText("Chess");
        label1.setFont(new Font("Tahoma",Font.BOLD,70));
        
        //Botao da tela
        botao.setFont(new Font("Tahoma",Font.PLAIN,20));
        botao.setBackground(new Color(0xadd8e6));
        botao.setForeground(new Color(0xffffff));
        botao.setFocusable(false);
        botao.addActionListener(this);
        //Painel superior
        panel2.add(label1);
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
    
    //Funcionalidade do botao
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==botao){
            //Remove a pagina anterior
            botao.setEnabled(false);
            botao.setVisible(false);
            this.setLayout(new GridLayout(7,1));
            this.add(panel5);
            this.add(panel6);
            this.add(panel7);
            
            //Jogador 1
            label1.setText("Jogador 1");
            label1.setFont(new Font("Tahoma",Font.BOLD,40));
            jog1.setPreferredSize(new Dimension(300,30));
            jog1.setForeground(new Color(0xadd8e6));
            panel3.add(jog1);
            
            //Jogador 2
            label2.setText("Jogador 2");
            label2.setFont(new Font("Tahoma",Font.BOLD,40));
            panel4.add(label2);
            jog2.setPreferredSize(new Dimension(300,30));
            jog2.setForeground(new Color(0xadd8e6));
            panel5.add(jog2);
            
            //Botao para a chamada do jogo
            botao2.setFont(new Font("Tahoma",Font.PLAIN,20));
            botao2.setBackground(new Color(0xadd8e6));
            botao2.setForeground(new Color(0xffffff));
            botao2.setFocusable(false);
            botao2.addActionListener(this);
            panel6.add(botao2);
            
        }
        if(e.getSource()==botao2){
            System.out.println("cookie");
        }
    }

   
}
