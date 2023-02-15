package exam;

/**
 * 二分查找
 * @author : xutinghao
 * @date : 2023/2/9 16:28
 * @description :
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[] {-1,0,3,5,9,12};
        int target = 9;
        int i = binarySearch(arr, target);
        System.out.println(i);
    }

    public static int binarySearch(int[] arr,int target){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int middle = left + ((right-left)/2);
            if(arr[middle] == target){
                return middle;
            }else if(arr[middle] < target){
                left = middle +1;
            }else if(arr[middle] > target){
                right = middle - 1;
            }
        }
        return -1;
    }
}
