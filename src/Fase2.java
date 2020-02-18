import java.util.ArrayList;
public class Fase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "P1EDRO";
		
		//generating the ArrayList since String (name) and printing it
		ArrayList<Character> listName = new ArrayList<Character>();
		
		for (int i=0; i< name.length(); i++) {
			
			listName.add(name.charAt(i));
		}
		
		System.out.println(listName);
		
		boolean haveNumber=false;
		
		//reading all the ArrayList's values and printing if they are "consonat, vowel or numeric"
		for (int i=0; i< listName.size(); i++) {
			
			
			if (Character.isDigit(listName.get(i))) {
				
				System.out.println(listName.get(i)+" es un Numero");
				haveNumber=true;
				
			}else if(listName.get(i)=='a'||listName.get(i)=='e'||listName.get(i)=='i'
					||listName.get(i)=='o'||listName.get(i)=='u'||listName.get(i)=='A'
					||listName.get(i)=='E'||listName.get(i)=='I'||listName.get(i)=='O'
					||listName.get(i)=='U') {
				
				System.out.println(listName.get(i)+" es vocal");
			}else {
				
				System.out.println(listName.get(i)+" es Consonate");
			}
			
		}
		// the arrayList has numeric's values or not?
		if (haveNumber==true) {
			System.out.println("Los nombres no tienen Numeros");	
		}
		}
	}


