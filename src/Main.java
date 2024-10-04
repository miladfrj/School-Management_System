import model.Student;
import service.studentService;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        studentService service = new studentService();
        service.printCountOfStudents();
    }
}