package yourname.Dao;

import org.springframework.beans.factory.annotation.Qualifier;
import yourname.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
@Qualifier("version0")
public class StudentDaoImple implements StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<>() {
            {
                put( 1, new Student( 1, "Said", "Computer Science" ) );
                put( 2, new Student( 2, "Alex", "Finance" ) );
                put( 3, new Student( 3, "Anny", "Math" ) );
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents() {
        return this.students.values();
    }

    @Override
    public Student getStudentById(int id) {
        return this.students.get( id );
    }

    @Override
    public void removeStudentById(int id) {
        this.students.remove( id );
    }

    @Override
    public void updateStudent(Student student) {
        Student s = students.get( student.getId() );
        s.setCourse( student.getCourse() );
        s.setName( student.getName() );
        students.put( student.getId(), student );
    }

    @Override
    public void insertStudentToDb(Student student) {
        this.students.put(student.getId(), student);
    }
}
