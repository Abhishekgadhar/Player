
public class Cricket extends Player{
	int wickets;
	int runs;
	 Cricket(String name,int age, double height,String country,int wickets,int runs){
		super( name, age, height, country);
		this.wickets=wickets;
		this.runs=runs;
	}
   void displayCricketStats() {
	   super.displayInfo();
	   System.out.println(this.runs);
	   System.out.println(this.wickets);
	  
   }
}
