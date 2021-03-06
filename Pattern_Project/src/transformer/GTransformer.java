package transformer;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.AffineTransform;
import java.util.Vector;

import shape.GShape;

public abstract class GTransformer {

	protected GShape gShape;
	protected Point oldPoint;
	protected Point anchorPoint;
	protected AffineTransform affineTransform;
	protected Vector<GShape> groupList;
	
	public GTransformer() {
		this.setgShape(null);
		this.oldPoint = new Point(0, 0);
		this.anchorPoint = new Point(0, 0);
		this.affineTransform = new AffineTransform();
		this.groupList = new Vector<GShape>();
	}
	
	public GShape getgShape() { return gShape; }
	public void setgShape(GShape gShape) { this.gShape = gShape; }
	
	public void setOldPoint(int x, int y){
		this.oldPoint.x = x;	
		this.oldPoint.y = y;
	}
	
	public Point getAnchorP(){
		return anchorPoint;
	}
	
	public Vector<GShape> getGroupList() {
		return groupList;
	}
	
	public void setGroupList(Vector<GShape> groupList) {
		this.groupList = groupList;
	}
	
	abstract public void initTransforming(Graphics2D graphics2d, int x, int y);
	
	abstract public void keepTransforming(Graphics2D graphics2d, int x, int y);
	
	abstract public void finishTransforming(Graphics2D graphics2d, int x, int y);

}
