package erp.hr.main;


import erp.Hr;
import erp.hr.main.BonusSpecification;
import erp.hr.main.Employee;

import io.ciera.runtime.summit.classes.IModelInstance;
import io.ciera.runtime.summit.exceptions.XtumlException;


public interface Bonus extends IModelInstance<Bonus,Hr> {

    // attributes
    public void setStarting( int m_Starting ) throws XtumlException;
    public int getStarting() throws XtumlException;
    public void setEnding( int m_Ending ) throws XtumlException;
    public int getEnding() throws XtumlException;
    public double getAmount() throws XtumlException;
    public void setAmount( double m_Amount ) throws XtumlException;


    // operations


    // selections
    default public void setR16_is_specified_by_BonusSpecification( BonusSpecification inst ) {}
    public BonusSpecification R16_is_specified_by_BonusSpecification() throws XtumlException;
    default public void setR19_given_in_the_past_Employee( Employee inst ) {}
    public Employee R19_given_in_the_past_Employee() throws XtumlException;
    default public void setR4_is_given_to_an_Employee( Employee inst ) {}
    public Employee R4_is_given_to_an_Employee() throws XtumlException;


}