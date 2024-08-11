package GFG;
import java.util.*;
//🛑 Job Sequencing Problem
public class aug_11_24 {
    public static void main(String[] args) {

    }
}



//class Solution
//{
//    //Function to find the maximum profit and the number of jobs done.
//    int[] JobScheduling(int arr[], int n)
//    {
//        // Your code here
//        //sorting according to profit so that max profit job will do first
//        Arrays.sort(arr,(a,b)->(b.profit-a.profit));
//        int max=0; //finding max deadline
//        for(int i=0;i<n;i++){
//            max=Math.max(arr[i].deadline,max);
//        }
//        int res[] = new int [max+1];
//        for(int i=0;i<=max;i++){
//            res[i]=-1; //-1 indicates slot is free
//        }
//        int countJobs=0,jobProfit=0;
//        for(int i=0;i<n;i++){ //arr is sorted acc to max profit
//            for(int j=arr[i].deadline;j>0;j--){
//                if(res[j]==-1){ //free slot is found
//                    res[j]=i;
//                    countJobs++;
//                    jobProfit+=arr[i].profit;
//                    break;
//                }
//            }
//        }
//        int ans[] = new int[2];
//        ans[0]=countJobs;
//        ans[1]=jobProfit;
//        return ans;
//    }
//}
