package gradingsystem.eksampol;
import java.util.Scanner;
public class grades {

  public static void main(String[] args) {
   
   Scanner grd = new Scanner (System.in);
   
   System.out.print("Student No\t\t\t:\t 020003135**");
   System.out.println("\t\t\t\tProgram\t\t\t: \t BSIT");
   
   System.out.print("Student Name\t\t:\t Name Surename");
   System.out.println("\t\tLevel\t\t\t\t:\t 1Y1\n\n");
   
   System.out.println("Copy of Grades for the Period: 2022-2023/1st Term\n");
   
   System.out.print("Enter Course Codes: ");
   int code = grd.nextInt();
   
   int course = 0;
   
   if (code == 1003){
   
     System.out.print("\n");
     System.out.println("Course Description: Computer Programming 1\n");
     System.out.print("UNITS\t\t");
     System.out.print("PRELIM\t\t");
     System.out.print("MIDTERM\t\t");
     System.out.print("PREFINALS\t\t");
     System.out.print("FINALS\t\t");
     System.out.print("FINAL GRADE\n");
     System.out.print("3.00\t\t");
     System.out.print("\t 89.00\t\t");
     System.out.print("\t88.43\t\t");
     System.out.print("\t88.00\t\t");
     System.out.print("\t 87.07\t\t");
     System.out.print("\t 1.63\t\t");
   }else if (code == 1002){
     System.out.println("Course Description: Euthenics 1\n");
     System.out.print("UNITS\t\t");
     System.out.print("PRELIM\t\t");
     System.out.print("MIDTERM\t\t");
     System.out.print("PREFINALS\t\t");
     System.out.print("FINALS\t\t");
     System.out.print("FINAL GRADE\n");
     System.out.print("1.00\t\t");
     System.out.print("\t 92.00\t\t");
     System.out.print("\t91.40\t\t");
     System.out.print("\t81.00\t\t");
     System.out.print("\t 89.70\t\t");
     System.out.print("\t Passed\t\t");
   }else if (code == 1004){
     System.out.println("Course Description: Introduction to Computing\n");
     System.out.print("UNITS\t\t");
     System.out.print("PRELIM\t\t");
     System.out.print("MIDTERM\t\t");
     System.out.print("PREFINALS\t\t");
     System.out.print("FINALS\t\t");
     System.out.print("FINAL GRADE\n");
     System.out.print("3.00\t\t");
     System.out.print("\t 89.90\t\t");
     System.out.print("\t90.33\t\t");
     System.out.print("\t90.50\t\t");
     System.out.print("\t 87.73\t\t");
     System.out.print("\t 1.75\t\t");    
   }else if (code == 1005){
          System.out.println("Course Description: Mathematics in the Modern World\n");
     System.out.print("UNITS\t\t");
     System.out.print("PRELIM\t\t");
     System.out.print("MIDTERM\t\t");
     System.out.print("PREFINALS\t\t");
     System.out.print("FINALS\t\t");
     System.out.print("FINAL GRADE\n");
     System.out.print("3.00\t\t");
     System.out.print("\t 86.50\t\t");
     System.out.print("\t89.66\t\t");
     System.out.print("\t91.85\t\t");
     System.out.print("\t 88.17\t\t");
     System.out.print("\t 1.95\t\t");
   }else if (code == 1008){
          System.out.println("Course Description: National Service Training Program 1\n");
     System.out.print("UNITS\t\t");
     System.out.print("PRELIM\t\t");
     System.out.print("MIDTERM\t\t");
     System.out.print("PREFINALS\t\t");
     System.out.print("FINALS\t\t");
     System.out.print("FINAL GRADE\n");
     System.out.print("3.00\t\t");
     System.out.print("\t 88.75\t\t");
     System.out.print("\t88.03\t\t");
     System.out.print("\t97.30\t\t");
     System.out.print("\t 87.20\t\t");
     System.out.print("\t 1.75\t\t");
   }else if (code == 1006){
          System.out.println("Course Description: P.E./PATHFIT 1: Movement Competency Training\n");
     System.out.print("UNITS\t\t");
     System.out.print("PRELIM\t\t");
     System.out.print("MIDTERM\t\t");
     System.out.print("PREFINALS\t\t");
     System.out.print("FINALS\t\t");
     System.out.print("FINAL GRADE\n");
     System.out.print("2.00\t\t");
     System.out.print("\t 95.03\t\t");
     System.out.print("\t97.30\t\t");
     System.out.print("\t97.65\t\t");
     System.out.print("\t 98.17\t\t");
     System.out.print("\t 1.25\t\t");
  }else if (code == 1009){
          System.out.println("Course Description: Mathematics in the Modern World\n");
     System.out.print("UNITS\t\t");
     System.out.print("PRELIM\t\t");
     System.out.print("MIDTERM\t\t");
     System.out.print("PREFINALS\t\t");
     System.out.print("FINALS\t\t");
     System.out.print("FINAL GRADE\n");
     System.out.print("3.00\t\t");
     System.out.print("\t 85.09\t\t");
     System.out.print("\t86.32\t\t");
     System.out.print("\t85.00\t\t");
     System.out.print("\t 88.84\t\t");
     System.out.print("\t 1.85\t\t");
     }else if (code == 1010){
          System.out.println("Course Description: The Contemporary World\n");
     System.out.print("UNITS\t\t");
     System.out.print("PRELIM\t\t");
     System.out.print("MIDTERM\t\t");
     System.out.print("PREFINALS\t\t");
     System.out.print("FINALS\t\t");
     System.out.print("FINAL GRADE\n");
     System.out.print("3.00\t\t");
     System.out.print("\t 86.50\t\t");
     System.out.print("\t89.66\t\t");
     System.out.print("\t91.85\t\t");
     System.out.print("\t 88.17\t\t");
     System.out.print("\t 1.95\t\t");
}else if (code == 10011){
          System.out.println("Course Description: The Entrepreneurial Mind\n");
     System.out.print("UNITS\t\t");
     System.out.print("PRELIM\t\t");
     System.out.print("MIDTERM\t\t");
     System.out.print("PREFINALS\t\t");
     System.out.print("FINALS\t\t");
     System.out.print("FINAL GRADE\n");
     System.out.print("3.00\t\t");
     System.out.print("\t 92.05\t\t");
     System.out.print("\t87.75\t\t");
     System.out.print("\t91.85\t\t");
     System.out.print("\t 91.55\t\t");
     System.out.print("\t 1.50\t\t");
     }else if (code == 10012){
          System.out.println("Course Description: Understanding the Self\n");
     System.out.print("UNITS\t\t");
     System.out.print("PRELIM\t\t");
     System.out.print("MIDTERM\t\t");
     System.out.print("PREFINALS\t\t");
     System.out.print("FINALS\t\t");
     System.out.print("FINAL GRADE\n");
     System.out.print("3.00\t\t");
     System.out.print("\t 83.65\t\t");
     System.out.print("\t80.68\t\t");
     System.out.print("\t80.65\t\t");
     System.out.print("\t 86.35\t\t");
     System.out.print("\t 2.25\t\t\n");
}
     System.out.println("\n");
     System.out.print("Do you want to see all Finals Grades?: \n");
     System.out.println("1. Yes");
     System.out.println("2. No");
     System.out.println("Press 1 to Yes and 2 to No");
     int yes = grd.nextInt();
     
     if (yes == 1){
       System.out.println("CITE1003: COMPUTER PROGRAMMING 1 : 1.63%");
       System.out.println("STIC1002: EUTHENICS 1 : \t\t\t1.PASSED");
       System.out.println("CITE1004: INTRODUCTION TO COMPUTING : 1.75%");
       System.out.println("GEDC1005: MATHEMATICS IN MODERN WORLD : 1.95%");
       System.out.println("CITE1003: COMPUTER PROGRAMMING 1 : 1.95%");
       System.out.println("NSTP1008: NATIONAL TRAINING PROGRAM 1 : 1.75%");
       System.out.println("PHED1006: P.E/PATHFIT 1: MOVEMEN COMPETENCY TRAINING : 1.25%");
       System.out.println("GEDC1010: THE CONTEMPORARY WORLD  : 1.95%");
       System.out.println("GEDC1011: THE ENTREPRENEURIAL MIND : 1.50%");
       System.out.println("GEDC1012: UNDERSTANDING THE SELF : 2.25%");

     }else if (yes == 2){
       System.out.println("Thank You!");
     }
     
}
}