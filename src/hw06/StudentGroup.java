package hw06;

public class StudentGroup {
	String groupSubject;
	Student[] students;
	int freePlaces;

	StudentGroup(String groupSubject, Student[] students, int freePlaces) {
		this.groupSubject = groupSubject;
		this.students = students;
		this.freePlaces = freePlaces;
	}

	StudentGroup() {
		this.students = new Student[5];
		freePlaces = 5;
	}

	StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
	}

	void addStudent(Student s) {
		if (this.groupSubject.equals(s.subject) && freePlaces > 0) {
			int i;
			for (i = 0; i < 5; i++) {
				if (students[i] == null) {
					students[i] = s;
					freePlaces--;
					break;
				}
			}
			System.out.println("The student " + students[i].name + " is in the group.");
		}
	}

	void emptyGroup() {
		for (int i = 0; i < 5; i++) {
			students[i] = null;
		}
		freePlaces = 5;
		System.out.println("The group is empty.");
	}

	String theBestStudent() {
		String srus = students[0].name;
		for (int i = 0; i < students.length-1; i++) {
			if(students[i + 1]==null){
				break;
			}
			if (students[i].grade < students[i + 1].grade) {
				srus = students[i + 1].name;
			}
		}
		System.out.println("The best student is :" + srus);
		return srus;
	}

	void printStudentsInGroup() {
		for (int i = 0; i < 5; i++) {
			if(students[i]==null){
				break;
			}
			System.out.println(students[i].name);
			System.out.println(students[i].grade);
			System.out.println(students[i].yearInCollege);
			System.out.println(students[i].age);
			System.out.println(students[i].isDegree);
			System.out.println(students[i].yearInCollege);
			System.out.println(students[i].money);
		}
	}
}
