package model;
/*You should have a Calendar class and it should have a maximum of ten tasks within it. 
 * Your Calendar class should have the ability to 
Add a Task
Remove a Task (the last one)
Return how many tasks are in the system.
Return the String representation of a Task in the array
Return the String representation of all Task objects in the array.*/

public class Calendar {
	
	public final int COLLECTION_MAX_SIZE=10;
	private Task[] Collection = new Task[COLLECTION_MAX_SIZE];
	private int index = 0; 
	
	
	public void addTask(String name, int hours) {
		Task task = new Task(name, hours);
		Collection[index] = task;
	//	Collection[index].setName(name);       //////////////////////////////
	//	Collection[index].setHours(hours);     //////////////////////////////
		index++;
	}
	
	public void removeTask(){
		//Collection[index] = null; 			////////////////////////////
		index--;
	}
	
	public int getTaskCount(){
		return index;
	}
	
	public String getTask(int id){
		return Collection[id].toString();
	}
	
	public String toString() {
		String result = "";
		if (index==0) {
			result = "There are no tasks";
		} else {
			for (int i=0; i<index; i++) {
				result += Collection[i].toString() + "\n";
			}
		}
		return result;
	}
}
