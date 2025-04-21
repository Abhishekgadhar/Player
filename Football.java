
public class Football extends Player{
        
		 int goals;
         String position;
        Football(String name,int age, double height,String country,int goals,String position){
        	super(name,age,height,country);
        	this.goals=goals;
        	this.position=position;
        }
    
        void displayFootballStats() {
           
     	   super.displayInfo();
     	   System.out.println(this.goals);
     	   System.out.println(this.position);
     	  
        }
}
