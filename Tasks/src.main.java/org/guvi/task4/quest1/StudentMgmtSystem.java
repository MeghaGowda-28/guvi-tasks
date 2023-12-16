package org.guvi.task4.quest1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentMgmtSystem {
	
	public static void main(String[] args) throws AgeNotWithinRangeException, NameNotValidException {
		
		Student student1 = new Student(1, "Joseph", 25, "PhD");
		Student student2 = new Student(2, "Abdul28", 21, "BE");
		
		// place the method above to check each exception while running the code.
		checkAge(student1.getAge());
		checkName(student2.getName());
	
	}
	
	/** This method helps in validating the name and throws exception if name field 
	 *  consists of any numeric values.
	 *  
	 * @param name  - {@link Student} name
	 * @throws NameNotValidException
	 */
	private static void checkName(String name) throws NameNotValidException {
		Pattern pattern = Pattern.compile(".*\\d.*");
		Matcher matcher = pattern.matcher(name);
		if(matcher.matches()){
			throw new NameNotValidException("Name consists numeric - not valid");
		}
	}

	/** This method helps in validating age and throws exception accordingly.
	 * 
	 * @param age - {@link Student} age
	 * @throws AgeNotWithinRangeException
	 */
	private static void checkAge(int age) throws AgeNotWithinRangeException{
		if(age < 15 || age > 21){
			throw new AgeNotWithinRangeException("Age is not within range");
		}
	}

}
