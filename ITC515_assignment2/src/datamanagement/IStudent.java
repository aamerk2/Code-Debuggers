package datamanagement;

public interface IStudent
{

    public Integer getID();      //Method getId which returns integer value

    public String getFirstName();//Method getFirstName which returns String value
    public void setFirstName(String firstName);//Method setFirstName which dosen't return any value but takes firstName as input parameter

    public String getLastName();//Method getLastName which returns String value
    public void setLastName(String lastName);//Method setLastName which dosen't return any value but takes lastName as input parameter

    public void addUnitRecord( IStudentUnitRecord record );//Method addUnitRecord which returns integer value, takes record of type casted value IStudentUnitRecord as input parameter 
    public IStudentUnitRecord getUnitRecord( String unitCode );//Method getUnitRecord which returns IStudentUnitRecord value takes unitCode as input value which is a string

    public StudentUnitRecordList getUnitRecords();//Method getUnitRecords which returns  value of StudentUnitRecordList

}
