package model;

import java.util.Date;

public class Student {
    private long student_id;
    private String firstName;
    private String lastName;
    private Date dob;
    private String nationalCode;
    private double gpu;

    public Student() {
    }

    public Student(long student_id, String firstName, String lastName, Date dob, String nationalCode, double gpu) {
        this.student_id = student_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.nationalCode = nationalCode;
        this.gpu = gpu;
    }

    public long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(long student_id) {
        this.student_id = student_id;
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

    public double getGpu() {
        return gpu;
    }

    public void setGpu(double gpu) {
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", nationalCode='" + nationalCode + '\'' +
                ", gpu=" + gpu +
                '}';
    }
}
