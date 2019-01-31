class Quadrilateral{

    private double length;
    private double width;


    public Quadrilateral(double length, double width){
	this.length = length;
	this.width = width;
    }

    public void setLength(double length){
	this.length = length;
    }

    public double getLength(){
	return this.length;
    }

    public void setWidth(double width){
	this.width = width;
    }

    public double getWidth(){
	return this.width;
    }
	
    public double perimeter() {
	return (this.length * 2 + this.width * 2);
    }

    public double area() {
	return (this.length * this.width);
    }

    public boolean isSquare() {
	return (this.length == this.width) ? true : false;
    }

    public String toString() {
	return "Length : " + this.length + " Width : " + this.width + " Perimeter : " + perimeter() + " Area : " + area() + " -> " + (isSquare() ? "It's a square" : "It's not a square");
    }
}
