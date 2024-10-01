

package UniversityDepartment;


class User{

    private String userName;
    private String email;

    public User(String userName,String email){
        this.userName = userName;
        this.email = email;
    }

    public String getUserName(){
        return userName;
    }
    public String getEmail(){
        return email;
    }
}

class Professor extends User{

    private String department;

    public String getDepartment(){
        return department;
    }
    public Professor(String userName,String email,String department){
        
        super(userName, email);
        this.department = department;
    }
}

class Course{

    private double code;
    private String course;
    private double creditHours;

    public Course(double code,String course,double creditHours){
        this.code = code;
        this.course = course;
        this.creditHours = creditHours;
    }
    public double getCode(){
        return code;
    }
    public String getCourse(){
        return course;
    }
    public double getCreditHours(){
        return creditHours;
    }
}

class Department {

    private String name;
    private Professor professor1;
    private Course course1;

    public void setName(String name){
        this.name = name;
    }
    public void setProfessor1(Professor professor1){
        this.professor1 = professor1;
    }
    public void setCourse1(Course course1){
        this.course1 = course1;
    }

    public void display(){

        System.out.println();
        System.out.println("=======================================================");
        System.out.println("Department Details ...");
        System.out.println("Department Name : "+name);

        System.out.println();
        System.out.println("Professor Details ...");
        System.out.println("Name : "+professor1.getUserName());
        System.out.println("Email : "+professor1.getEmail());
        System.out.println("Department : "+professor1.getDepartment());

        System.out.println();
        System.out.println("Course Details ...");
        System.out.println("Course Code : "+course1.getCode());
        System.out.println("Course Name : "+course1.getCourse());
        System.out.println("Course CreditHours : "+course1.getCreditHours());

        System.out.println();
    }
}

public class UniversityDepartmentSystem {
    public static void main(String[] args) {
    

        Professor professor = new Professor("PIYUSH", "piyush123@gmail.com", "MSC IT Department");
        Course course = new Course(212121, "JAVA", 3);

        Department csDepartment = new Department();
        csDepartment.setName("Computer Science");

        csDepartment.setProfessor1(professor);
        csDepartment.setCourse1(course);

        csDepartment.display();

    }
}
