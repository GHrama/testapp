package simulation_questionaire;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ProfilingQuestionFrame {
	/**
	 * ask profiling questions
	 * take the variable from the respective classes
	 * @param class for which the question is asked
	 * give out dynamic questions according to variable changes in the class.
	 */
	public static void askQuestion(Class c){
		System.out.println("Each of these options have to be placed in a Category, according to how privacy intrusive you find that option ");
		System.out.println("The following are the Options ::\n");
		ArrayList<Field> al = CommonFunctions.loopClassFieldsOriginalSize(c);
		for(int i = 0 ; i < al.size() ; i++){
			System.out.println(al.get(i).getName().substring(0, 2)+". "+CommonFunctions.refineString(al.get(i).getName())+"\n");
		}
		
		System.out.println("The following are the Categories in which Options can be placed ::\n");
		ArrayList<Field> al1 = CommonFunctions.loopClassFieldsOriginalSize(Categories.class);
		for(int i = 0 ; i < al1.size() ; i++){
			System.out.println((i+1)+". "+CommonFunctions.refineString(al1.get(i).getName())+"\n");
		}
		System.out.println("The option and the respective category should be separated by a hyphen.");
		System.out.println("Each option-category set should be space separated.");
		System.out.println("For example ::\n"+al.get(0).getName().substring(0, 2)+"-"+1);
		System.out.println("The above means that the Option "+CommonFunctions.refineString(al.get(0).getName())+" is considered "+CommonFunctions.refineString(al1.get(0).getName()));
		System.out.println("Another example ::\n"+al.get(1).getName().substring(0, 2)+"-"+2);
		System.out.println("The above means that the Option "+CommonFunctions.refineString(al.get(1).getName())+" is considered "+CommonFunctions.refineString(al1.get(1).getName()));
	}
}