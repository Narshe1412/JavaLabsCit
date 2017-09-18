
public class WaterTankController {
	
	private int CurrentCapacity =0;
	private static final int MAXCAPACITY = 100;
	
	public int getCurrentCapacity() {
		return CurrentCapacity;
	}
	public void setCurrentCapacity(int currentCapacity) {
		CurrentCapacity = currentCapacity;
	}
	
	public String addWater(int amount) {
		
		if (getCurrentCapacity() >= MAXCAPACITY) 
			return "The tank is already full.";
		
		int newTotal = getCurrentCapacity() + amount;
		if (newTotal >= MAXCAPACITY) {
			setCurrentCapacity(MAXCAPACITY);
			return "The water tank has overflow " + (newTotal - MAXCAPACITY) + "l.";
		} else {
			setCurrentCapacity(newTotal);
			return "Added " + amount + "l. to the tank. The tank has now " + newTotal + "l.";
		}
	}
	
	public String removeWater(int amount) {
		if (getCurrentCapacity() == 0) return "The tank is already empty";
		
		int newTotal = getCurrentCapacity() - amount;
		if (newTotal < 0) {
			setCurrentCapacity(0);
			return "The tank is now completely empty. You tried to remove more water than there was.";
		} else {
			setCurrentCapacity(newTotal);
			return "The tank has now " + newTotal + "l.";
		}
	}

}
