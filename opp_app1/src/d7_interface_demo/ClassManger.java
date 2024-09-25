package d7_interface_demo;

import d2_polymorphism.Teacher;

import java.util.ArrayList;

public class ClassManger {
    private ArrayList<Student> students = new ArrayList<>();
    private StudentOperator studentOperator = new StudentOperatorImpl2();



    public ClassManger() {
        Student s1 = new Student("迪丽热巴" ,'男' , 90);
        Student s2 = new Student("周杰伦" ,'男' , 100);
        Student s3 = new Student("周星驰" ,'男' , 100);
        Student s4 = new Student("大正" ,'男' , 100);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
    }

    public void printInfo(){
        studentOperator.printAllInfo(students);
    }

    public  void printScore(){
        studentOperator.printAverageScore(students);
    }

}
