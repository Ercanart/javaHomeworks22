package kodlamaIo.business;




import java.util.List;

import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.interfaces.ICourseDao;
import kodlamaIo.entities.Course;

public class CourseManager {
	private ICourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;
	
	
	
	public CourseManager(ICourseDao courseDao, Logger[] loggers, List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}


	public void add(Course course) throws Exception {
	
		if(course.getCoursePrice()<0) {
			throw new Exception("Ürün fiyatı 0 dan küçük olamaz");
		
		}
		
		for(Course crs : courses) {
			if(crs.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Course's name could not be same as others'");
			}
		}
		
		courseDao.add(course);
		courses.add(course);
		
		for (Logger logger : loggers) { 
			logger.log(course.getCourseName());
		}
	}
	
	
}
