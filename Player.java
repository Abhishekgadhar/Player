
public class Player {
	private String name;
	private int age;
	private double height;
	private String country;
	Player(String name,int age, double height,String country){
		this.name=name;
		this.age=age;
		this.height=height;
		this.country=country;
				
	}
	String getname() {
		return name;
	}
	int getage() {
		return age;
	}
	double getheight() {
		return height;
	}
	String getcountry() {
		return country;
	}
//	void setname(String name) {
//		this.name=name;
//	}
//	void setage(int age) {
//		this.age=age;
//	}
//	void setheight(double height) {
//		this.height=height;
//		
//	}
//	void setcountry(String country) {
//		this.country=country;
//	}
    void displayInfo() {
    	System.out.println(this.getname());
    	System.out.println(this.getage());
    	System.out.println(this.getheight());
    	System.out.println(this.getcountry());
    }
}
