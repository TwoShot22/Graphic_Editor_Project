package global;

import shape.GShape;
import shape.GRectangle;
import shape.GPolygon;
import shape.GEllipse;
import shape.GLine;
import shape.GGroup;

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
		rectangle("�׸�", new GRectangle()),
		ellipse("��",new GEllipse()),
		line("��",new GLine()),
		polygon("������", new GPolygon()),
		select("����", new GGroup()),
		;
		private String text;
		private GShape shape;
		private EToolBar(String text, GShape shape) {
			this.text = text;
			this.shape = shape;
		}
		public String getText() {
			return this.text;
		}
		public GShape getShape() {
			return this.shape;
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
		fill("ä���", "fill")
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
