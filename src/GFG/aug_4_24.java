package GFG;
import java.util.*;
public class aug_4_24 {
    public static void main(String[] args) {

    }
//    class Solution {
        // Function to find the maximum number of meetings that can
        // be performed in a meeting room.
        public int maxMeetings(int n, int start[], int end[]) {
            // add your code here
            ArrayList<int[]>list=new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(new int[]{start[i],end[i]});
            }
            Collections.sort(list, new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {
                    int compareEnd = Integer.compare(a[1], b[1]);
                    if (compareEnd != 0) {
                        return compareEnd;
                    }
                    return Integer.compare(b[0], a[0]);
                }
            });
            int cnt=0;
            for(int i=0;i<n;){
                int limit=list.get(i)[1];
                cnt++;
                while(i<n&&list.get(i)[0]<=limit){
                    i++;
                }

            }
            return cnt;
        }
}
