/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualprojectbrief._part_a;

import allmethodsused.PrintingMethods;
import allmethodsused.ProjectMethodsForSyntheticData;
import allmethodsused.ProjectMethodsForUserInput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.DayOfWeek;

/**
 *
 * @author haris
 */
public class IndividualProjectBrief_PART_A
{
    
    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
        
    public static void main(String[] args) throws InterruptedException
    {
        // TODO code application logic here
        ProjectMethodsForUserInput userInput = new ProjectMethodsForUserInput();                                      // Preparing to accept all methods for the user's input
        ProjectMethodsForSyntheticData syntheticInput = new ProjectMethodsForSyntheticData();                         // Preparing to accept the methods for all the synthetic data
        PrintingMethods printMethods = new PrintingMethods();                                                         // Preparing to accept all methods for printing out data
        
        ArrayList<Student> students = new ArrayList();
        ArrayList<Trainer> trainers = new ArrayList();
        ArrayList<Assignment> assignments = new ArrayList();
        ArrayList<Course> courses = new ArrayList();
        
        System.out.println("\033[33;3;4mWelcome, would you like to input your own data?  (Type y/n)\033[0m");                       // Program start with the user's prompt for input
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        if (input.equals("y") || input.equals("Y"))
        {
            System.out.println("\033[33;3;1mOk, now you can start typing!\033[0m");
            Thread.sleep(2000);
            courses = userInput.inputCourses();
            trainers = userInput.inputTrainers(courses);
            students = userInput.inputStudents(courses);
            assignments = userInput.inputAssignments(courses);
        }
        else if (input.equals("n") || input.equals("N"))
        {
            students = syntheticInput.createSynthStudents();
            trainers = syntheticInput.createSynthTrainers();
            assignments = syntheticInput.createSynthAssignments();
            courses = syntheticInput.createSynthCourses(students, trainers, assignments);
            System.out.println("\033[33;3;4mOk, synthetic data were just created for you!\033[0m" + "\n" + "Please wait..");
            System.out.println("\033[33;3;4m*-----*-----*-----*-----*-----*-----*-----*\033[0m");
        }
        else
        {
            System.out.println("Wrong input, please run the programm again.");
            return;
        }
        
        // creating infinite loop
        for( ; ;)                                                                                                       // The main menu of the program
        {
            Thread.sleep(2100);
            System.out.println("\033[32;3;4mOk, what do you want to do now?  (Type a number 1-11 accordingly!)");
            System.out.println("\033[0;37m1. Print list of students " + "\n" + "\033[0;37m2. Print list of assignments " + "\n"
                                + "\033[0;37m3. Print list of courses " + "\n" + "\033[0;37m4. Print list of trainers" + "\n"
                                + "\033[0;37m5. Print list of students per course " + "\n" + "\033[0;37m6. Print list of trainers per course "
                                + "\n" + "\033[0;37m7. Print list of assignments per course " + "\n" + "\033[0;37m8. Print list of assignments per student "
                                + "\n" + "\033[0;37m9. Print list of students in more than one courses " + "\n"
                                + "\033[0;37m10. Input date to see which students have assignments to deliver on this date " + "\n"
                                + "11. \033[41mEXIT the program.\033[0m" + "\n");
            
            //scan = new Scanner(System.in);
            input = scan.nextLine();
            if (input.equals("1"))
            {
                printMethods.printStudentList(students);
            }
            else if (input.equals("2"))
            {
                printMethods.printAssignmentList(assignments);
            }
            else if (input.equals("3"))
            {
                printMethods.printCourseList(courses);
            }
            else if (input.equals("4"))
            {
                printMethods.printTrainerList(trainers);
            }
            else if (input.equals("5"))
            {
                printMethods.printStudentsPerCourse(courses);
            }
            else if (input.equals("6"))
            {
                printMethods.printTrainersPerCourse(courses);
            }
            else if (input.equals("7"))
            {
                printMethods.printAssignmentsPerCourse(courses);
            }
            else if (input.equals("8"))
            {
                printMethods.printAssignmentsPerStudent(courses, students);
            }
            else if (input.equals("9"))
            {
                printMethods.printStudentsMultipleCourses(courses, students);
            }
            else if (input.equals("10"))
            {
                printMethods.printStudAsgnmtDeadlines(courses);
            }
            else if (input.equals("11"))
            {
                System.out.println("Ok, thank you for using! ");
                System.out.println("Bye... ");
                break;

            }
            else 
            {
                System.out.println("Wrong input, please type a correct number accordingly! ");
            }
            
        }
        scan.close();
        return;
        
        
    }
}
    

