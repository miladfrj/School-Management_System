package repository;

import model.Student;
import util.Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class studentRepository {


    private static final String GET_ALL_STUDENTS_QUERY = "SELECT * FROM STUDENTS";
    private static final String GET_COUNT_OF_STUDENTS = "SELECT COUNT(*) FROM STUDENTS";

    private Database database = new Database();

    public List<Student> getAllStudents() throws SQLException {
        ResultSet studentsResults = database.getSQLStatement().executeQuery(GET_ALL_STUDENTS_QUERY);
        List<Student> students = new ArrayList<>();
        while (studentsResults.next()) {
            Student student = new Student(
                    studentsResults.getLong("student_id"),
                    studentsResults.getString("first_name"),
                    studentsResults.getString("last_name"),
                    studentsResults.getDate("dob"),
                    studentsResults.getString("national_code"),
                    studentsResults.getDouble("gpu")
            );
            students.add(student);
        }
        return students;
    }

    public int getCountOfStudents() throws SQLException {
        ResultSet countResult = database.getSQLStatement().executeQuery(GET_COUNT_OF_STUDENTS);
        int studentCount = 0;
        while (countResult.next()) {
            studentCount = countResult.getInt("count");
        }
        return studentCount;
    }
}
