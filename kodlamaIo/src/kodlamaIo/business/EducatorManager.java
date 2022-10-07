package kodlamaIo.business;
import java.util.List;
import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.interfaces.IEducatorDao;
import kodlamaIo.entities.Educator;

public class EducatorManager {
	private IEducatorDao educatorDao ;
	private Logger[] loggers;
	
	
	
	public EducatorManager(IEducatorDao educatorDao, Logger[] loggers) {
		super();
		this.educatorDao = educatorDao ;
		this.loggers = loggers;
	}

	public void add(Educator educators) {
	
		educatorDao.add(educators);
		for (Logger logger : loggers) { 
			logger.log(educators.getEducatorName() +" "+ educators.getEducatorSurname());
		}
	}
}
