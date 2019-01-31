public class Point {

    private int x;
    private int y;


    public Point(int x, int y){

	this.x = x;
	this.y = y;
    }

    public Point(){

	this.x = 0;
	this.y = 0;

    }

    public void setX(int x){

	this.x = x;

    }

    public int getX(){

	return this.x;

    }

    public void setY(int y){

	this.y = y;

    }

    public int getY(){

	return this.y;

    }

    public int distanceTo(Point p){

	
	return (int)Math.sqrt((p.y - getY()) * (p.y - getY()) + (p.x - getX()) * (p.x - getX()));

    }
}
    
