package exam;

/**
 * 常见算法
 * @author : xutinghao
 * @date : 2023/2/9 13:14
 * @description :
 */
public class Maopao {

    public static void main(String[] args) {
        int[] arr = {1,3,9,7,3,9,3,5};
        int temp;
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
        }
        System.out.println(count);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
