package javadeskinterface;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Components extends JFrame implements ActionListener {

    private int nrLinha = 70;
    private int saltoLinha = 27;
    JComboBox<String> cbProd = new JComboBox();

    public Components() {

        setTitle("Exemplo de componentes de Interface");
        setBounds(37, 75, 800, 450);

        setLayout(null);
        Container container = getContentPane();
        container.setBackground(new Color(255, 255, 255));

        JLabel l = new JLabel("FEEVALE - Prog III"); // 1) Criar e configurar o elemento
        l.setBounds(0, 0, 800, 30);		    // 2) Posicionar o elemento na tela
        container.add(l);			    // 3) Adicionar ao Container

        l.setHorizontalAlignment(JLabel.CENTER);
        Color cor = new Color(232, 12, 79);
        l.setBackground(cor);
        l.setOpaque(true);

        Font fonte = new Font("Verdana", Font.BOLD, 20);
        l.setFont(fonte);

        criaCampoEdicao("Código", 100);
        saltaLinha();
        criaCampoEdicao("Nome", 550);
        saltaLinha();
        criaCampoEdicao("Endereco", 550);
        saltaLinha();
        criaCampoEdicao("CEP", 120);
        saltaLinha();
        criaRadio("Homem");
        saltaLinha();
        criaRadio("Mulher");
        saltaLinha();
        criaCheck("Carne");
        saltaLinha();
        criaBtn("Salvar");
        saltaLinha();
        criaTextArea("Area de texto");
        saltaLinha();

        //TODO Importante
        /**
         * combo-box
         */
        cbProd = new JComboBox();
        //Adiciona itens a combo
        cbProd.addItem("bermuda");
        cbProd.addItem("Car");
        cbProd.addItem("Focus");
        cbProd.addItem("celular");
        cbProd.setBounds(100, nrLinha, 200, 27);
        getContentPane().add(cbProd);
        //Ação da combo
        cbProd.addActionListener(this);
        //pegar o item selecionado
        cbProd.getSelectedItem();

        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void criaTextArea(String txt) {
        JTextArea ta = new JTextArea();
        ta.setBounds(100, nrLinha, 100, 23);
        getContentPane().add(ta);
        ta.setText(txt);
        ta.setBackground(Color.red);
    }

    private void grita() {
        JDialog dg = new JDialog();
        dg.show();
        dg.setSize(500, 500);
    }

    /**
     * Cria botão
     *
     * @param txt
     */
    private void criaBtn(String txt) {
        JButton btn = new JButton();
        //x, y, width, height
        btn.setBounds(100, nrLinha, 100, 23);
        getContentPane().add(btn);
        btn.setText(txt);
    }

    /**
     * Criação de uma checkbox
     *
     *
     */
    private void criaCheck(String txt) {
        JCheckBox che = new JCheckBox();
        //x, y, width, height
        che.setBounds(100, nrLinha, 100, 23);
        getContentPane().add(che);
        che.setText(txt);
    }

    /**
     * Criação do radio button
     *
     * @param txt
     */
    private void criaRadio(String txt) {
        JRadioButton r = new JRadioButton();
        r.setBounds(100, nrLinha, 100, 23);
        getContentPane().add(r);
        r.setText(txt);
    }

    /**
     *
     * Criação de label e textfield
     *
     * @param textoLabel
     * @param largura
     */
    private void criaCampoEdicao(String textoLabel, int largura) {

        JLabel l = new JLabel(textoLabel);
        l.setBounds(30, nrLinha, 100, 23);
        getContentPane().add(l);

        JTextField tf = new JTextField();
        tf.setBounds(120, nrLinha, largura, 23);
        getContentPane().add(tf);
    }

    private void saltaLinha() {
        nrLinha += saltoLinha;
    }

    /*public static void main(String[] args) {
        System.out.println("Antes");
        new Components();
        System.out.println("Depois");
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (cbProd.getSelectedItem().equals("bermuda")) {
            System.out.println("R$10,00");
        }
        if (cbProd.getSelectedItem().equals("Car")) {
            System.out.println("R$25.000,00");
        }
        if (cbProd.getSelectedItem().equals("Focus")) {
            System.out.println("R$70.000,00");
        }
        if (cbProd.getSelectedItem().equals("celular")) {
            System.out.println("R$1.360,00");
        }
    }

}
