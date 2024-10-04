package model;

import java.util.Date;

public class Teacher {

   private long studentId;
   private String firstName;
   private String lastName;
   private Date dob;
   private String nationalCode;

    public Teacher(long studentId, String firstName, String lastName, Date dob, String nationalCode) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.nationalCode = nationalCode;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", nationalCode='" + nationalCode + '\'' +
                '}';
    }
}
