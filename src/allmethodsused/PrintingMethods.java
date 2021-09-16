/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allmethodsused;

import individualprojectbrief._part_a.Assignment;
import individualprojectbrief._part_a.Course;
import individualprojectbrief._part_a.Student;
import individualprojectbrief._part_a.Trainer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haris
 */
public class PrintingMethods
{
    public void printStudentList(ArrayList<Student> students)                                       // Printing the list of students
    {
        System.out.println("\033[1;33mL I S T   O F   S T U D E N T S: ");
        System.out.println("\033[1;33m*-----*-----*-----*-----*-----*\033[0m" + "\n");
        for (Student student : students)
        {
            System.out.println("Surname: " + student.getSurname() + " " + " Name: " + student.getName() + " " + " Date of Birth: "
                    + student.getDateOfBirth() + " " + " Fees: " + student.getSchoolFees());
        }
        System.out.println();
    }
    
    //
    public void printTrainerList(ArrayList<Trainer> trainers)                                           // Printing the list of trainers
    {
        System.out.println("\033[1;33mL I S T   O F   T R A I N E R S: ");
        System.out.println("\033[1;33m*-----*-----*-----*-----*-----*\033[0m" + "\n");
        for (Trainer trainer : trainers)
        {
            System.out.println("Surname: " + trainer.getSurname() + " " + " Name: " + trainer.getName() + " "  + " Teaching Course: "
                    + trainer.getTeachingCrs());
        }
        System.out.println();
    }
    
    //
    public void printCourseList(ArrayList<Course> courses)                                                    // Printing the list of the courses
    {
        System.out.println("\033[1;33mL I S T   O F   C O U R S E S: ");
        System.out.println("\033[1;33m*-----*-----*-----*-----*-----*\033[0m" + "\n");
        for (Course course : courses)
        {
            System.out.println("Course Title: " + course.getCourseTitle() + " " + " Course Type: " + course.getCourseType() + " "
                    + " Runtime Type: " + " " + course.getRunTime() + " " + " Starting Date: " + course.getStartDate() + " " + " Ending Date: "
                    + course.getEndDate() + " " + " Price for attending: " + course.getAttendPrice());
        }
        System.out.println();
    }
    
    //
    public void printAssignmentList(ArrayList<Assignment> assignments)                                      // Printing the list of assignments
    {
        System.out.println("\033[1;33mL I S T   O F   A S S I G N M E N T S: ");
        System.out.println("\033[1;33m*-----*-----*-----*-----*-----*-----*\033[0m" + "\n");
        for (Assignment assignment : assignments)
        {
            System.out.println("Assignment Title: " + assignment.getAsgnmtTitle() + " " + " Date of submitting: " + assignment.getSubmitDate());
        }
        System.out.println();
    }
    
    public void printStudentsPerCourse(ArrayList<Course> courses)                                             // Printing the list of students per course
    {
        System.out.println("\033[1;33mL I S T  O F  S T U D E N T S  P E R  C O U R S E: ");
        System.out.println("\033[1;33m*-----*-----*-----*-----*-----*-----*-----*-----*\033[0m" + "\n");
        for (Course course : courses)
        {
            System.out.println("Course Title: " + course.getCourseTitle());
            System.out.println("Students are: " + "\n");
            for (Student student : course.getStudents())
            {
                System.out.println(student.getSurname() + " " + student.getName());
            }
            System.out.println();
        }
    }
    
    public void printTrainersPerCourse(ArrayList<Course> courses)                                               // Printing the list of trainers per course
    {
        System.out.println("\033[1;33mL I S T  O F  T R A I N E R S  P E R  C O U R S E: ");
        System.out.println("\033[1;33m*-----*-----*-----*-----*-----*-----*-----*-----*\033[0m" + "\n");
        for (Course course : courses)
        {
            System.out.println("Course Title: " + course.getCourseTitle());
            System.out.println("Trainers are: " + "\n");
            for (Trainer trainer : course.getTrainers())
            {
                System.out.println(trainer.getSurname() + " " + trainer.getName());
            }
            System.out.println();
        }
    }
            
    public void printAssignmentsPerCourse(ArrayList<Course> courses)                                             // Printing the list of assignments per course
    {
        System.out.println("\033[1;33mL I S T  O F  A S S I G N M E N T S  P E R  C O U R S E: ");
        System.out.println("\033[1;33m*-----*-----*-----*-----*-----*-----*-----*-----*-----*\033[0m" + "\n");
        for (Course course : courses)
        {
            System.out.println("Course Title: " + course.getCourseTitle());
            System.out.println("Assignments are: " + "\n");
            for (Assignment assignment : course.getAssignments())
            {
                System.out.println("''" + assignment.getAsgnmtTitle() + "''" + ", with submission deadline: " + assignment.getSubmitDate());
            }
            System.out.println();
        }
    }
            
