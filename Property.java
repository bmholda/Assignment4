
public class Property {
	private String place, user, username;
	private double cost;
	private Plot plot;
	public Property() {
		this.plot = new Plot();
		this.place = " ";
		this.user = " ";
		this.username = " ";
		this.cost = 0;
	}
	public Property(Property currentp) {
		this.plot = new Plot(currentp.plot);
		this.place = currentp.place;
		this.user = currentp.user;
		this.username = currentp.username;
		this.cost = currentp.cost;
	}
	public void setPropertyName() {
		this.username = username;
	}
	public void setRentAmount() {
		this.cost = cost;
	}
	public Plot getPlot() {
		return plot;
	}
	public Property(String city, String owner, double rent, String pname) {
		this.plot = new Plot();
		this.place = city;
		this.user = owner;
		this.username = pname;
		this.cost = rent;
	}
	public String getPropertyName() {
		return username;
	}
	public double getRentAmount() {
		return cost;
	}
	public Plot setPlot(int x, int y, int w, int d) {
		return new Plot(x,y,w,d);
	}
	public void setCity() {
		this.place = place;
	}
	public Property(String city, String owner, double rent, String pname, int x, int y, int d, int w) {
		this.place = city;
		this.user = owner;
		this.username = pname;
		this.cost = rent;
		this.plot = new Plot(x, y, w, d);
	}
	public String getCity() {
		return place;
	}
	public String getOwner() {
		return user;
	}
	public void setOwner() {
		this.user = user;
	}

	public String toString() {
		return "Property: " + username + "\nCity:" + place + "\nOwned By: " + user + "\nCurrent Cost: " + cost;
	}
}
