package exercicios;

public class Retangulo {
	
	private double width;
	private double height;
	
	
	
	public Retangulo() {
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
			this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area() {
		return width*height;
	}
	
	public double perimeter() {
		return 2*(width + height);
	}
	
	public double diagonal() {
		double diagonal = Math.sqrt((width*width) + (height*height));
		return diagonal;
	}
	
	@Override
	public String toString() {
		return "AREA: " +
				area() +
				"\n" +
				"PERIMETER: " +
				perimeter() +
				"\n" +
				"DIAGONAL: " +
				diagonal();
	}
	
	


}
