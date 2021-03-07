package twoDimensionalArray;

public class TwoDimensionArrayMain {

	public static void main(String[] args) {
		
		TwoDimensionArray tda = new TwoDimensionArray(2, 3);
		System.out.println();
		tda.traverse();
		
		tda.insertIntoArray(0, 0, 10);
		tda.insertIntoArray(0, 1, 20);
		tda.insertIntoArray(0, 2, 30);
		tda.insertIntoArray(1, 0, 40);
		tda.insertIntoArray(1, 1, 50);
		tda.insertIntoArray(1, 2, 60);
		tda.insertIntoArray(5, 5, 400);
		System.out.println();
		
		tda.traverse();
		tda.accessCellValue(0, 0);
		
		tda.searchGivenValue(50);
		tda.searchGivenValue(400);
		
		System.out.println();
		System.out.println("Before delete");
		System.out.println();
		tda.traverse();
		
		tda.deleteValueFromArray(1, 2);
		System.out.println();
		
		System.out.println("After delete");
		System.out.println();
		tda.traverse();
		
		tda.deleteArray();
		tda.traverse();

	}

}
