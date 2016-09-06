package datamanagement;

public interface IStudent
{

    public Integer getID();      //Method getId which returns integer value

    public String getFirstName();                       //Method getFirstName which returns string value
    public void setFirstName(String firstName);

    public String getLastName();             //Method for getting last name which returns string value
    public void setLastName(String lastName); 

    public void addUnitRecord( IStudentUnitRecord record );
    public IStudentUnitRecord getUnitRecord( String unitCode );

    public StudentUnitRecordList getUnitRecords();

}
