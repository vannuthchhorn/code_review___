//CHALLENGE1

public static void main(String[] args) {
    int[] listNumber = {40, 50, 10, 5};
		
		int resultOfNumber= listNumber[0];
        // find maximum number in listNumber
		for(int i= 1; i<listNumber.length; i++) {
			if(listNumber[i]>resultOfNumber) {
				resultOfNumber = listNumber[i];
			}
		}
		System.out.println(resultOfNumber);
}

//CHALLENGE2    
// find the last letter of text in array list
// add the last letter to listNewStringOfText
public static List<String> doOperation(List<String> listStringOfText) {
    List<String> listNewStringOfText = new ArrayList<String>();
    for (int numberStringOfText = listStringOfText.size()-1; numberStringOfText >= 0; numberStringOfText--) {
        listNewStringOfText.add(listStringOfText.get(numberStringOfText));
    }
    return listNewStringOfText;
}

//CHALLENGE3
public static boolean isContainsnegativeNumber(List<Integer> list) {
    boolean isNegativeNumber = false;
    // find negative number in array list
    for (Integer integer : list) {
        if(integer<0) {
            return true;
        }
    }
    return isNegativeNumber;
}

//CHALLENGE4
public static double averageSalary = 500;	
    // count average salary that low
	public static void countEmployeeSalaryBelowAverage(List<Employee> words) {
	   int countLowAverageSalaryOfEmployee = 0;	  
	   for (Employee word: words) {
	       if (word.getSalary() < averageSalary) {
               ++countLowAverageSalaryOfEmployee;	      
           } 
	   }
	   System.out.println("There are "+countLowAverageSalaryOfEmployee+" emplyees");
	}

//CHALLENGE5
public class Rectangle {
	
	public static int width;
	public static int height;
	// calculate area of ractangle
	public double calculateArea() {
		return width*height;
	}

}

public class Triangle {
	
	public static int width;
	public static int height;
    private final int DEFAUL_VALUE_OF_TRANGLE = 2;
	// calculate area of trangle
	public double calculateArea() {
		return (width * height) / DEFAUL_VALUE_OF_TRANGLE;
	}

}

//CHALLENGE6

//calculate the net salary
public static double calculateNetSalary(double salary){		
    int netSalaryOfFirstly = 0;
    int salaryLessThanOrEqual300 = 300;
    int salaryLessThanOrEqual600 = 600
    int salaryLessThanOrEqual1000 = 1000;
    
    int taxDefaultOfSalary = 0.3;
    int taxSalaryOf600 = 0.15;
    int taxSalaryOf1000 = 0.2;
    if(salary<=salaryLessThanOrEqual300){
        netSalaryOfFirstly=salary;
    }else if(salary <= salaryLessThanOrEqual600){
        netSalaryOfFirstly -= salary * taxSalaryOf600;
    }else if(salary <= salaryLessThanOrEqual1000) {
        netSalaryOfFirstly -= salary * taxSalaryOf1000;
    }else {
        netSalaryOfFirstly -= salary * taxDefaultOfSalary;
    }
    return netSalaryOfFirstly;		
}