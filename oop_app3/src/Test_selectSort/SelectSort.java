package Test_selectSort;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {1 ,30 ,2 ,23 ,99 ,21 ,33 };
        int[] arr1 = {1 ,2 ,3 ,4 ,5 ,6 ,22 ,33 ,77 ,99};
        selectSort(arr);
        System.out.println(binarySearch(arr1, 2));
    }

    public static  void selectSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int max = i;
            for (int j = i + 1; j < n; j++) {
                if(arr[j] < arr[max]) {
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static boolean erfenSearch(int[] arr ,int n) {
        int begin;
        int end;
        for (int i = 0; i < arr.length; i++) {
            begin = i;
            end = arr.length - 1;
            for (int j = i + 1; j < arr.length; j++) {
                int middle = (begin + end)/2;
                if(arr[middle] < n) {
                    begin = middle + 1;
                }
                else{
                    end = middle;
                }
                if(arr[middle] == n) {
                    return true;
                }
            }
        }
        return false;

    }

    public static boolean binarySearch(int[] arr ,int n){
        int begin = 0;
        int end = arr.length - 1;
        while(begin <= end){
            int middle = (begin + end)/2;
            if(arr[middle] == n) {
                return true;
            }
            else if(arr[middle] > n) {
                end = middle - 1;
            }
            else {
                begin = middle + 1;
            }
        }
        return false;
    }
}
