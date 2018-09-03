import java.util.Scanner;
import java.lang.Math.*;
class Student {
	String name;
	String rollno;
	double m1, m2, m3;

    Student(String name, String rollnum, double m1, double m2, double m3) {
	    this.name = name;
	    this.rollno = rollnum;
	    this.m1 = m1;
	    this.m2 = m2;
	    this.m3 = m3;
    }
    public static double gpa(double m1, double m2, double m3) {
	    double gpa;
	    gpa = (m1+m2+m3)/3;
	    return (Math.floor(gpa * 10)) / 10;
    }
}
class StudentDetails {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String rollno = sc.nextLine();	
		double m1 = sc.nextDouble();
    	double m2 = sc.nextDouble();
    	double m3 = sc.nextDouble();
    	Student s = new Student(name, rollno, m1, m2, m3);
    	System.out.println(s.gpa(m1, m2, m3));
    }
} 
    