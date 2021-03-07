package oneDimensionalArray;

public class OneDimensionArray {
	int[] arr = null;

	//constructor
	public OneDimensionArray(int sizeOfArray) {
		arr = new int[sizeOfArray];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
		System.out.println("Array of size " + sizeOfArray + " is created");
	}
	
	//traversing array
	public void traverse() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	//inserting into array
	public void insertIntoArray(int location, int valueToInsert) {
		try {
			arr[location] = valueToInsert;
			System.out.println("Inserted value: " + valueToInsert + " at location: " + location);
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is not found or out of range");
		}
	}
	
	//access cell value in array
	public void accessCellValue(int location) {
		try {
			System.out.println("Accessing cell number #" + location);
			System.out.println(arr[location]);
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is not found or out of range");
		}
	}
	
	//search in array
	public void searchInArray(int valueToSearch) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == valueToSearch) {
				System.out.println("Found value: " + valueToSearch + " at location " + i);
				return;
			}
		}
		System.out.println("Value " + valueToSearch + " not found");
	}
	
	//delete a given cell's value from array
	public void deleteValueFromArray(int location) {
		try {
			System.out.println("Deleting value from cell #" + location);
			arr[location] = Integer.MIN_VALUE;	
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is not found or out of range");
		}
	}
	
	
	
	
}
