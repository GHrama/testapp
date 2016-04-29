package simulation_questionaire;

import java.lang.reflect.Field;
import java.util.Scanner;

public class UserInformation {
	static private String userid;
	static private int year_birth;
	static private int gender; // 1. Male   2. Female
	static private int relationshipstatus; // 1. Single  2. Married
	static private int educationlevel; //  1. High School  2. Bachelor Degree  3. Graduate Degree
	static private int employment; //  1. Multiple times a day 2. Once a day  3.Few times a week 4.Lesser than the above
	static private int educationalbackground; //  1. Computer science (or) Electrical Engineering  2. Other
	static private String countryresidence; // Country 
	static int size;
	
	UserInformation(){
		int count = 0;
		for(Field field: this.getClass().getDeclaredFields()){
			count++;
		}
		size = count-1;
	}
	
	/**
	 * Get information from the user and store
	 * Show user his Identification Number
	 */
	public void getInfoFromUser(Scanner scanner){
		
		try{
			
		
			this.userid = "1"; // auto assigned as users login to application
			System.out.println("Your Identification Number is ="+1);
			System.out.println("What is your year of birth? (Enter number)");
			UserInformation.setYear_birth(scanner.nextInt());
			System.out.println("Enter the number corresponding to your gender : 1. Male  2.Female:");
			this.gender = scanner.nextInt();
			System.out.println("Enter the number corresponding to your relationship status : 1. Single 2. Married :");
			this.relationshipstatus = scanner.nextInt();
			System.out.println("Enter the number corresponding to your educational level : 1. Less than High School 2. High School  3. Bachelor Degree  4. Graduate Degree or more :");
			this.educationlevel = scanner.nextInt();
			System.out.println("Enter the number corresponding to your employment status : 1. Full Time employed 2. Part Time employed 3. Unemployed looking for job 4.Unemployed not looking for job\n"
					+ "4. Student 5.Retired");
			UserInformation.employment = scanner.nextInt();
			System.out.println("Enter the number corresponding to your educational background : 1. Computer science (or) Electrical Engineering  2. Other");
			this.educationalbackground = scanner.nextInt();
			System.out.println("Enter your country of residence (Enter text): ");
			this.countryresidence = scanner.next();
		}
		finally{
//			if(scanner!=null)
//				scanner.close();
		}
		
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getRelationshipstatus() {
		return relationshipstatus;
	}
	public void setRelationshipstatus(int relationshipstatus) {
		this.relationshipstatus = relationshipstatus;
	}
	public int getEducationlevel() {
		return educationlevel;
	}
	public void setEducationlevel(int educationlevel) {
		this.educationlevel = educationlevel;
	}
	public int getEmployment() {
		return employment;
	}
	public void setEmployment(int activesocialmedia) {
		this.employment = activesocialmedia;
	}
	public int getEducationalbackground() {
		return educationalbackground;
	}
	public void setEducationalbackground(int educationalbackground) {
		this.educationalbackground = educationalbackground;
	}
	public String getCountryresidence() {
		return countryresidence;
	}
	public void setCountryresidence(String countryresidence) {
		this.countryresidence = countryresidence;
	}

	public static int getYear_birth() {
		return year_birth;
	}

	public static void setYear_birth(int year_birth) {
		UserInformation.year_birth = year_birth;
	}
	
	
}
