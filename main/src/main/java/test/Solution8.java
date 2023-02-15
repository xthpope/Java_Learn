package test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author : xutinghao
 * @date : 2022/3/26 11:10
 * @description :
 */
public class Solution8 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;
        while(i >= 0 && j < matrix[0].length)
        {
            if(matrix[i][j] > target) i--;
            else if(matrix[i][j] < target) j++;
            else return true;
        }
        return false;
    }

    public static void main(String[] args){
        int[] ints = {-5};
        int[] [] i =  {ints};
        boolean numberIn2DArray = new Solution8().findNumberIn2DArray(i, -10);
        System.out.println(numberIn2DArray);
    }
}
