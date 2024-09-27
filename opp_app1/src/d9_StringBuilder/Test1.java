package d9_StringBuilder;

import java.util.StringJoiner;

public class Test1 {
    public static void main(String[] args) {
        int arr[] = {11 ,22 ,33};
        System.out.println(getData(arr));
    }

    public static String getData(int arr[]){
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(String.valueOf(arr[i]));
        }
        return sj.toString();
    }

}
