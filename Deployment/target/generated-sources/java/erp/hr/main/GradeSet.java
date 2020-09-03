package erp.hr.main;


import erp.hr.main.GradeSet;
import erp.hr.main.JobSet;
import erp.hr.main.ScaleSet;

import io.ciera.runtime.summit.classes.IInstanceSet;
import io.ciera.runtime.summit.exceptions.XtumlException;


public interface GradeSet extends IInstanceSet<GradeSet,Grade> {

    // attributes
    public void setName( String m_Name ) throws XtumlException;
    public void setNumberOfSteps( int m_NumberOfSteps ) throws XtumlException;
    public void setAllowance( double m_Allowance ) throws XtumlException;
    public void setBaseSalary( double m_BaseSalary ) throws XtumlException;


    // selections
    public ScaleSet R12_is_part_of_Scale() throws XtumlException;
    public GradeSet R14_above_Grade() throws XtumlException;
    public GradeSet R14_bellow_Grade() throws XtumlException;
    public JobSet R9_assigned_Job() throws XtumlException;


}