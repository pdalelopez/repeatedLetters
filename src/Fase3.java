import java.util.ArrayList;
import java.util.HashMap;

public class Fase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Character, Integer> nameMap = new HashMap<Character, Integer>();
		
		String name = "PEPE";
		
		//generating the ArrayList since String (name) and printing it
		ArrayList<Character> listName = new ArrayList<Character>();
		
		for (int i=0; i< name.length(); i++) {
			
			listName.add(name.charAt(i));
		}
		
		System.out.println(listName);
	}

}
