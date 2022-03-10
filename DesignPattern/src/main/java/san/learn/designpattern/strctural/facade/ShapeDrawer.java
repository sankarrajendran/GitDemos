package san.learn.designpattern.strctural.facade;

public class ShapeDrawer {

	private Shape circle;
	private Shape rectangle;
	public ShapeDrawer() {
		super();
		this.circle = new Circle();
		this.rectangle = new Rectangle();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
	
}
