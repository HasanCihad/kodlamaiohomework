package business;
import java.util.List;

import core_logging.Logger;
import dataAccess.InstructorData.InstructorDao;
import entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;

    private Logger[] loggers;

    private List<Instructor> instructors;


    public InstructorManager(InstructorDao instructorDao, Logger[] loggers, List<Instructor> instructors) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
        this.instructors = instructors;
    }


    public void add(Instructor instructor)throws Exception{

        for (Instructor ins:instructors) {

            if (ins.getFirstName() ==instructor.getFirstName() && ins.getLastName()==instructor.getLastName()){
                throw new Exception("Böyle bir eğitmen zaten mevcut");
            }

        }

        instructors.add(instructor);
        instructorDao.add(instructor);

        for (Logger logger : loggers) {
            logger.log(instructor.getFirstName());
            logger.log(instructor.getLastName());
        }




    }

}
