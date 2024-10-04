package repository;

import model.Teacher;
import util.Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeacherRepository {


    private static final String GET_ALL_TEACHER_QUERY = "select * from teachers";
    private static final String GET_COUNT_OF_TEACHERS = "select count(*) from teachers";

    private Database database = new Database();


    public List<Teacher> getAllTeachers() throws SQLException {
        List<Teacher> teachers = new ArrayList<>();

        ResultSet teachersResults = database.getSQLStatement().executeQuery(GET_ALL_TEACHER_QUERY);
        while (teachersResults.next()) {
            Teacher teacher = new Teacher(
                    teachersResults.getLong("teacher_id"),
                    teachersResults.getString("first_name"),
                    teachersResults.getString("last_name"),
                    teachersResults.getDate("dob"),
                    teachersResults.getString("national_code")
            );
            teachers.add(teacher);
        }
        return teachers;
    }

    public int getCountOfTeachers() throws SQLException {
        ResultSet countResult = database.getSQLStatement().executeQuery(GET_COUNT_OF_TEACHERS);
        int teacherCount = 0;
        while (countResult.next()) {
            teacherCount = countResult.getInt("count");
        }
        return teacherCount;
    }

}
