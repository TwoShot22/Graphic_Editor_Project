package main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class GMain {
	static private GMainFrame mainFrame;
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mainFrame = new GMainFrame();
		mainFrame.initialize(); // �޸� �Ҵ��� �Ϸ� �� �ٽ� �ϴ� �۾�.
		mainFrame.setVisible(true);
	}

}
