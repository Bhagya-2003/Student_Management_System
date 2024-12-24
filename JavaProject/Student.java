package JavaProject;

class Student implements Comparable<Student> {
    private int rollno;
    private String name;
    private double marks;
    private String degree;  

    // Constructor 
    Student(int rollno, String name, double marks, String degree) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
        this.degree = degree;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public String getDegree() {
        return degree;
    }

    @Override
    public String toString() {
        return "rollno : "+rollno + "| Name : " + name       +"| Mark : " + marks  + "| Degree : " +  degree;
    }

	@Override
	public int compareTo(Student o) {
		return this.rollno;
	}
    
}
