import java.util.ArrayList;
public class Fase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "P1EDRO";
		String lastName = "LOPEZ";
		//generating the ArrayList since String (name) and printing it
		ArrayList<Character> listName = new ArrayList<Character>();
		
		for (int i=0; i< name.length(); i++) {
			
			listName.add(name.charAt(i));
		}
		
		System.out.println(listName);
		
		ArrayList<Character> listLastName = new ArrayList<Character>();
		
		for (int i=0; i< lastName.length(); i++) {
			
			listLastName.add(lastName.charAt(i));
		}
		
		System.out.println(listLastName);
	}

}
