import javax.swing.SwingUtilities;

import ui.MainWindow;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(() -> {
			MainWindow win = new MainWindow();
			win.setResizable(false);
			win.getClass();
		});
	}

}
