package oneDimensionalArray;

public class OneDimensionArrayMain {

	public static void main(String[] args) {
		
		OneDimensionArray oda = new OneDimensionArray(8);
		
		System.out.println("Traversing array");
		oda.traverse();
		
		oda.insertIntoArray(0, 10);
		oda.insertIntoArray(1, 20);
		oda.insertIntoArray(2, 30);
		oda.insertIntoArray(3, 40);
		oda.insertIntoArray(4, 50);
		oda.insertIntoArray(5, 60);
		oda.insertIntoArray(6, 70);
		oda.insertIntoArray(7, 80);
		oda.insertIntoArray(11, 70);
		oda.insertIntoArray(1, 80);
		
		oda.traverse();
		
		oda.accessCellValue(4);
		oda.accessCellValue(11);
		
		oda.searchInArray(40);
		oda.searchInArray(400);
		
		System.out.println("Before deleting");
		oda.traverse();
		System.out.println("After deleting");
		oda.deleteValueFromArray(6);
		oda.deleteValueFromArray(11);
		oda.traverse();
		

	}

}
