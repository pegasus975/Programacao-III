/*
 * JavaDeskInterface
 * CopyRight Rech Informática Ltda. Todos os direitos reservados.
 */
package calculadora;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author 0147477
 */

/*2) Desenvolva ainda outra interface extendendo um JFrame, que deverá simular
 uma espécie de "calculadora" simples.  Esta calculadora deverá ser composta de
 dois campos texto (JTextField), um ao lado do outro, separados por um JComboBox.

 Cada um dos campos de texto representam os operandos de expressões matemáticas,
 enquanto que o JComboBox conterá as operações matemáticas que deverão ser realizadas.

 Quando o usuário pressionar um botão "executar", também adicionado à calculadora,
 o resultado da operação cuja descrição encontra-se exibida no combo box,
 realizada sobre os dois operadores, deverá ser exibido em um JLabel que vc vai
 adicionar à interface para este propósito.

 Para fazer isto, você deverá criar
 uma classe para cada operação que você quiser implementar e estas classes é que
 devem ser adicionadas ao combo box (à exemplo dos 'Animais' adicionados no combo
 box do exemplo anexo).

 Quando o usuário pressionar o botão "executar",
 os dois operandos deverão ser adicionados ao objeto selecionado no combo box,
 que então executará a operação entre eles, e devolverá o resultado que será exibido no JLabel.*/
public class Calculadora extends JFrame implements ActionListener {

    JComboBox<Interface> operadores = new JComboBox();
    // Operando 1
    JTextField op1 = new JTextField();
    // Operando 2
    JTextField op2 = new JTextField();
    // Label que vai exibir o resultado
    JLabel res = new JLabel();
    
    int nrLinha = 0;

    /**
     * Contrutor da classe calculadora
     */
    private Calculadora() {
        setTitle("Calculadora");
        setBounds(37, 75, 460, 150);

        setLayout(null);
        Container container = getContentPane();
        container.setBackground(new Color(106, 145, 255));
        // Cria uma espécie de subtitulo
        criaLabel("Calculadora Básica", 10, 200);
        
        // TextFields
        op1.setBounds(4, 37, 100, 27);
        getContentPane().add(op1);
        op2.setBounds(220, 37, 100, 27);
        getContentPane().add(op2);

        res.setBounds(340, 37, 100, 27);
        getContentPane().add(res);
        res.setText(" = ");
        // Cria a combobox com os operadores
        operadores = new JComboBox<>();
        operadores.addItem(new Soma());
        operadores.addItem(new Subtrai());
        operadores.addItem(new Multiplica());
        operadores.addItem(new Divide());

        operadores.setBounds(110, 37, 100, 27);
        getContentPane().add(operadores);

        JButton exec = new JButton("Executar");
        exec.setBounds(110, 37, 100, 27);
        getContentPane().add(exec);
        exec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Float ope1 = Float.parseFloat(op1.getText());
                Float ope2 = Float.parseFloat(op2.getText());

                Interface in = (Interface) operadores.getSelectedItem();
                
                in.calcula(ope1, ope2);
                res.setText(" = " + in.getResultado());
            }
        });
        // Rotinas finais
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
         

    /**
     * Responsável por executar o construtor
     *
     */
    public static void main(String[] args) {
        new Calculadora();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Cria um label de acordo com os parâmetros
     * @param nome
     * @param pos
     * @param lar 
     */
    public void criaLabel(String nome, int pos, int lar){
        JLabel l = new JLabel(nome);
        l.setBounds(pos, nrLinha, lar, 27);
        getContentPane().add(l);
    }    
    
    
}
