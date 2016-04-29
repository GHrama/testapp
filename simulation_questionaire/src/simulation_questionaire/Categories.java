package simulation_questionaire;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * @author ramapriyasridharan
 * has a number of catgories
 * rank from most comfortable to least comfortable
 * This is for the initial ranking
 * 
 */
public class Categories {
	static int very_low_privacy_intrusion = 1;
	static int low_privacy_intrusion = 2;
	static int medium_privacy_intrusion = 3;
	static int high_privacy_intrusion = 4;
	static int very_high_privacy_intrusion = 5;
	static int size; // number of categories
	
	
	Categories(){
		int count = 0;
		for(Field field: this.getClass().getDeclaredFields()){
			count++;
		}
		size = count-1;
	}
	/**
	 * This method is used to return the rank 
	 * according to the input string
	 * which corresponds to the input category
	 * @param cat
	 * @return the rank of the sensor,data collector or context according to the category assigned
	 */
	public static int getRankCategories(String cat){
	switch(cat){
	case "1": return very_low_privacy_intrusion; // not very privacy intrusive
	case "2": return low_privacy_intrusion; // slightly privacy intrusive
	case "3": return medium_privacy_intrusion;
	case "4": return high_privacy_intrusion;
	case "5": return very_high_privacy_intrusion;// very privacy intrusive
	default : return 0;
	}
	}
	
	public static double getWeightFromRank(int rank){
		//System.out.println("Giveb rank :::"+rank);
		double w = 0;
		w = ((double)1/size)*rank;
		// size is the number of categories to put things into
		return w;
	}
}
