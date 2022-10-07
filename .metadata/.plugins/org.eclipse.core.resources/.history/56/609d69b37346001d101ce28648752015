package kodlamaIo.business;
import java.util.List;
import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.interfaces.IEducatorDao;
import kodlamaIo.entities.Educators;

public class EducatorManager {
	private IEducatorDao educatorDao ;
	private Logger[] loggers;
	
	
	
	public EducatorManager(IEducatorDao educatorDao, Logger[] loggers) {
		super();
		this.educatorDao = educatorDao ;
		this.loggers = loggers;
	}

	public void add(Educators aducators) throws Exception {
	
		educatorDao.add(aducators);
		for (Logger logger : loggers) { 
			logger.log(aducators.getEducatorName() +" "+ aducators.getEducatorSurname());
		}
	}
}
