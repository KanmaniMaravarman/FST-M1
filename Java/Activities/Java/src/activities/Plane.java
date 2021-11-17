package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	
	private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
	
    public Plane(int maxPassenger){
		maxPassengers = maxPassenger;
        passengers = new ArrayList<>();
	}
	public void onboard(String passenger) {
        passengers.add(passenger);
    }
	
	public Date takeOff() {
		lastTimeTookOf = new Date();
        return lastTimeTookOf;
	}
	
	public void land() {
		lastTimeLanded = new Date();
        passengers.clear();
	}
	 public Date getLastTimeLanded() {
	        return lastTimeLanded;
	    }

	    public List<String> getPassengers() {
	        return passengers;
	    }


}
