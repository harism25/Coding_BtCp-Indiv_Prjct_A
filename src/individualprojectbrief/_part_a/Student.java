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
public class Student
{
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private float schoolFees;

    public Student(String surname, String name, LocalDate dateOfBirth,
            float schoolFees)
    {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.schoolFees = schoolFees;
    }

    public Student()
    {
        
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }

    public float getSchoolFees()
    {
        return schoolFees;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public void setDateOfBirth(LocalDate dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSchoolFees(float schoolFees)
    {
        this.schoolFees = schoolFees;
    }
   
}
