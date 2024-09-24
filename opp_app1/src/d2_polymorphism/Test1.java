package d2_polymorphism;

public class Test1 {
    public static void main(String[] args) {
        People p = new Student();
        People p1 = new Teacher();
        p.run();
        p1.run();
        if(p instanceof Teacher){
            Teacher t = (Teacher) p;
            t.teach();
        }else{
            Student s = (Student) p;
            s.say();
        }
    }
}
