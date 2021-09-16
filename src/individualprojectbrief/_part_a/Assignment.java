/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualprojectbrief._part_a;

import java.time.LocalDate;

/**
 *
 * @author haris
 */
public class Assignment
{
    private String asgnmtTitle;
    private LocalDate submitDate;
    

    public Assignment(String asgnmtTitle, LocalDate submitTime)
    {
        this.asgnmtTitle = asgnmtTitle;
        this.submitDate = submitTime;
        
    }

    public Assignment()
    {
        
    }

    public String getAsgnmtTitle()
    {
        return asgnmtTitle;
    }

    public LocalDate getSubmitDate()
    {
        return submitDate;
    }


    public void setAsgnmtTitle(String asgnmtTitle)
    {
        this.asgnmtTitle = asgnmtTitle;
    }

    public void setSubmitDate(LocalDate submitDate)
    {
        this.submitDate = submitDate;
    }
    
    
}
