package dataAccess.InstructorData;

import entities.Instructor;

public class JDBCInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("JDBC ile veritabanına eklendi");

    }
}
