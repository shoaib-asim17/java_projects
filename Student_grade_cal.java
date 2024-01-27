//program to implement student grade system
import java.util.Scanner;
import java.util.*;

public class Student_grade_cal {
    public static void main(String[] args) {
        
        System.out.println("Enter number of subjects ::");
        Scanner sc = new Scanner(System.in);
        int no_of_sub=sc.nextInt();


        System.out.println("Enter marks obtained in each subject out of (100)  :");
        Scanner in_Marks=new Scanner(System.in);
        int[] arr1=new int[no_of_sub];

        int i,sum=0,j=1;
        for(i=0;i<no_of_sub;i++,j++)
        {
            System.out.println("subject "+j+" :");
            arr1[i]=in_Marks.nextInt();
            sum=sum+arr1[i];
        }
        int total_marks=sum;
        System.out.println("total sum is : "+total_marks);

        /*calculate average percentage  :  Divide the total marks by the total number of subjects to
                                         get the average percentage.*/
        
        int cal_Avg_Per= (total_marks)/no_of_sub;
        System.out.println("average percentage : "+cal_Avg_Per);
        System.out.print("GRADE : ");
        if(cal_Avg_Per>=90)
        {
            System.out.println("S-GRADE");
        }
        else if(cal_Avg_Per>=80)
        {
            System.out.println("A-GRADE");
        }
        else if(cal_Avg_Per>=70)
        {
            System.out.println("B-GRADE");
        }
        else if(cal_Avg_Per>=60)
        {
            System.out.println("C-GRADE");
        }
        else if(cal_Avg_Per>=50)
        {
            System.out.println("D-GRADE");
        }
        else if(cal_Avg_Per>=40)
        {
            System.out.println("E-GRADE");
        }
        else if(cal_Avg_Per<40)
        {
            System.out.println("F-GRADE");
        }
        

       
        
    }
}
