package Gr_calculator;

import java.util.Scanner;

 class Gcalculator {

    int lang1_marks,lang2_marks,sub1_marks,sub2_marks,sub3_marks,sub4_marks;

    public Gcalculator(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks obtained in Language 1 (out of 100): ");
        lang1_marks=sc.nextInt();
        System.out.println("Enter the marks obtained in Language 2 (out of 100): ");
        lang2_marks=sc.nextInt();
        System.out.println("Enter the marks obtained in Subject 1 (out of 100): ");
        sub1_marks=sc.nextInt();
        System.out.println("Enter the marks obtained in Subject 2 (out of 100): ");
        sub2_marks=sc.nextInt();
        System.out.println("Enter the marks obtained in Subject 3 (out of 100): ");
        sub3_marks=sc.nextInt();
        System.out.println("Enter the marks obtained in Subject 4 (out of 100): ");
        sub4_marks=sc.nextInt();
    }

public void calculate_grade(){
    int total_marks=lang1_marks+lang2_marks+sub1_marks+sub2_marks+sub3_marks+sub4_marks;
    float percentage=total_marks/6;
    String assigned_grade=null;
    if(percentage>=90 && percentage<=100){
         assigned_grade="A+";
    }
    if(percentage>=80 && percentage<=89){
        assigned_grade="A";
   }
   if(percentage>=70 && percentage<=79){
    assigned_grade="B+";
}
if(percentage>=60 && percentage<=69){
    assigned_grade="B";
}
if(percentage>=40 && percentage<=59){
    assigned_grade="C";
}
if( percentage<40){
    assigned_grade="F";
}
System.out.println("Marks obtained:");
System.out.println("Language 1: "+lang1_marks);
System.out.println("Language 2: "+lang2_marks);
System.out.println("Subject 1 : "+sub1_marks);
System.out.println("Subject 2 : "+sub2_marks);
System.out.println("Subject 3 : "+sub3_marks);
System.out.println("Subject 4 : "+sub4_marks);
System.out.println("Total marks: "+total_marks);
System.out.println("Percentage: "+percentage);
System.out.println("Obtained grade:"+assigned_grade);
}
}
public class Grade{
    
public static void main(String[] args) {
    Gcalculator g1=new Gcalculator();
    g1.calculate_grade();
}
}