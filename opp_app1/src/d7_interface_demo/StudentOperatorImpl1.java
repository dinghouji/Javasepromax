package d7_interface_demo;

import java.util.ArrayList;

public class StudentOperatorImpl1 implements StudentOperator {
    @Override
    public void printAllInfo(ArrayList<Student> students) {
        System.out.println("------------全班全部学生-------------");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("姓名：" + s.getName() + " 性别：" + s.getSex() + " 分数：" + s.getScore());
        }
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        double AllScore = 0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            AllScore += s.getScore();
        }
        System.out.println("平均成绩" + AllScore / students.size());

    }
}
