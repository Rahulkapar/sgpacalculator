import java.util.Scanner;

public class sgpaCalculator {
    public static void main(String[] args) {
      //this is the code from rahul kapar
      //ig: grkh.rahul__
        double cgpa = 0;
        double sumOfCreditHour = 0;
        String[] Grades = { "AA", "AB", "BB", "BC", "CC", "CD", "DD", "FF" };
        int[] numGrades = { 10, 9, 8, 7, 6, 5, 4, 0 };
        Scanner intInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        System.out.println("Enter the number of subject: ");
        int numberOfSubject = intInput.nextInt();
        int creditHour[] = new int[numberOfSubject];
        String stdGrade[] = new String[numberOfSubject];
        System.out.println("Enter the grade in block letter i.e. AA,BC ");
        for (int i = 0; i < numberOfSubject; i++) {
            stdGrade[i] = stringInput.nextLine();
        }

        System.out.println("Now enter the respective credit hour ");
        for (int i = 0; i < numberOfSubject; i++) {
            creditHour[i] = intInput.nextInt();
            sumOfCreditHour += creditHour[i];
        }
        boolean flag = true;
        for (int i = 0; i < numberOfSubject; i++) {
            String fail="FF";
            boolean intermediateFlag= fail.equals(stdGrade[i]);
            if (intermediateFlag)
                flag = false;
        }
        if (flag==true) {

            for (int i = 0; i < numberOfSubject; i++) {
                for (int j = 0; j < 8; j++) {
                    boolean result = stdGrade[i].equals(Grades[j]);
                    if (result == true) {
                        double intermediate = creditHour[i] * numGrades[j];
                        cgpa += intermediate;
                    }
                }
            }
            System.out.print("Your CGPA is : ");
            double netCgpa = (cgpa / sumOfCreditHour);
            System.out.println(netCgpa);
            int value = (int) netCgpa;
            if (value == 10)
                System.out.println("And your grade is AA");
            else {
                value += 1;
                for (int i = 0; i < 8; i++)
                    if (value == numGrades[i])
                        System.out.println("And your grade is " + Grades[i]);
            }
        } else
            System.out.println("Sorry You are Fail");
        intInput.close();
        stringInput.close();

    }
}
