package org.college;

public class College {
	private void collegeName() {
		System.out.println("Greens Technologies");
	}

	private void collegeCode() {
		System.out.println("25879");
	}

	private void collegeRank() {
		System.out.println("25");
	}

	public static void main(String[] args) {
		College co = new College();
		co.collegeName();
		co.collegeCode();
		co.collegeRank();

		Student st = new Student();
		st.studentName();
		st.studentDept();
		st.studentId();

		Dept d = new Dept();
		d.deptName();
		Hostel ho = new Hostel();
		ho.hostelName();
	}
}
