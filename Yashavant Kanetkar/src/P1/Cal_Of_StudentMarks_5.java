package P1;

public class Cal_Of_StudentMarks_5 {
	public static void main(String[] args) {
		int sub_1 = 80, sub_2 = 90, sub_3 = 97, sub_4 = 95, sub_5 = 87;
		int total_marks;
		float agg_marks, per_marks;
		total_marks = sub_1 + sub_2 + sub_3 + sub_4 + sub_5; 
		agg_marks = total_marks/5f;
		per_marks = (total_marks/500f)*100f;
		System.out.println("Subject 1 = " + sub_1 + "\tSubject 2 = " + sub_2 + "\tSubject 3 = " + sub_3 + "\tSubject 4 = " + sub_4 + "\tSubject 5 = " + sub_5);
		System.out.println("Total Marks = " + total_marks);
		System.out.println("Aggregate Marks = " + agg_marks);
		System.out.println("Percentage Marks = " + per_marks + "%");
	}
}
