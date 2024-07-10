import java.util.Scanner;

public class gradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" STUDENT GRADE CALCULATOR");
        System.out.println("Enter number of Subjects ");
        int s = sc.nextInt();
        int total =0;
        System.out.println(" ENTER THE MARKS OBTAINED IN " +s+ " subjects respectively :");
        for(int i=0; i<s;i++){
            int marks=sc.nextInt();
            total = total +marks;
        }
        double average_percentage = (double)total/s;


        String grade;
        if (average_percentage >= 90) {
            System.out.println(grade = "A+");
        } else if (average_percentage >= 80) {
            System.out.println(grade = "A");
        } else if (average_percentage >= 70) {
            System.out.println(grade = "B");
        } else if (average_percentage >= 60) {
            System.out.println(grade = "C");
        } else if (average_percentage >= 50) {
            System.out.println(grade = "D");
        } else {
            grade = "F";
        }
        System.out.println(" TOTAL MARKS=" +total);
        System.out.println(" Average percentage "+average_percentage+"%");
        System.out.println(" Grade is :" +grade);


    }
}

