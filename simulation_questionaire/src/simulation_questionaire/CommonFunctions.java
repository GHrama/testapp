package simulation_questionaire;

import java.lang.reflect.Field;
import java.util.ArrayList;


public class CommonFunctions {
	
	
	/**
	 * @param obj
	 * @return the number name of the object fields
	 */
	static public ArrayList<String> loopObjectFields(Object obj){
		ArrayList<String> objectfields = new ArrayList<String>();
		for(Field field: obj.getClass().getDeclaredFields()){
			objectfields.add(field.getName());
		}
		return objectfields;
	}
	// objectfields.length() + number of fields
	// using the name can access the 
	
	/**
	 * @param obj
	 * @return number of object fields in the given object
	 */
	static public int countObjectFields(Object obj){
		int count = 0;
		for(Field field: obj.getClass().getDeclaredFields()){
			count++;
		}
		return count;
	}
	
	/**
	 * @param c
	 * @return get all field names in a class string array list
	 */
	static public ArrayList<String> loopClassFields(Class c){
		ArrayList<String> classfields = new ArrayList<String>();
		for(Field field: c.getDeclaredFields()){
			classfields.add(field.getName());
		}
		return classfields;
	}
	
	/**
	 * @param c
	 * @return get number of fields in a class
	 */
	static public int countClassFields(Class c){
		int count = 0;
		for(Field field: c.getDeclaredFields()){
			count++;
		}
		return count;
	}
	
	static public ArrayList<Field> loopClassFieldsOriginal(Class c){
		ArrayList<Field> classfields = new ArrayList<Field>();
		for(Field field: c.getDeclaredFields()){
			classfields.add(field);
		}
		return classfields;
	}
	
	static public ArrayList<Field> loopClassFieldsOriginalSize(Class c){
		ArrayList<Field> classfields = new ArrayList<Field>();
		for(Field field: c.getDeclaredFields()){
			classfields.add(field);
		}
		int i = 0;
		// remove field size
		while(i < classfields.size()){
			if(classfields.get(i).getName().equalsIgnoreCase("size")){
				classfields.remove(i);
				break;
			}
			else
			{
				++i;
			}
		}
		return classfields;
	}
	
	static public ArrayList<Field> loopObjectFieldsOriginal(Object o){
		ArrayList<Field> classfields = new ArrayList<Field>();
		for(Field field: o.getClass().getDeclaredFields()){
			classfields.add(field);
		}
		return classfields;
	}
	
	static public void printArrayList(double[][][] array){
		for(int i=0;i<array.length;i++){	
			System.out.println();
			System.out.println();
			for(int j=0;j<array[0].length;j++){	
				System.out.println();
				for(int k=0;k<array[0][1].length;k++){
					System.out.print(array[i][j][k]+" ");
				}
			}
		}
		
		
	}
	
	/**
	 * TO DO
	 * makes the underscores into spaces
	 * and makes the first letter of each word capital (Presentation)
	 * @param s
	 * @return
	 */
	static public String refineString(String s){
		s  = s.replaceAll("_", " ").toLowerCase();
		 String[] words = s.split(" ");
		    StringBuilder ret = new StringBuilder();
		    for(int i = 0; i < words.length; i++) {
		        ret.append(Character.toUpperCase(words[i].charAt(0)));
		        ret.append(words[i].substring(1));
		        if(i < words.length - 1) {
		            ret.append(' ');
		        }
		    }
		 return ret.toString();	
	}
	
	static public String getFirstLetterWord(String s){
		s = s.toLowerCase();
		String[] words = s.split("_");
		StringBuilder ret = new StringBuilder();
		for(int i = 0;i < words.length;i++){
			ret.append(words[i].charAt(0));
		}
		return ret.toString();
	}
	

	
}
