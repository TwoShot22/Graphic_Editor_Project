package global;

import shape.GEllipse;
import shape.GFreeLine;
import shape.GGroup;
import shape.GLine;
import shape.GPolygon;
import shape.GRectangle;
import shape.GShape;

public class Constants {
	
	public enum EMainFrame {
		x(200),
		y(100),
		w(800),
		h(600),
		;
		
		private int value;
		
		private EMainFrame(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return this.value;
		}
	}
	
	public enum EToolBar {
		rectangle("�׸�", new GRectangle(), "rsc/Rectangle.png", "rsc/Rectangle_Selected.png"),
		ellipse("��",new GEllipse(), "rsc/Ellipse.png","rsc/Ellipse_Selected.png"),
		line("��",new GLine(), "rsc/Line.png","rsc/Line_Selected.png"),
		freeLine("�����", new GFreeLine(), "rsc/FreeLine.png","rsc/FreeLine_Selected.png"),
		select("����", new GGroup(), "rsc/Selection.png","rsc/Selection_Selected.png"),
		;
		private String text, image, selectedImage;
		private GShape shape;
		
		private EToolBar(String text, GShape shape, String image, String selectedImage) {
			this.text = text;
			this.image = image;
			this.shape = shape;
			this.selectedImage = selectedImage;
		}
		public String getText() {
			return this.text;
		}
		public String getImage() {
			return this.image;
		}
		public GShape getShape() {
			return this.shape;
		}
		public String getSelectedImage() {
			return this.selectedImage;
		}
	}
	
	public enum EMenu {
		fileMenu("����"),
		editMenu("Edit"),
		;
		private String text;
		private EMenu(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
	}
	public enum EFileMenu {
		newItem("���� �����", "nnew"),
		openItem("����", "open"),
		saveItem("����", "save"),
		saveAsItem("�ٸ��̸�����", "saveAs"),
		printItem("�μ��ϱ�","print"),
		closeItem("�ݱ�", "close"),
		;
		private String text;
		private String method;
		private EFileMenu(String text, String method) {
			this.text = text;
			this.method = method;
		}
		public String getText() {
			return this.text;
		}
		public String getMethod() {
			return this.method;
		}
	}
	
	public enum EEditMenu {
		undo("�ǵ�����", "undo"),
		redo("�ٽý���", "redo"),
		cut("�߶󳻱�", "cut"),
		copy("�����ϱ�", "copy"),
		paste("�ٿ��ֱ�","paste"),
		group("������", "group"),
		ungroup("������", "ungroup"),
		fill("ä���", "fill"), 
		delete("�����", "delete")
		;
		private String text;
		private String method;
		private EEditMenu(String text, String method) {
			this.text = text;
			this.method = method;
		}
		public String getText() {
			return this.text;
		}
		public String getMethod() {
			return this.method;
		}
	}
}
