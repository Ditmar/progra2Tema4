import javax.swing.SwingUtilities;

import ui.MainWindow;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hilo de procesamiento, Runnable
		SwingUtilities.invokeLater(() -> {
			MainWindow win = new MainWindow();
			win.getClass();
		});
		///52, 152, 219
		//#3498db
	}

}
