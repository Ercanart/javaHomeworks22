package kodlamaIo.business;




import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.interfaces.ICourseDao;
import kodlamaIo.entities.Courses;

public class CourseManager {
	private ICourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(ICourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Courses courses) throws Exception {
	
		if(courses.getCoursePrice()<0) {
			throw new Exception("Ürün fiyatı 0 dan küçük olamaz");
		
		}
		courseDao.add(courses);
		for (Logger logger : loggers) { 
			logger.log(courses.getCourseName());
		}
	}
	
	
}
