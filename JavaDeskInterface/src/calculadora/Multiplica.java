/*
 * JavaDeskInterface
 * CopyRight Rech Informática Ltda. Todos os direitos reservados.
 */
package calculadora;

/**
 * Descrição da classe.
 */
public class Multiplica extends Interface {

    private String nome = "*";

    /**
     * Calcula o resultado com base em dois operandos recebidos por parâmetro
     *
     * @param valor1
     * @param valor2
     */
    @Override
    public void calcula(float valor1, float valor2) {
        resultado = valor1 * valor2;
    }

    /**
     * Retorna o conteúdo que vai ser exibido na combo box
     *
     * @return
     */
    @Override
    public String toString() {
        return "*";
    }

    /**
     * Retorna o resultado do calculo convertido para String
     *
     * @return resultado
     */
    @Override
    public String getResultado() {
        return String.valueOf(resultado);
    }

}
