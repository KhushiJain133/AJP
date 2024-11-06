package constructor;

public class Student 
{
	private int sid;
	private String name, course;
	private int age;
	private float marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String name, String course, int age, float marks) 
	{
		this.sid = sid;
		this.name = name;
		this.course = course;
		this.age = age;
		this.marks = marks;
	}

	public int getSid() 
	{
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() 
	{
		return  "=====================================\n"+
				"Studet id: " + sid + 
				"\nName:" + name + 
				"\nCourse=" + course + 
				"\nAge: " + age + 
				"\nMarks=" + marks+
				"\n=====================================";
	}
	
	// alt+shift+s -> generate setters and getters
	
	
}