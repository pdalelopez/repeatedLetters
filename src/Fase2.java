import java.util.ArrayList;
public class Fase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "PEDRO";
		ArrayList listName = new ArrayList();
		
		
		for (int i=0; i< name.length(); i++) {
			
			listName.add(name.charAt(i));
			
		}
		
		System.out.println(listName);
		
		
		for (int i=0; i< listName.size(); i++) {
			
	
			
			if (((char)listName.get(i))=='a') {
				
				System.out.println(listName.get(i)+" es vocal");
			}else {
				
				System.out.println(listName.get(i)+" NO es vocal");
			}
			
				
			}
			
		}
	}


