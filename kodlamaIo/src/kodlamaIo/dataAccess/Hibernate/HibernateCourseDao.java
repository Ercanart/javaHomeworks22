package kodlamaIo.dataAccess.Hibernate;

import kodlamaIo.dataAccess.interfaces.ICourseDao;
import kodlamaIo.entities.Course;

public class HibernateCourseDao implements ICourseDao {

	@Override
	public void add(Course courses) {
		System.out.println("Hibernate ile veritabanına eklendi");
		
	}

}
