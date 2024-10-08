package regexTest01;

import java.util.Scanner;

public class regextest1 {
    public static void main(String[] args) {
        checkPhone();
    }

    public static void checkPhone(){
        while (true){
            System.out.println("请输入您的电话|座机：");
            Scanner sc = new Scanner(System.in);
            String phone = sc.nextLine();
            if(phone.matches("(1[3-9]\\d{9})|(0\\d{2,7}-?(1-9)\\d{4,19})")){
                System.out.println("您输入的号码格式正确~~");
                break;
            }else{
                System.out.println("您输入的代码格式不正确！！！");
            }
        }
    }
}
