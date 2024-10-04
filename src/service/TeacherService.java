package service;

import model.Teacher;
import repository.TeacherRepository;
import repository.studentRepository;
import util.Database;

import java.sql.SQLException;
import java.util.List;

public class TeacherService {

    private TeacherRepository teacherRepository = new TeacherRepository();

    public void  printAllTeachersList(){
        try {
            List<Teacher> teachers = this.teacherRepository.getAllTeachers();
            for (Teacher teacher : teachers) {
                System.out.println(teacher);
            }
        }
        catch (SQLException sqlException) {
            System.out.println("there is problem with connecting to database");
        }
    }


    public void printCountOfTeachers(){

        try {
            int countOfStudents = this.teacherRepository.getCountOfTeachers();
            System.out.println("# of teachers:" .concat(String.valueOf(countOfStudents)));
        }
        catch (SQLException sqlException) {
            System.out.println("there is problem with connecting to database");
        }
    }

}
