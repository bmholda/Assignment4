
public class ManagementCompany {
	private int propmax = 5, depth = 10, width = 10;
	private double fee;
	private String propname;
	private Plot newplot;
	private Property[] details;
	private String id;
	
	public ManagementCompany(String name, String taxID, double mgmFee) {
		this.newplot = new Plot(0, 0, width, depth);
		this.details = new Property[propmax];
		this.propname = name;
		this.id = taxID;
		this.fee = mgmFee;
	}
	public ManagementCompany() {
		this.newplot = new Plot(0, 0, 10, 10);
		details = new Property[propmax];
		this.propname =  " ";
		this.id = " ";
		this.fee = 0;
	}
	public ManagementCompany(ManagementCompany otherCompany) {
		this.newplot = new Plot(otherCompany.newplot);
		this.details = new Property[propmax];
		this.propname = otherCompany.propname;
		this.id = otherCompany.id;
		this.fee = otherCompany.fee;
	}
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int w, int d) {
		this.newplot = new Plot(0, 0, w, d);
		this.details = new Property[propmax];
		this.propname = name;
		this.id = taxID;
		this.fee = mgmFee;
	}
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int w, int d) {
		return addProperty(new Property(name, city, rent, owner, x, y, w, d));
	}
	public int addProperty(Property property) {
		if(details.length == propmax) {
			return -1;
		}else if(!newplot.encompasses(property.getPlot())) {
			return -3;
		}
		for(int i = 0; i < details.length; i++) {
			if(details[i].getPlot().overlaps(property.getPlot())) {
				return -4;
			}
		}
		return -1;
	}
	public int addProperty(String name, String city, double rent, String owner) {
		return addProperty(new Property(name,city,rent,owner));
	}
	
	public String displayPropertyAtIndex(int i) {
		String flag = details[i].toString();
		return flag;
	}
	public int getMAX_PROPERTY() {
		return propmax;
	}
	public double getMgmFeePer() {
		return fee;
	}
	public String getTaxID() {
		return id;
	}
	public String getName() {
		return propname;
	}
	public Plot getPlot() {
		return newplot;
	}
	public int maxRentPropertyIndex() {
		int i = 0;
		for(int k = 0; k < details.length; k++) {
			if(details[k].getRentAmount() >= details[i].getRentAmount()) {
				i = k;
			}
		}
		return i;
	}
	public double maxRentProp() {
		double sum = 0;
		for(Property prop : details) {
			if(sum <= prop.getRentAmount()) {
				sum = prop.getRentAmount();
			}
		}
		return sum;
	}
	
	public void setMgmFeePer(double mgmFeePer) {
		this.fee = mgmFeePer;
	}
	
	public Plot setPlot(int x, int y, int w, int d) {
		newplot = new Plot(x,y,w,d);
		return newplot;
	}
	public double totalRent() {
		double sum= 0;
		for(Property p : details) {
			sum+=p.getRentAmount();
		}
		return sum;
	}
	public void setTaxID(String taxID) {
		this.id = taxID;
	}
	public void setName(String name) {
		this.propname = name;
	}
	public String toString() {
		String allText = "";
		for(int i = 0; i < details.length; i++) {
			allText+=details[i].toString() + "\n";
		}
		return "Properties owned by: " + propname + "\n" + allText + "\nTotal: "+ (totalRent());
	}
	
}
