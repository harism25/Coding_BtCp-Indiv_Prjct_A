/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allmethodsused;

import individualprojectbrief._part_a.Assignment;
import individualprojectbrief._part_a.Course;
import individualprojectbrief._part_a.IndividualProjectBrief_PART_A;
import individualprojectbrief._part_a.Student;
import individualprojectbrief._part_a.Trainer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author haris
 */

// 
public class ProjectMethodsForUserInput
{
    
    public ArrayList<Course> inputCourses() throws InterruptedException                                             // Accepting the user's input for any kind of courses
    {
        ArrayList<Course> coursesForInput = new ArrayList();
        System.out.println("\033[0;37mHow many courses will you give? (1-8 courses allowed)");
        String inputCourses;
        int inputCoursesNum;
        Scanner scan = new Scanner(System.in);
        for( ; ; )
        {
            inputCourses = scan.nextLine();
            try
            {
                inputCoursesNum = Integer.parseInt(inputCourses);
                if (inputCoursesNum >=1 && inputCoursesNum <=8)
                {
                    break;
                }
                else
                {
                    System.out.println("Wrong input, please type a number between 1 and 8!");
                }
            }
            catch(Exception e)
            {
                System.out.println("Wrong input, please type a number between 1 and 8!");
            }
        }
        try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(IndividualProjectBrief_PART_A.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        String inputCourseName;
        String inputCourseType;
        String inputCourseRunTime;
        String inputCourseStartDate;
        String inputCourseEndDate;
        String inputCourseAttendPrice;
        
        for (int i = 0; i < inputCoursesNum; i++)
        {
            System.out.println("\033[0;37mPlease type new course's name (latin characters only): ");
            inputCourseName = scan.nextLine();
            Thread.sleep(1000);
            System.out.println("\033[0;37mPlease put in the course's type: (i.e. semiannual or annual)");
            inputCourseType = scan.nextLine();
            Thread.sleep(1000);
            System.out.println("\033[0;37mPlease type the runtime of the course: (i.e. Full-Time or Part-Time)");
            inputCourseRunTime = scan.nextLine();
            Thread.sleep(1000);
            System.out.println("\033[0;37mPlease type course's starting date: (e.g. yyyy-mm-dd)");
            LocalDate startDate;
            for( ; ; )
            {
                inputCourseStartDate = scan.nextLine();
                try
                {
                    startDate = LocalDate.parse(inputCourseStartDate);
                    break;
                }
                catch(Exception e)
                {
                    System.out.println("Wrong input, please type a date in the yyyy-mm-dd format!");
                }
            }
            Thread.sleep(1000);
            System.out.println("\033[0;37mPlease type course's ending date: (e.g. yyyy-mm-dd)");
            LocalDate endDate;
            for( ; ; )
            {
                inputCourseEndDate = scan.nextLine();
                try
                {
                    endDate = LocalDate.parse(inputCourseEndDate);
                    break;
                }
                catch(Exception e)
                {
                    System.out.println("Wrong input, please type a date in the correct format (e.g. yyyy-mm-dd)!");
                }
            }
            Thread.sleep(1000);
            System.out.println("\033[0;37mPlease put in the course's price for attendance: (i.e. 1000.00)");
            float courseAttPrice;
            for( ; ; )
            {
                inputCourseAttendPrice = scan.nextLine();
                try
                {
                    courseAttPrice = Float.parseFloat(inputCourseAttendPrice);
                    break;
                }
                catch(Exception e)
                {
                    System.out.println("Wrong input, please type a price in the correct format (i.e. 1000.00)!");
                }
            }
            Thread.sleep(1000);
            Course inputCourse = new Course(inputCourseName, inputCourseType, inputCourseRunTime,
                    startDate, endDate, courseAttPrice);
            coursesForInput.add(inputCourse);
            
        }
        return coursesForInput;
    }
    
    
    public ArrayList<Trainer> inputTrainers(ArrayList<Course> courses)                                                // Accepting the user's input for the trainers
    {
        ArrayList<ArrayList<Trainer>> trainersLists = new ArrayList();
        for (Course course : courses)
        {
            trainersLists.add(new ArrayList<Trainer>());
        }
        
        ArrayList<Trainer> trainersForInput = new ArrayList();
        System.out.println("\033[0;37mHow many trainers will you give? (1-8 trainers allowed)");
        String inputTrainers;
        int inputTrainersNum;
        Scanner scan = new Scanner(System.in);
        for( ; ; )
        {
            inputTrainers = scan.nextLine();
            try
            {
                inputTrainersNum = Integer.parseInt(inputTrainers);
                if (inputTrainersNum >=1 && inputTrainersNum <=8)
                {
                    break;
                }
                else
                {
                    System.out.println("Wrong input, please type a number between 1 and 8!");
                }
            }
            catch(Exception e)
            {
                System.out.println("Wrong input, please type a number between 1 and 8!");
            }
        }
        try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(IndividualProjectBrief_PART_A.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        String inputTrainerSurname;
        String inputTrainerName;
        String inputTeachingCrs;
        
        for (int i = 0; i < inputTrainersNum; i++)
        {
            System.out.println("\033[0;37mPlease type new trainer's surname (latin characters only): ");
            inputTrainerSurname = scan.nextLine();
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(IndividualProjectBrief_PART_A.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("\033[0;37mPlease type new trainer's name (latin characters only): ");
            inputTrainerName = scan.nextLine();
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(IndividualProjectBrief_PART_A.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("\033[0;37mPlease pick what course the trainer will be teaching in (type a number e.g. 1, 2, 3...): ");
            int counter = 1;
            for (Course course : courses)
            {
                System.out.println(counter + ". " + course.getCourseTitle());
                counter++;
            }
            int trainerCourseNum;
            for( ; ; )
            {
                inputTeachingCrs = scan.nextLine();
                try
                {
                    trainerCourseNum = Integer.parseInt(inputTeachingCrs);
                    if (trainerCourseNum >= 1 && trainerCourseNum <= courses.size())
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Wrong input, please type a correct number! ");
                    }
                }
                catch(Exception e)
                {
                    System.out.println("Wrong input, please type a correct number! ");
                }
            }
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(IndividualProjectBrief_PART_A.class.getName()).log(Level.SEVERE, null, ex);
            }
            String trainerCourse = courses.get(trainerCourseNum - 1).getCourseTitle();
            
            Trainer inputTrainer = new Trainer(inputTrainerSurname, inputTrainerName, trainerCourse);
            trainersForInput.add(inputTrainer);
            int countCourses = 0;
            for (Course course : courses)
            {
                if (trainerCourse.equals(course.getCourseTitle()))
                {
                    trainersLists.get(countCourses).add(inputTrainer);
                }
                countCourses++;
            }
        }
        int countArrays = 0;
        for (Course course : courses)
        {
            course.setTrainers(trainersLists.get(countArrays));
            countArrays++;
        }
        return trainersForInput;
    }
    
    
    public ArrayList<Student> inputStudents(ArrayList<Course> courses)                                      // Accepting the user's input for the students
    {
        ArrayList<ArrayList<Student>> studentsLists = new ArrayList();
        for (Course course : courses)
        {
            studentsLists.add(new ArrayList<Student>());
        }
        
        ArrayList<Student> studentsForInput = new ArrayList();
        System.out.println("\033[0;37mHow many students will you give? (1-15 students allowed)");
        String inputStudents;
        int inputStudentsNum;
        Scanner scan = new Scanner(System.in);
        for ( ; ; )
        {
            inputStudents = scan.nextLine();
            try
            {
                inputStudentsNum = Integer.parseInt(inputStudents);
                if (inputStudentsNum >= 1 && inputStudentsNum <= 15)
                {
                    break;
                }
                else
                {
                    System.out.println("Wrong input, please type a number between 1 and 15! ");
                }
            }
            catch(Exception e)
            {
                System.out.println("Wrong input, please type a number between 1 and 15! ");
            }
        }
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException ex)
        {
            Logger.getLogger(IndividualProjectBrief_PART_A.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String inputStudentSurname;
        String inputStudentName;
        String inputDateOfBirth;
        String inputSchoolFees;
        
        for (int i = 0; i < inputStudentsNum; i++)
        {
            System.out.println("\033[0;37mPlease type new student's surname (latin characters only): ");
            inputStudentSurname = scan.nextLine();
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(IndividualProjectBrief_PART_A.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("\033[0;37mPlease type new student's name (latin characters only): ");
            inputStudentName = scan.nextLine();
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(IndividualProjectBrief_PART_A.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("\033[0;37mPlease type new student's birth date: (e.g. yyyy-mm-dd) ");
            LocalDate studentBirthDate;
            for( ; ; )
            {
                inputDateOfBirth = scan.nextLine();
                try
                {
                    studentBirthDate = LocalDate.parse(inputDateOfBirth);
                    break;
                }
                catch(Exception e)
                {
                    System.out.println("Wrong input, please type a date in the yyyy-mm-dd format!");
                }
            }
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(IndividualProjectBrief_PART_A.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("\033[0;37mPlease type amount of fees the student has to pay (up to 20000.00): ");
            float inputSchoolFeesNum;
            for ( ; ; )
            {
                inputSchoolFees = scan.nextLine();
                try
                {
                    inputSchoolFeesNum = Float.parseFloat(inputSchoolFees);
                    if (inputSchoolFeesNum >= 1 && inputSchoolFeesNum <= 20000)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Wrong input, please type a correct number! ");
                    }
                }
                catch(Exception e)
                {
                    System.out.println("Wrong input, please type a correct number! ");
                }
            }
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(IndividualProjectBrief_PART_A.class.getName()).log(Level.SEVERE, null, ex);
            }
            Student inputStudent = new Student(inputStudentSurname, inputStudentName, studentBirthDate, inputSchoolFeesNum);
            studentsForInput.add(inputStudent);
            System.out.println("\033[0;37mHow many courses will the student be attending in? (Please choose up to " + courses.size() + ")");
            String studentCourses;
            int studentCoursesNum;
            for ( ; ; )
            {
                studentCourses = scan.nextLine();
                try
                {
                    studentCoursesNum = Integer.parseInt(studentCourses);
                    if (studentCoursesNum >= 1 && studentCoursesNum <= courses.size())
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Wrong input, please type a number between 1 and " + courses.size() + "! ");
                    }
                }
                catch(Exception e)
                {
                    System.out.println("Wrong input, please type a number between 1 and " + courses.size() + "! ");
                }
            }
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(IndividualProjectBrief_PART_A.class.getName()).log(Level.SEVERE, null, ex);
            }
            String inputStudentCrs;
            for (int j = 0; j < studentCoursesNum; j++)
            {
                System.out.println("\033[0;37mPlease pick course to attend (type a number e.g. 1, 2, 3...): ");
                int counter = 1;
                for (Course course : courses)
                {
                    System.out.println(counter + ". " + course.getCourseTitle());
                    counter++;
                }
                int studentCourseNum;
                for( ; ; )
                {
                    inputStudentCrs = scan.nextLine();
                    try
                    {
                        studentCourseNum = Integer.parseInt(inputStudentCrs);
                        if (studentCourseNum >= 1 && studentCourseNum <= courses.size())
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("Wrong input, please type a correct number! ");
                        }
                    }
                    catch(Exception e)
                    {
                        System.out.println("Wrong input, please type a correct number! ");
                    }
                }
                studentsLists.get(studentCourseNum - 1).add(inputStudent);
                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException ex)
                {
                    Logger.getLogger(IndividualProjectBrief_PART_A.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        int countStudentsLists = 0;
        for (ArrayList<Student> studentsList : studentsLists)
        {
            courses.get(countStudentsLists).setStudents(studentsList);
            countStudentsLists++;
        }
        return studentsForInput;
    }
    
    
    public ArrayList<Assignment> inputAssignments(ArrayList<Course> courses)                                            // Accepting the user's input for all assignments
    {
        ArrayList<ArrayList<Assignment>> asgnmtsLists = new ArrayList();
        for (Course course : courses)
        {
            asgnmtsLists.add(new ArrayList<Assignment>());
        }
        
        ArrayList<Assignment> assignmForInput = new ArrayList();
        System.out.println("\033[0;37mHow many assignments will you give? (1-30 assignments allowed)");
        String inputAsgnmts;
        int inputAsgnmtNum;
        Scanner scan = new Scanner(System.in);
        for( ; ; )
        {
            inputAsgnmts = scan.nextLine();
            try
            {
                inputAsgnmtNum = Integer.parseInt(inputAsgnmts);
                if (inputAsgnmtNum >= 1 && inputAsgnmtNum <= 30)
                {
                    break;
                }
                else
                {
                    System.out.println("Wrong input, please type a number between 1 and 30! ");
                }
            }
            catch(Exception e)
            {
                System.out.println("Wrong input, please type a number between 1 and 30! ");
            }
        }
        try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(IndividualProjectBrief_PART_A.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        String inputAsgnmtTitle;
        String inputSubDate;
        
        for (int i = 0; i < inputAsgnmtNum; i++)
        {
            System.out.println("\033[0;37mPlease type new assignment's title (latin characters only): ");
            inputAsgnmtTitle = scan.nextLine();
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(IndividualProjectBrief_PART_A.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("\033[0;37mPlease type new assignment's submitting date: (e.g. yyyy-mm-dd) ");
            LocalDate asgnmtSubDate;
            for( ; ; )
            {
                inputSubDate = scan.nextLine();
                try
                {
                    asgnmtSubDate = LocalDate.parse(inputSubDate);
                    break;
                }
                catch(Exception e)
                {
                    System.out.println("Wrong input, please type a date in the yyyy-mm-dd format!");
                }
            }
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(IndividualProjectBrief_PART_A.class.getName()).log(Level.SEVERE, null, ex);
            }
            Assignment inputAsgnmt = new Assignment(inputAsgnmtTitle, asgnmtSubDate);
            assignmForInput.add(inputAsgnmt);
            System.out.println("\033[0;37mPlease pick the course that the assignment will refer to: ");
            String inputAsgnmtCrs;
            int counter = 1;
            for (Course course : courses)
            {
                System.out.println(counter + ". " + course.getCourseTitle());
                counter++;
            }
            int asgnmtCourseNum;
            for( ; ; )
            {
                inputAsgnmtCrs = scan.nextLine();
                try
                {
                    asgnmtCourseNum = Integer.parseInt(inputAsgnmtCrs);
                    if (asgnmtCourseNum >= 1 && asgnmtCourseNum <= courses.size())
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Wrong input, please type a correct number! ");
                    }
                }
                catch(Exception e)
                {
                    System.out.println("Wrong input, please type a correct number! ");
                }
            }
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(IndividualProjectBrief_PART_A.class.getName()).log(Level.SEVERE, null, ex);
            }
            asgnmtsLists.get(asgnmtCourseNum - 1).add(inputAsgnmt);
        }
        int counter = 0;
        for (ArrayList<Assignment> asgnmtList : asgnmtsLists)
        {
            courses.get(counter).setAssignments(asgnmtList);
            counter++;
        }
        return assignmForInput;
    }
           
}
