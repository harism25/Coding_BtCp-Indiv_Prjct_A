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
import java.util.Collections;

/**
 *
 * @author haris
 */
public class ProjectMethodsForSyntheticData
{
    public ArrayList<Student> createSynthStudents()                                                           // Synthetic list of all students given by the program
    {
        ArrayList<Student> synthStudents = new ArrayList();
        Student st1 = new Student("Ανδριώτης", "Αναστάσιος", LocalDate.of(1989,2,25), 2500);
        Student st2 = new Student("Μπεγλίτης", "Ευάγγελος", LocalDate.of(1992,7,19), 2500);
        Student st3 = new Student("Λογοθέτης", "Γεώργιος", LocalDate.of(1990,1,8), 2250);
        Student st4 = new Student("Ψαριανός", "Αναστάσιος", LocalDate.of(1994,8,14), 2500);
        Student st5 = new Student("Παπούλιας", "Χαράλαμπος", LocalDate.of(1988,10,20), 2500);
        Student st6 = new Student("Νικολούδης", "Αθανάσιος", LocalDate.of(1992,12,14), 2200);
        Student st7 = new Student("Νικολακοπούλου", "Βασιλική", LocalDate.of(1990,3,19), 2500);
        Student st8 = new Student("Χαλκούση", "Άννα", LocalDate.of(1991,4,21), 2500);
        Student st9 = new Student("Δημητράκου", "Ευαγγελία", LocalDate.of(1987,9,4), 2200);
        Student st10 = new Student("Παπαδάκης", "Σέργιος", LocalDate.of(1993,7,15), 2500);
        Student st11 = new Student("Δημητράτος", "Στυλιανός", LocalDate.of(1996,12,11), 2500);
        Student st12 = new Student("Παππά", "Παναγιώτα", LocalDate.of(1997,3,27), 2250);
        Student st13 = new Student("Βασιλείου", "Νικόλαος", LocalDate.of(1993,5,30), 2500);
        Student st14 = new Student("Ανδρικόπουλος", "Γεώργιος", LocalDate.of(1989,4,19), 2500);
        Student st15 = new Student("Αναστασάκη", "Κατερίνα", LocalDate.of(1995,9,4), 2250);
        
        Collections.addAll(synthStudents, st1, st2, st3, st4, st5, st6, st7, st8, st9, st10, st11, st12, st13, st14, st15);
        return synthStudents;
    }
    public ArrayList<Trainer> createSynthTrainers()                                                                 // Synthetic list of all trainers given by the program
    {
        ArrayList<Trainer> synthTrainers = new ArrayList();
        Trainer tr1 = new Trainer("Καραγιάννης", "Νικόλαος", "Java");
        Trainer tr2 = new Trainer("Οικονόμου", "Αναστάσιος", "Python");
        Trainer tr3 = new Trainer("Βουδούρης", "Άγγελος", "Javascript");
        Trainer tr4 = new Trainer("Βασιλόπουλος", "Νικόλαος", "C#");
        Trainer tr5 = new Trainer("Τσιλιγιάννης", "Αθανάσιος", "Java");
        Trainer tr6 = new Trainer("Χατζηδημητρίου", "Ελένη", "Python");
        Trainer tr7 = new Trainer("Σπανούδης", "Γεώργιος", "C#");
        Trainer tr8 = new Trainer("Φωτιάδη", "Ναταλία", "Javascript");
        
        Collections.addAll(synthTrainers, tr1, tr2, tr3, tr4, tr5, tr6, tr7, tr8);
        return synthTrainers;
    }
    
    public ArrayList<Assignment> createSynthAssignments()                                                       // Synthetic list of all assignments given by the program
    {
        ArrayList<Assignment> synthAssignments = new ArrayList();
        Assignment as1 = new Assignment("Java_Project_1", LocalDate.of(2021,5,13));
        Assignment as2 = new Assignment("Python_Project_1", LocalDate.of(2021,5,13));
        Assignment as3 = new Assignment("Javascript_Project_1", LocalDate.of(2021,5,13));
        Assignment as4 = new Assignment("C#_Project_1", LocalDate.of(2021,5,13));
        Assignment as5 = new Assignment("Java_Project_2", LocalDate.of(2021,7,14));
        Assignment as6 = new Assignment("Python_Project_2", LocalDate.of(2021,7,14));
        Assignment as7 = new Assignment("Javascript_Project_2", LocalDate.of(2021,7,14));
        Assignment as8 = new Assignment("C#_Project_2", LocalDate.of(2021,7,14));
        
        Collections.addAll(synthAssignments, as1, as2, as3, as4, as5, as6, as7, as8);
        return synthAssignments;
    }
            
