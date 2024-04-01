package presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGame extends JFrame implements ActionListener{
    final ImageIcon image = new ImageIcon(getClass().getClassLoader().getResource("./images/rei.png"));
    final JTextField jog1 = new JTextField();
    final JTextField jog2 = new JTextField();
    final JButton btnNovoJogo = new JButton("Novo Jogo");
    final JButton btnConfirmar = new JButton("Confirmar");
    final JPanel panel1 = new JPanel(new FlowLayout());
    final JPanel panel2 = new JPanel(new FlowLayout());
    final JPanel panel3 = new JPanel(new FlowLayout());
    final JPanel panel4 = new JPanel(new FlowLayout());
    final JPanel panel5 = new JPanel(new FlowLayout());
    final JPanel panel6 = new JPanel(new FlowLayout());
    final JPanel panel7 = new JPanel(new FlowLayout());
    final JLabel lblTitulo = new JLabel();
    final JLabel lblJogador2 = new JLabel();
    public MainGame(){
        //Label da tela
        lblTitulo.setText("Xadrez");
        lblTitulo.setFont(new Font("Tahoma",Font.BOLD,70));

        //Botao da tela
        btnNovoJogo.setFont(new Font("Tahoma",Font.PLAIN,20));
        btnNovoJogo.setBackground(new Color(0xadd8e6));
        btnNovoJogo.setForeground(new Color(0xffffff));
        btnNovoJogo.setFocusable(false);
        btnNovoJogo.addActionListener(this);
        //Painel superior
        panel2.add(lblTitulo);
        //Painel central
        panel3.add(btnNovoJogo);
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
        if(e.getSource()== btnNovoJogo){
            //Remove a pagina anterior
            btnNovoJogo.setEnabled(false);
            btnNovoJogo.setVisible(false);
            this.setLayout(new GridLayout(7,1));
            this.add(panel5);
            this.add(panel6);
            this.add(panel7);

            //Jogador 1
            lblTitulo.setText("Jogador 1");
            lblTitulo.setFont(new Font("Tahoma",Font.BOLD,40));
            jog1.setPreferredSize(new Dimension(300,30));
            jog1.setForeground(new Color(0x000000));
            panel3.add(jog1);

            //Jogador 2
            lblJogador2.setText("Jogador 2");
            lblJogador2.setFont(new Font("Tahoma",Font.BOLD,40));
            panel4.add(lblJogador2);
            jog2.setPreferredSize(new Dimension(300,30));
            jog2.setForeground(new Color(0x000000));
            panel5.add(jog2);

            //Botao para a chamada do jogo
            btnConfirmar.setFont(new Font("Tahoma",Font.PLAIN,20));
            btnConfirmar.setBackground(new Color(0xadd8e6));
            btnConfirmar.setForeground(new Color(0xffffff));
            btnConfirmar.setFocusable(false);
            btnConfirmar.addActionListener(this);
            panel6.add(btnConfirmar);

        }
        if(e.getSource()== btnConfirmar){
            // Implementar lógica de iniciar o jogo
            this.dispose();
        }
    }


    public static void main(String[] a)
    {
            new MainGame();
    }
}
