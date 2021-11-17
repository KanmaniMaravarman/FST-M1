package activities;

public class Activity6 {
	
	  public static void main(String[] args) throws InterruptedException
	  {
		  Plane plane = new Plane(10);
		  
		  // add the passengers
		  plane.onboard("Kanmani");
		  plane.onboard("Maran");
		  
		  System.out.println("plane take off time"+plane.takeOff());
		  System.out.println("passengers name :"+plane.getPassengers());
		  Thread.sleep(5000);
		  plane.land();
		  System.out.println("plane last time landed :"+plane.getLastTimeLanded());
		  System.out.println("People on the plane after landing: " + plane.getPassengers());
		  
		  
		  
	  }

}
