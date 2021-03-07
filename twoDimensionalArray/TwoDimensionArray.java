package twoDimensionalArray;

public class TwoDimensionArray {
	int[][] arr = null;
	
	//creating a 2D array
	public TwoDimensionArray(int numberOfRows, int numberOfColumns) {
		arr = new int[numberOfRows][numberOfColumns];
		for(int r = 0; r < arr.length; r++) {
			for(int c = 0; c < arr[0].length; c++) {
				arr[r][c] = Integer.MIN_VALUE;
			}
			
		}
		System.out.println("A 2D array of size " + numberOfRows + "x" + numberOfColumns + " is created");
	}
	
	//traversing a 2D array
	public void traverse() {
		try {
			for(int r = 0; r < arr.length; r++) {
				for(int c = 0; c < arr[0].length; c++) {
					System.out.print(arr[r][c] + " ");
				}
				System.out.println();
				}
			System.out.println();
		}
		catch(Exception e) {
			System.out.println("Array does not exist!");
		}
	}
	
	//insert value into 2D array
	public void insertIntoArray(int rowLoc, int columnLoc, int valueToInsert) {
		try {
			arr[rowLoc][columnLoc] = valueToInsert;
			System.out.println("Value: " + valueToInsert + " is inserted at cell " + rowLoc + "," + columnLoc);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is not found or out of range");
		}
	}
	
	//search a given cell in 2D array
	public void accessCellValue(int rowLoc, int columnLoc) {
		try {
			System.out.println("value " + arr[rowLoc][columnLoc] + " found at cell " + rowLoc + "," + columnLoc);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is not found or out of range");
		}
	}
	
	//searching a given value in 2D array
	public void searchGivenValue(int valueToSearch) {
		for(int r = 0; r < arr.length; r++) {
			for(int c = 0; c < arr[0].length; c++) {
				if(arr[r][c] == valueToSearch) {
					System.out.println("value " + valueToSearch +  " found at row: " + r + " & column: " + c);
					return;
				}
			}
		}
		System.out.println("value " + valueToSearch + " not found!");
	}
	
	//deleting a value from a 2D array
	public void deleteValueFromArray(int rowLoc, int columnLoc) {
		try {
			System.out.println("Successfully deleted " + arr[rowLoc][columnLoc]);
			arr[rowLoc][columnLoc] = Integer.MIN_VALUE;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Cannot delete, Array index is not found or out of range");
		}
	}
	
	//delete entire array
	public void deleteArray() {
		arr = null;
		System.out.println("Array has been successfully deleted");
	}
	
}
