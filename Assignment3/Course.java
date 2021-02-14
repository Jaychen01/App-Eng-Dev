package Assignment3;

import java.util.Arrays;

public class Course {

	
	private int courseId;
	private String courseName;
	private int maxCapacity;
	private int professorId;
	private int credits;
	private int[] studentIds;
	
	Course(int courseId, String courseName, int maxCapacity, int professorId, int credits, int[] studentIds){
		this.courseId = courseId;
		this.courseName = courseName;
		this.maxCapacity = maxCapacity;
		this.professorId = professorId;
		this.credits = credits;
		this.studentIds = studentIds;		
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		if (courseId > 0) {
			this.courseId = courseId;
		} else {
			System.out.println("Error in courseId");
		}
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		if (courseName.length() >= 10 && courseName.length() <= 60) {
			this.courseName = courseName;
		} else {
			System.out.println("Error in courseName");
		}
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		if (maxCapacity >= 10 && maxCapacity <= 100) {
			this.maxCapacity = maxCapacity;
		} else {
			System.out.println("Error in maxCapacity");
		}
	}

	public int getProfessorId() {
		return professorId;
	}

	public void setProfessorId(int professorId) {
		String str = Integer.toString(professorId);
		if (str.length() == 6) {
			this.professorId = professorId;
		} else {
			System.out.println("Error in professorId");
		}
	}

	public int getcredits() {
		return credits;
	}

	public void setcredits(int credits) {
		if (credits > 0 && credits < 10) {
			this.credits = credits;
		} else {
			System.out.println("Error in credits");
		}
	}

	public int[] getStudentIds() {
		return studentIds;
	}

	public void setStudentIds(int[] studentIds) {
		this.studentIds = studentIds;
	}


	public Course(int courseId) {
		this.courseId = courseId;
	}

	public Course(int courseId, int professorId) {
		this.courseId = courseId;
		this.professorId = professorId;
		
	}

	public Course(int courseId, int professorId, int credits) {
		this.courseId = courseId;
		this.professorId = professorId;
		this.credits = credits;
	}
	

	public int[] registerStudent(int studentId) { 
		if (studentId == 0) {
			System.out.println("Error in studentId");
		}
		if (maxCapacity < 10 || maxCapacity > 100) {
			System.out.println("Error in maxCapacity");
		}
						
		if (studentIds == null) {
			studentIds = new int [maxCapacity];			
		}
		boolean isSucceed = false;
		for(int i = 0; i < studentIds.length;i++) {
			if (studentIds[i] == 0) {
				studentIds[i] = studentId;
				isSucceed = true;
				break;
			}
		}
			if (isSucceed = false) {
			System.out.println("Course is full");
			}
		return studentIds;
	
	}
		
	
	public int[] removeDuplicates(int[] studentIds) {
		
		if (studentIds.length == 0) {
			return null;
		} 
		else {
		for(int i = 0; i < studentIds.length; i++) {
			for(int j = i+1; j < studentIds.length; j++) {
				if(studentIds[j] == studentIds[i]) {
					for(int k = j+1; k < studentIds.length; k++) {
						studentIds[k-1] = studentIds[k];
					}
					studentIds = Arrays.copyOf(studentIds, studentIds.length - 1);
					j--;
				}
			}
			}
		}
		return studentIds;
		
	}
			
			
		
	public int groupsOfStudents(int[] studentIds) {
		
		int numOfEven = 0, numOfOdd = 0;
		for (int i = 0; i < studentIds.length; i++) {
			if (studentIds[i] <= 0) {
				System.out.println("Error in studentId");
			}
			if (studentIds[i] % 2 == 0) {
				numOfEven++;
			} else {
				numOfOdd++;
			}
		} 
		int num = (numOfEven * (numOfEven - 1) + numOfOdd * (numOfOdd - 1)) / 2;
		return num;

	}

	public static void main(String[] args) {
		Course cc = new Course(1);
		int[] s = {1,2,3,4,5,6,7,8,9,10,11};
		System.out.println(cc.groupsOfStudents(s));
		
//		cc.registerStudent(10);
		

		

	}

}
