public class Point {
    // write your code here
	
	private int x;
	private int y;
	
	
	
	public Point() {
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public double distance() {
		
	
		
		return distance(0,0);
				
	}
	
	public double distance(int x, int y) {
		
		double dist = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
		
		return dist;
				
	}
	
	public double distance(Point b) {
		
		int a = b.getX();
		int c = b.getY();
		
		
		return distance(a, c);
				
	}
	
	
}