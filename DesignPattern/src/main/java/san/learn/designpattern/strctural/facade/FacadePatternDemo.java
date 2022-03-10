package san.learn.designpattern.strctural.facade;

public class FacadePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeDrawer sd = new ShapeDrawer();
		
		sd.drawCircle();
		sd.drawRectangle();
	}

}
