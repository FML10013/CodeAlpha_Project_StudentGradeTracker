package Task_1;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		ArrayList<Double> grades = new ArrayList<>();
		
		int numofStud;
		do {
			System.out.print("Enter the number of students (min 1): ");
			numofStud = input.nextInt();
		}while(numofStud <1);
		
		//enter the grades in array 
		for (int i = 0; i < numofStud; i++){
            System.out.print("Enter the students grades: ");
            double grade = input.nextDouble();

            if (grade == numofStud) {
                break;
            }

            grades.add((double) grade);
        }
		
		//get highest , lowest, average grades
		
		double highest = CalculateHighest(grades);
		double lowest = CalculateLowest(grades);
		double Average = CalculateAverage(grades);
	
		//print out grade summary
		
		System.out.println("\nGRADE SUMMARY: ");
		System.out.println("The Average grade is : "+ Average);
		System.out.println("The Lowest grade is : "+ lowest);
		System.out.println("The highest grade is : "+ highest);
	}
	

	public static double CalculateAverage(ArrayList<Double> grades) {
		double total = 0.0 ;
		for (double grade : grades) {
			total += grade;
		}
		return total / grades.size();
	}

	public static double CalculateLowest(ArrayList<Double> grades) {
		double lowest = grades.get(0);
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
	}

	public static double CalculateHighest(ArrayList<Double> grades) {
		double highest = grades.get(0);
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
	}

	
}
