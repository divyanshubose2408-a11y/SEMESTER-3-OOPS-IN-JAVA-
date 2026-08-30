Program 3: WAP to display data of student class defined in University Package


package University;

public class UniStudent {
       
    private int rollNo;
    private String Name;
    private String instituteCode;

  
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }


    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

    
    public String getInstituteCode() {
        return instituteCode;
    }
    public void setInstituteCode(String instituteCode) {
        this.instituteCode = instituteCode;
    }
}
