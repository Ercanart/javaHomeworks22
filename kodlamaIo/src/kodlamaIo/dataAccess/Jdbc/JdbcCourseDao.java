package kodlamaIo.dataAccess.Jdbc;

import kodlamaIo.dataAccess.interfaces.ICourseDao;
import kodlamaIo.entities.Course;

public class JdbcCourseDao implements ICourseDao {

	@Override
	public void add(Course courses) {
		System.out.println("JDBC ile veritabanına eklendi");
		
	}

}
