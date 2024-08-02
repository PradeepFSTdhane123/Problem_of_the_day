package Leetcode;


// // 🏅given
//     1.[]string of person details fixed string size-15.
//    🏅Task
//     1.count the age of person above 60.

public class aug_1 {

//class Solution {
    public int countSeniors(String[] details) {
        // 🛑using char method to int.-best optimum solution.
        int count=0;
        for(String str:details){
            int num1=str.charAt(11)-'0';
            int num2=str.charAt(12)-'0';
            int age=num1*10+num2;
            //  👉🏻👉🏻 int age=(s.charAt(11)-'0')*10+s.charAt(12)-'0';
            if(age>60) count++;
        }
        return count;
    }


// 🛑usign substring method to int.  substring methods need time.
//     int count=0;
//     for(String str:details){
//     int age=Integer.parseInt(str.substring(11,13));
//       if(age>=60){
//       count++;
//👉🏻👉🏻or if(Integer.parseInt(str.substring(11,13))>60)count++;
//        }
//      }
//      return count;
//    }


//🙂two methods
//    A.chaAt
//     1.charAt the age using index.
//     2.convert it in int by subtract '0'
//     3.multiple by 10 to first no. for convet it in tens and unit place add as it is.

//  B.using substring
//    1.substring the part of string of age.
//    2.convert sting to int by using Integer.parseInt()


    public static void main(String[] args) {
//        String[] details = {"1234567890M792012"};
//        int seniors =countSeniors(details);
        System.out.println("Number of seniors: ");  // Output should be 1
    }

}
