/* Name: Mackenzie Cooper
*	ID:	V#00892515
*	Date: April 8th 2018
* 	Filename: Heap.java
*  Details: \CSC115\ Assignment 5
*/

/**
 * Heap.java
 * Provide the necessary header information here, 
 * making sure to delete these lines.
 */


import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon;

// This is the beginning of the source code to help you get started.
// Do not change the following:

/*
* The class Heap contains methods for
* creating a Heap binary tree data Structure
* The heap is used in the EmergencyTriage class for
* arranging patience at the hospital based on priority.
*/

public class Heap<E extends Comparable<E>> {

	private ArrayList<E> heap;
	private int size;
	private static final int CAPACITY = 100;

	/*
	* Main Method
	* Used for internal testing
	*/

	/*
	public static void main(String[] args) {
	
	Heap<ERPatient> h = new Heap<ERPatient>();
	h.insert(new ERPatient("Number", "7", "Ambulatory"));
	h.insert(new ERPatient("Number", "1", "Life-threatening"));
	h.insert(new ERPatient("Number", "3", "Major fracture"));
	h.insert(new ERPatient("Number", "4", "Acute"));
	h.insert(new ERPatient("Number", "2", "Life-threatening"));
	h.insert(new ERPatient("Number", "5", "Chronic"));
	h.insert(new ERPatient("Number", "6", "Chronic"));
	
	h.insert(new ERPatient("Number", "11", "Life-threatening"));
	h.insert(new ERPatient("Number", "12", "Life-threatening"));
	h.insert(new ERPatient("Number", "13", "Life-threatening"));
	h.insert(new ERPatient("Number", "14", "Life-threatening"));
	h.insert(new ERPatient("Number", "15", "Life-threatening"));
	
	System.out.println(h.getRootItem());
	System.out.println(h.getRootItem());
	System.out.println(h.getRootItem());
	System.out.println(h.getRootItem());
	System.out.println(h.getRootItem());
	System.out.println(h.getRootItem());
	System.out.println(h.getRootItem());
	System.out.println(h.getRootItem());
	System.out.println(h.getRootItem());
	System.out.println(h.getRootItem());
	System.out.println(h.getRootItem());
	System.out.println(h.getRootItem());
	
	// System.out.println(h.size());
	// System.out.println(h.isEmpty());
	/*
	h.getRootItem();
	h.getRootItem();
	h.getRootItem();
	h.getRootItem();
	h.getRootItem();
	h.getRootItem();
	h.getRootItem();
	h.getRootItem();
	h.getRootItem();
	h.getRootItem();
	h.getRootItem();
	h.getRootItem();
	System.out.println(h.isEmpty());
	

	
	}
	
	/**
	* Creates an empty heap.
	*/
	//}

	public Heap() {
		//Given to us before code
		heap = new ArrayList<E>(CAPACITY);
		for (int i = 0; i < CAPACITY; i++) {
			heap.add(null);
		}
	}

	/*
	* method to remove the element currently at the root of the heap
	* input: None
	* returns : Element at root position in the heap.
	*/

	public E getRootItem() throws NoSuchElementException {
		if (heap.isEmpty()) {
			throw new NoSuchElementException("The Heap is Empty");
		}
		E temp = heap.get(0);
		heap.set(0, heap.get(size - 1));
		heap.set((size - 1), null);
		trimTreeRecur(0);
		size--;

		//Write a helper method to sort that element down, using recursion

		return temp;
	}

	//Uses Recursion for helper method of getRootItem()
	private void trimTreeRecur(int root) {
		//Done	
		int leftTree = root * 2 + 1;
		int rightTree = root * 2 + 2;
		int tree = leftTree;

		if (heap.get(leftTree) != null) {
			if (heap.get(rightTree) != null && heap.get(rightTree).compareTo(heap.get(leftTree)) < 0) {
				tree = rightTree;
			}
			if (heap.get(root).compareTo(heap.get(tree)) > 0) {
				E tmp = heap.get(root);
				heap.set(root, heap.get(tree));
				heap.set(tree, tmp);
				trimTreeRecur(tree);
			}
		}
	}
	/*
	* Adds an element to the heap at a target location
	* input: element wanting to be inserted
	* returns : Nothing
	*/

	public void insert(E element) {
		//Done	
		int target = size;
		heap.set(size++, element);
		int ancest = (target - 1) / 2;
		while (ancest >= 0 && heap.get(target).compareTo(heap.get(ancest)) < 0) {
			E temp = heap.get(ancest);
			heap.set(ancest, heap.get(target));
			heap.set(target, temp);
			target = ancest;
			ancest = (target - 1) / 2;
		}
	}
	/*
	* isEmpty() method, returns a boolean 
	* based on if the heap is empty or not.
	*/

	public boolean isEmpty() {
		//Done	
		if (size == 0) {
			return true;
		}
		return false;
	}
	/*
	* input: Nothing
	* returns : The number of elements in the heap
	*/

	public int size() {
		//Done	
		return this.size;
	}

}
