package d7_interface_demo;

import java.util.ArrayList;

public class StudentOperatorImpl2 implements StudentOperator {
    @Override
    public void printAllInfo(ArrayList<Student> students) {
        System.out.println("------------全班全部学生-------------");
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("姓名：" + s.getName() + " 性别：" + s.getSex() + " 分数：" + s.getScore());
            if(s.getSex() == '男'){
                count1++;
            }else{
                count2++;
            }
        }
        System.out.println("男生的数量为：" + count1 + "女生的数量为：" + count2);

    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        double AllScore = 0.0;
        double MaxScore = 0.0;
        double MinScore = 1000;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            AllScore += s.getScore();
            MaxScore  = Math.max(MaxScore, s.getScore());
            MinScore  = Math.min(MinScore, s.getScore());
        }
        System.out.println("平均成绩" + (AllScore - MaxScore - MinScore) / (students.size() - 2));
        System.out.println("最高分：" + MaxScore);
        System.out.println("最低分：" + MinScore);
    }
}
