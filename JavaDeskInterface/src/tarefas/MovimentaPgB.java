package tarefas;

import javax.swing.JProgressBar;

public class MovimentaPgB extends Thread {
	
	private JProgressBar progressBar;
	private EventosPgB pgPrincipal;
	
	private boolean continua;
	
	public MovimentaPgB( JProgressBar progressBar ) {
		this.progressBar = progressBar;
	}
	
	@Override
	public void run() {

		continua = true;
		for( int i = 0; i <= progressBar.getMaximum() && continua; i++ ) {
			progressBar.setValue( i );
			try {
				sleep( 100 );
			} catch (InterruptedException e) {
				
			}
		}	
	}
	
	public void finaliza() {
		continua = false;
	}
}





