package br.feevale;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;

public class TratamentoDeErros {
	
	public static void main(String[] args) {
		System.out.println( "Antes de chamar o m�todo" );
		try {
			abreArquivo( "c:\\temp\\arquivoExemplo.txt" );
			carregaClasse( "org.postgresql.Driver" );
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch( Exception e ) {
			// aqui � o c�digo pra qualquer tipo de excess�o
		} finally {
			// o c�digo inserido dentro do bloco "finally" ser� executado
			// com ou sem exception. 
		}
		
		System.out.println( "Depois de chamar o m�todo" );
	}

	private static void carregaClasse( String classe ) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Class<?> c = Class.forName( classe );
		c.newInstance();
		
	}

	private static void abreArquivo(String path) throws IOException {

		System.out.println( "Antes de abrir o arquivo" );
		
		try {
			FileInputStream fis = new FileInputStream( path );
			
			try {
				System.out.println( "Depois de abrir o arquivo" );
			} finally {
				fis.close();
			}
			
		} catch( FileNotFoundException e ) {
			e.printStackTrace();
			JOptionPane.showMessageDialog( null, "N�o encontrei o arquivo: " + e.getMessage() );
		}
		
	}
}




