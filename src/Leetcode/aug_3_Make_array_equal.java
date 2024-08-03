package Leetcode;
import java.util.*;
public class aug_3_Make_array_equal {
    public static void main(String[] args) {

    }
        public boolean canBeEqual(int[] target, int[] arr) {
            int[] cnt1 = new int[1001];
            int[] cnt2 = new int[1001];
            for (int v : target) {
                ++cnt1[v];
            }
            for (int v : arr) {
                ++cnt2[v];
            }
            return Arrays.equals(cnt1, cnt2);


            // Arrays.sort(arr); Arrays.sort(target);
            // if(Arrays.equals(target,arr))return true;
            // return false;

    }
}
