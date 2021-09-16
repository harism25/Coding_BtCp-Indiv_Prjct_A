/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualprojectbrief._part_a;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author haris
 */
public class Trainer
{
    private String name;
    private String surname;
    private String teachingCrs;

    public Trainer(String surname, String name, String teachingCrs)
    {
        this.name = name;
        this.surname = surname;
        this.teachingCrs = teachingCrs;
    }

    public Trainer()
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

    public String getTeachingCrs()
    {
        return teachingCrs;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public void setTeachingCrs(String teachingCrs)
    {
        this.teachingCrs = teachingCrs;
    }
    

}
