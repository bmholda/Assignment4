
public class Plot {
	private int xaxis, yaxis, waxis, daxis;
	public Plot() {
		this.xaxis = 0;
		this.yaxis = 0;
		this.waxis = 1;
		this.daxis = 1;
	}
	public Plot(Plot current) {
		this.xaxis = current.xaxis;
		this.yaxis = current.yaxis;
		this.waxis = current.waxis;
		this.daxis = current.daxis;
	}
	public Plot(int x, int y, int w, int d) {
		this.xaxis = x;
		this.yaxis = y;
		this.waxis = w;
		this.daxis = d;
	}
	public boolean overlaps(Plot aPlot) {
		if(yaxis < aPlot.yaxis + aPlot.daxis && yaxis + daxis > aPlot.yaxis) {
			return true;
		}else {
			return false;
		}
	}
	public boolean encompasses(Plot thisPlot) {
		double x, y, newx, newy;
		newx = thisPlot.getX()+thisPlot.getWidth();
		newy = thisPlot.getY()+thisPlot.getDepth();
		x = xaxis+waxis;
		y = xaxis+daxis;
		if(this.xaxis <= x &&this.yaxis <= newy && newy  <= y ) {
			return true;
		}else {
			return false;
		}
	}
	public String toString() {
		return " Coords: (x:" + xaxis + " y: " + yaxis + " Width: " + waxis + " Depth: " + daxis; 
	}
	public void setX(int x)
	{
		this.xaxis = x;
	}
	public void setWidth(int w)
	{
		this.waxis = w;
	}
	public int getX()
	{
		return xaxis;
	}
	public int getWidth()
	{
		return waxis;
	}
	public void setDepth(int d)
	{
		this.daxis = d;
	}
	public void setY(int y)
	{
		this.yaxis = y;
	}

	public int getY()
	{
		return yaxis;
	}
	public int getDepth()
	{
		return daxis;
	}
}
