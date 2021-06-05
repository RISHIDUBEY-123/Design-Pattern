package com.rishi.jdbc;

interface Pen{
	void write();
}

class PenFactory{
	public static Pen getPen(String type) {
		if(type.equals("bpen")) {
			return new BallPen();
		}else if(type.equals("mpen")) {
			return new MarkerPen();
		}else if(type.equals("spen")) {
			return new SketchPen();
		}else {
			return null;
		}
	}
}

class BallPen implements Pen{
	public void write() {
		System.out.println("Writing with Ball Pen");
	}
}

class MarkerPen implements Pen{
	public void write() {
		System.out.println("Writing with Marker Pen");
	}
}

class SketchPen implements Pen{
	public void write() {
		System.out.println("Writing with Sketch Pen");
	}
}
public class FactoryDesign {

	public static void main(String[] args) {
		Pen p=PenFactory.getPen("dpen");
        p.write();
	}

}
