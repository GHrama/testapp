package simulation_questionaire;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

public class UserProfilingBuyers {
	static int corporation;
	static int educational_institution;
//	static int ngo;
	static int size;
	
	UserProfilingBuyers(){
		int count = 0;
		for(Field field: this.getClass().getDeclaredFields()){
			count++;
		}
		size = count-1;
	}
	
	
	
	
	/**
	 * Ask user for the rank
	 * and assign the ranks to the class variables (on a 1 index scale)
	 */
	public void getBuyerRank(Scanner scanner){
		
		try{
			
			System.out.println("You are provided with a set of Data Collectors(Refered to as Options)");
			ProfilingQuestionFrame.askQuestion(UserProfilingBuyers.class);
			ArrayList<String> parts = new ArrayList<String>();
			int counter = 0;
			for(counter = 0;counter < size;counter++){
				parts.add(scanner.next());
			}
			for(int i = 0; i< parts.size(); i++){
				switch(parts.get(i).substring(0,2)){
				case "co": corporation = Categories.getRankCategories(parts.get(i).substring(3,4)); break;
				case "ed": educational_institution = Categories.getRankCategories(parts.get(i).substring(3,4)); break;
//				case "no": ngo = Categories.getRankCategories(parts.get(i).substring(3,4)); break;
				default : System.out.println("Mistake in given input");
				}
			}
		}
		finally{
//			if(scanner!=null)
//				scanner.close();
		}
	}

}
