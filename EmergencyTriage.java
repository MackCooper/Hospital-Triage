/* Name: Mackenzie Cooper
*	ID:	V#00892515
*	Date: April 8th 2018
* 	Filename: Heap.java
*  Details: \CSC115\ Assignment 5
*/


/**
 * EmergencyTriage.java
 * Provided the necessary information here,
 * making sure to delete these lines.
 */

// This is the beginning of the source code to help you get started.
// Do not change the following:


public class EmergencyTriage {
	private Heap<ERPatient> waiting;

	/**
	 * The empty EmergencyTriage is initialized.
	 */
	public EmergencyTriage() {
		waiting = new Heap<>();
	}

	/*
	public static void main(String[] args) {
		EmergencyTriage t = new EmergencyTriage();
		t.register("Number", "7", "Ambulatory");
		t.register("Number", "1", "Life-threatening");
		t.register("Number", "3", "Major fracture");
		t.register("Number", "4", "Acute");
		t.register("Number", "2", "Life-threatening");
		t.register("Number", "5", "Chronic");
		t.register("Number", "6", "Chronic");
		System.out.println(t.numberOfPatientsWaiting());
		for (int i = 0; i < 7; i++) {
			System.out.println(t.admitToER());
	
		}
	}
	*/
	
	/*
	* Removes the highest priority patient from triage to enter the Emergency Room.
	* input: Nothing
	* returns : 
	*/
	public ERPatient admitToER() {
		//Done
		return waiting.getRootItem();
	}

	/*
	* Converts kilograms to pounds.
	* input: The number of kilograms
	* returns : The patient needing to be moved.
	*/
	public int numberOfPatientsWaiting() {
		//Done
		return waiting.size();
	}

	/*
	* Registers a new patient in to the hospital. The nurse at the front takes the patients first and last name, while
	* at the same time assigns them a triage category, which is used to assess their priority to be treated.
	* input: lastName, firstName, as well as the triageCategory.
	* returns : Nothing.
	*/
	public void register(String lastName, String firstName, String triageCategory) {
		//Done
		waiting.insert(new ERPatient(lastName, firstName, triageCategory));
	}

	/*
	* WhoisNext method, which Retrieves the record of the patient who currently 
	* has the highest priority. The patient's record remains in the queue.
	* input: nothing
	* returns : The patient who has the highest priority.
	*/
	ERPatient whoIsNext() {
		return null;
	}

}
