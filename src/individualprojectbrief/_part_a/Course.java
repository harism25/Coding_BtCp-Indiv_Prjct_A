/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualprojectbrief._part_a;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author haris
 */
public class Course
{
    /* Each Course will keep lists of students, assignments and trainers that will be used throughout the program
       Whenever wanting to access any of the students, assignments and/or trainers we will do it through Course
    */
    private String courseTitle;
    private String courseType;
    private String runTime;
    private LocalDate startDate;
    private LocalDate endDate;
    private float attendPrice;
    private ArrayList<Student> students = new ArrayList<>();                                              
    private ArrayList<Trainer> trainers = new ArrayList<>();
    private ArrayList<Assignment> assignments = new ArrayList<>();
    

    public Course(String courseTitle, String courseType, String runTime,
            LocalDate startDate, LocalDate endDate, float attendPrice)
    {
        this.courseTitle = courseTitle;
        this.courseType = courseType;
        this.runTime = runTime;
        this.startDate = startDate;
        this.endDate = endDate;
        this.attendPrice = attendPrice;
    }

    public Course()
    {
        
    }

    public String getCourseTitle()
    {
        return courseTitle;
    }

    public String getCourseType()
    {
        return courseType;
    }

    public String getRunTime()
    {
        return runTime;
    }

    public LocalDate getStartDate()
    {
        return startDate;
    }

    public LocalDate getEndDate()
    {
        return endDate;
    }

    public float getAttendPrice()
    {
        return attendPrice;
    }

    public ArrayList<Student> getStudents()
    {
        return students;
    }

    public ArrayList<Trainer> getTrainers()
    {
        return trainers;
    }

    public ArrayList<Assignment> getAssignments()
    {
        return assignments;
    }
    
    
    public void setCourseTitle(String courseTitle)
    {
        this.courseTitle = courseTitle;
    }

    public void setCourseType(String courseType)
    {
        this.courseType = courseType;
    }

    public void setRunTime(String runTime)
    {
        this.runTime = runTime;
    }

    public void setStartDate(LocalDate startDate)
    {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate)
    {
        this.endDate = endDate;
    }

    public void setAttendPrice(float attendPrice)
    {
        this.attendPrice = attendPrice;
    }

    public void setStudents(ArrayList<Student> students)
    {
        this.students = students;
    }

    public void setTrainers(ArrayList<Trainer> trainers)
    {
        this.trainers = trainers;
    }

    public void setAssignments(ArrayList<Assignment> assignments)
    {
        this.assignments = assignments;
    }
    
    
}
