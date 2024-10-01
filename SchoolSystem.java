

package SchoolSystemPackage;

import java.util.Scanner;

class Person{

    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
        else{
            this.age = 0;
        }
    }
    public void introduce(){

        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Person's Details ...");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}

class Student extends Person{

    private double studentId;

    public void setStudentId(double studentId){
        this.studentId = studentId;
    }
    public double getStudentId(){
        return studentId;
    }
    public void introduce(){

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("Student's Details ...");
        System.out.println("Student id : "+studentId);
        System.out.println("Name : "+getName());
        System.out.println("Age : "+getAge());
    
    }
    public void study(){
        System.out.println("Student is Studying JAVA Subject ...");
    }
}

class Teacher extends Person{

    private String subject;

    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    public void introduce(){

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Teacher's Details ...");
        System.out.println("Name : "+getName());
        System.out.println("Age : "+getAge());
        System.out.println("Subject : "+subject);
    }
    public void teach(){
        System.out.println("Teacher is Teaching JAVA Subject ...");
    }
}


public class SchoolSystem {
    public static void main(String[] args) {
    
        Person person1 = new Person();
        Student student1 = new Student();
        Teacher teacher1 = new Teacher();


        System.out.println();
        System.out.println("Enter Person Details : ");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name :  ");
        String name = sc.next();
        System.out.print("Enter Age :  ");
        int age = sc.nextInt();

        person1.setName(name);
        person1.setAge(age);

        System.out.println();
        System.out.println("Enter Student Details : ");
        System.out.print("Enter Student Id :  ");
        double id = sc.nextDouble();
        System.out.print("Enter Name :  ");
        name = sc.next();
        System.out.print("Enter Age :  ");
        age = sc.nextInt();

        student1.setStudentId(id);
        student1.setName(name); 
        student1.setAge(age);   

        System.out.println();
        System.out.println("Enter Teacher Details : ");
        System.out.print("Enter Name :  ");
        name = sc.next();
        System.out.print("Enter Age :  ");
        age = sc.nextInt();
        System.out.print("Enter Subject : ");
        String subject = sc.next();

        teacher1.setName(name);
        teacher1.setAge(age);
        teacher1.setSubject(subject);


        System.out.println("======================================================");
        System.out.println();
        System.out.println("Person's Details ....");
        System.out.println("Name : " + person1.getName());
        System.out.println("Age : " + person1.getAge());

        System.out.println();
        System.out.println("Student's Details ....");
        System.out.println("Student Id : " + student1.getStudentId());
        System.out.println("Name : " + student1.getName());
        System.out.println("Age : " + student1.getAge());
        student1.study();

        System.out.println();
        System.out.println("Teacher's Details ....");
        System.out.println("Name : " + teacher1.getName());
        System.out.println("Age : " + teacher1.getAge());
        System.out.println("Subject : " + teacher1.getSubject());
        teacher1.teach();

        sc.close();

    }
}