    public ArrayList<Course> createSynthCourses(ArrayList<Student> students, ArrayList<Trainer> trainers, ArrayList<Assignment> assignments)          // Synthetic list of all courses given by the program
    {
        ArrayList<Course> synthCourses = new ArrayList();
        Course crs1 = new Course("Java", "semiannual", "Full-Time", LocalDate.of(2021,1,1), LocalDate.of(2021,6,30), 200);
        ArrayList<Student> javaStudents = new ArrayList();
        Collections.addAll(javaStudents, students.get(0), students.get(3), students.get(8), students.get(9), students.get(11));
        crs1.setStudents(javaStudents);
        ArrayList<Trainer> javaTrainers = new ArrayList();
        Collections.addAll(javaTrainers, trainers.get(0), trainers.get(4));
        crs1.setTrainers(javaTrainers);
        ArrayList<Assignment> javaAssignments = new ArrayList();
        Collections.addAll(javaAssignments, assignments.get(0), assignments.get(4));
        crs1.setAssignments(javaAssignments);
        
        Course crs2 = new Course("Python", "semiannual", "Full-Time", LocalDate.of(2021,1,1), LocalDate.of(2021,6,30), 200);
        ArrayList<Student> pythonStudents = new ArrayList();
        Collections.addAll(pythonStudents, students.get(1), students.get(5), students.get(7), students.get(14), students.get(10));
        crs2.setStudents(pythonStudents);
        ArrayList<Trainer> pythonTrainers = new ArrayList();
        Collections.addAll(pythonTrainers, trainers.get(1), trainers.get(5));
        crs2.setTrainers(pythonTrainers);
        ArrayList<Assignment> pythonAssignments = new ArrayList();
        Collections.addAll(pythonAssignments, assignments.get(1), assignments.get(5));
        crs2.setAssignments(pythonAssignments);
                
        Course crs3 = new Course("JavaScript", "semiannual", "Full-Time", LocalDate.of(2021,1,1), LocalDate.of(2021,6,30), 200);
        ArrayList<Student> jScrStudents = new ArrayList();
        Collections.addAll(jScrStudents, students.get(4), students.get(12), students.get(9), students.get(11), students.get(10));
        crs3.setStudents(jScrStudents);
        ArrayList<Trainer> jScrTrainers = new ArrayList();
        Collections.addAll(jScrTrainers, trainers.get(2), trainers.get(7));
        crs3.setTrainers(jScrTrainers);
        ArrayList<Assignment> jScrAssignments = new ArrayList();
        Collections.addAll(jScrAssignments, assignments.get(2), assignments.get(6));
        crs3.setAssignments(jScrAssignments);
        
        Course crs4 = new Course("C#", "semiannual", "Full-Time", LocalDate.of(2021,1,1), LocalDate.of(2021,6,30), 200);
        ArrayList<Student> cSharpStudents = new ArrayList();
        Collections.addAll(cSharpStudents, students.get(2), students.get(13), students.get(6), students.get(11), students.get(10));
        crs4.setStudents(cSharpStudents);
        ArrayList<Trainer> cSharpTrainers = new ArrayList();
        Collections.addAll(cSharpTrainers, trainers.get(3), trainers.get(6));
        crs4.setTrainers(cSharpTrainers);
        ArrayList<Assignment> cSharpAssignments = new ArrayList();
        Collections.addAll(cSharpAssignments, assignments.get(3), assignments.get(7));
        crs4.setAssignments(cSharpAssignments);

        Collections.addAll(synthCourses, crs1, crs2, crs3, crs4);
        return synthCourses;
    }
}
