import java.util.ArrayList;
import java.util.HashMap;

public class Fase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Character, Integer> nameMap = new HashMap<Character, Integer>();
		
		String name = "PEREZ";
		
		//generating the ArrayList since String (name) and printing it
		
		ArrayList<Character> listName = new ArrayList<Character>();
		
		for (int i=0; i< name.length(); i++) {
			
			listName.add(name.charAt(i));
		}
		
		System.out.println(listName);
		
		
		// comparing each char with every others and creating the map
		for (int i=0; i<listName.size(); i++) {
			
			int letterRepeat = 0;
			
			for( int j=0; j<listName.size(); j++) {
				
				
				if (listName.get(i)==listName.get(j)) { 
					letterRepeat = letterRepeat+1;
					}
				nameMap.put(listName.get(i),letterRepeat);
			}
		}
		System.out.println(nameMap);
	}

}
