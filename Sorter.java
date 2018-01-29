import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorter {

	public static void main(String[] args) throws Exception {
		File file = new File("C:/Users/cton0/OneDrive/Desktop/ToDo.txt");
		Scanner sc = new Scanner(file);
		ArrayList<ListItem> items = new ArrayList<ListItem>();
		String title = null;
		while (sc.hasNextLine()) {
			if (!sc.hasNextInt()) {
				title = sc.nextLine();
			}
			//System.out.println("Item: " + sc.nextInt() + " " + sc.nextLine());
			try {
				ListItem alpha = new ListItem(sc.nextInt(), sc.nextLine());
				items.add(alpha);
			}
			catch (Exception e) {
				sc.close();
				System.out.println("The file was not formatted correctly.");
			}
		}
		
		// time to sort
		Collections.sort(items);
		// System.out.println(items);
		sc.close();
		
		FileWriter fw = new FileWriter("C:/Users/cton0/OneDrive/Desktop/ToDo.txt", false);
		fw.write(title + System.lineSeparator());
		for(ListItem li :items) {
			fw.write(li.toString() + System.lineSeparator());
		}
		fw.close();
	}

}
