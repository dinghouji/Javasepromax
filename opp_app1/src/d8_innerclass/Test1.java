package d8_innerclass;

public class Test1 {
    public static void main(String[] args) {
//        Swimming s1 = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("狗在游泳~~");
//            }
//        };
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("狗在游泳~~");
            }
        });
    }
    public static void go(Swimming s){
        System.out.println("开始----------------");
        s.swim();

    }

}



interface Swimming {
    void swim();
}