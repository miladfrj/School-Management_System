package service;

import model.Student;
import repository.studentRepository;
import util.Database;

import java.sql.SQLException;
import java.util.List;

public class studentService {

private studentRepository repository = new studentRepository();
    public void printAllStudentsList() {
        try {
            List<Student> students = this.repository.getAllStudents();
            for (Student student : students) {
                System.out.println(student);
            }
        } catch (SQLException sqlException) {
            System.out.println("there is problem with connecting to database");

        }
    }



    public void printCountOfStudents() {
        try {
            int countOfStudents =this.repository.getCountOfStudents();
            System.out.println("# students:" .concat(String.valueOf(countOfStudents)));
        }catch (SQLException sqlException){
            System.out.println("there is problem with connecting to database");
        }
    }
}