    public void printStudentsMultipleCourses(ArrayList<Course> courses, ArrayList<Student> students)                    // Printing the students attending multiple courses
    {
        System.out.println("\033[1;33mL I S T  O F  S T U D E N T S  I N  M O R E  T H A N  O N E  C O U R S E: ");
        System.out.println("\033[1;33m*-----*-----*-----*-----*-----*-----*-----*-----*-----*-----*-----*-----*\033[0m" + "\n");
        //System.out.println("");
        int counter;
        for (Student student : students)
        {
            counter = 0;
            for (Course course : courses)
            {
                for (Student studentOfCourse : course.getStudents())
                {
                    if (student.getName() == studentOfCourse.getName() && student.getSurname() == studentOfCourse.getSurname())
                    {
                        counter++;
                    }
                }
            }
            if (counter > 1)
            {
                System.out.println("Surname: " + student.getSurname() + "  Name: " + student.getName());
            }
        }
        System.out.println("\n");
    }
    
    public void printAssignmentsPerStudent(ArrayList<Course> courses, ArrayList<Student> students)                      // Printing all the assignments for each student
    {
        
        System.out.println("\033[1;33mL I S T  O F  A S S I G N M E N T S  P E R  S T U D E N T: ");
        System.out.println(" \033[1;33m*-----*-----*-----*-----*-----*-----*-----*-----*-----*\033[0m" + "\n");
        for (Student student : students)
        {
            System.out.println("Surname: " + student.getSurname() + "  Name: " + student.getName());
            System.out.println("Assignments: ");
            for (Course course : courses)
            {
                for (Student studentOfTheCourse : course.getStudents())
                {
                    if (student.getName() == studentOfTheCourse.getName() && student.getSurname() == studentOfTheCourse.getSurname())
                    {
                        for (Assignment assignment : course.getAssignments())
                        {
                            System.out.println(assignment.getAsgnmtTitle());
                        }
                        break;
                    }
                }
            }
            System.out.println();
        }
        System.out.println("\n");
    }
    
    public void printStudAsgnmtDeadlines(ArrayList<Course> courses)                                     // Printing the students that need to submit assignments on the given dates
    {
        System.out.println("Please type a date to see which students have to submit assignments on the corresponding calendar week: (e.g. yyyy-mm-dd) ");
        Scanner scan = new Scanner(System.in);
        String inputDLDate;
        LocalDate dLDate;
        
        for ( ; ; )
        {
            inputDLDate = scan.nextLine();
            try
            {
                dLDate = LocalDate.parse(inputDLDate);
                break;
            }
            catch (Exception e)
            {
                System.out.println("Wrong input, please type a date in the yyyy-mm-dd format! ");
            }
        }

        int dayNum = dLDate.getDayOfWeek().getValue();                                       // days of week from 1 to 7
        LocalDate subWeekStart = dLDate;
        LocalDate subWeekEnd = dLDate;
        if (dayNum == 1)
        {
            subWeekStart = dLDate;
            subWeekEnd = LocalDate.from(dLDate).plusDays(4);
        }
        else if (dayNum == 2)
        {
            subWeekStart = LocalDate.from(dLDate).minusDays(1);
            subWeekEnd = LocalDate.from(dLDate).plusDays(3);
        }
        else if (dayNum == 3)
        {
            subWeekStart = LocalDate.from(dLDate).minusDays(2);
            subWeekEnd = LocalDate.from(dLDate).plusDays(2);
        }
        else if (dayNum == 4)
        {
            subWeekStart = LocalDate.from(dLDate).minusDays(3);
            subWeekEnd = LocalDate.from(dLDate).plusDays(1);
        }
        else if (dayNum == 5)
        {
            subWeekStart = LocalDate.from(dLDate).minusDays(4);
            subWeekEnd = dLDate;
        }
        else if (dayNum == 6)
        {
            subWeekStart = LocalDate.from(dLDate).minusDays(5);
            subWeekEnd = LocalDate.from(dLDate).minusDays(1);
        }
        else if (dayNum == 7)
        {
            subWeekStart = LocalDate.from(dLDate).minusDays(6);
            subWeekEnd = LocalDate.from(dLDate).minusDays(2);
        }
        
        int countAsgmnts = 0;
        System.out.println("\033[1;33mS U B M I S S I O N S  F O R  T H I S  W E E K: ");
        System.out.println("\033[1;33m*-----*-----*-----*-----*-----*-----*-----*-----*\033[0m" + "\n");
        for (Course course : courses)
        {
            for (Assignment crsAsgmnt : course.getAssignments())
            {
                if (crsAsgmnt.getSubmitDate().isAfter(subWeekStart) && crsAsgmnt.getSubmitDate().isBefore(subWeekEnd))
                {
                    System.out.println("The assignment " + crsAsgmnt.getAsgnmtTitle() + " must be submitted this week by the following students: ");
                    for (Student asgmntStudent : course.getStudents())
                    {
                        System.out.println("Surname: " + asgmntStudent.getSurname() + " Name: " + asgmntStudent.getName());
                    }
                    System.out.println(" \n");
                }
            }
            countAsgmnts++;
        }
    }
}
