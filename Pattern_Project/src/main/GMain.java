package main;

public class GMain {
	static private GMainFrame mainFrame;
	public static void main(String[] args) {
		mainFrame = new GMainFrame();
		mainFrame.initialize(); // �޸� �Ҵ��� �Ϸ� �� �ٽ� �ϴ� �۾�.
		mainFrame.setVisible(true);
	}

}
