package Threads;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class AplicaTrd extends JFrame implements ActionListener {

    private int nrLinha = 70;
    private int saltoLinha = 27;
    private static JLabel lb;
    public String nomeImagem;
    static ImageIcon img = new ImageIcon();

    public AplicaTrd() {
        setTitle("Sinaleira");
        setBounds(37, 75, 800, 450);

        setLayout(null);
        Container container = getContentPane();
        container.setBackground(new Color(255, 255, 255));

        saltaLinha();
        criaAreaImagem();

        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void criaAreaImagem() {
        lb = new JLabel();
        lb.setBounds(420, nrLinha - (2 * saltoLinha), 67, 167);
        getContentPane().add(lb);

        lb.setOpaque(true);
        lb.setBackground(Color.LIGHT_GRAY);

        img = new ImageIcon(getClass().getResource("/imagens/Vermelho.png"));
        lb.setIcon(img);
        lb.setHorizontalAlignment(JLabel.CENTER);
    }

    private void saltaLinha() {
        nrLinha += saltoLinha;
    }

    public void mudaImagem() {
        nomeImagem = "Vermelho.png";
        img = new ImageIcon(getClass().getResource("/imagens/" + nomeImagem));
        lb.setIcon(img);
    }

    public static void main(String[] args) {
        new AplicaTrd();
        MyThread mt = new MyThread("Child #1", lb);
        mt.run();
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException exc) {
                System.out.println("cabo");
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
