/*
 * JavaDeskInterface
 * CopyRight Rech Informática Ltda. Todos os direitos reservados.
 */
package calculadora;

/**
 * Descrição da classe.
 */
public abstract class Interface{
    double resultado;
    
    /**
     * Calcula o resultado com base em dois operandos recebidos por parâmetro
     * @param valor1
     * @param valor2 
     */
    public void calcula(float valor1, float valor2){
       
    }
    
    /**
     * Retorna o resultado do calculo convertido para String
     *
     * @return resultado
     */
    public String getResultado(){
        return String.valueOf(resultado);
    }


}
