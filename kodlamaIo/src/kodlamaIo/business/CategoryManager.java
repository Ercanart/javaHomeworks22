package kodlamaIo.business;
import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.interfaces.ICategoryDao;
import kodlamaIo.entities.Categories;

public class CategoryManager {
	private ICategoryDao categoryDao;
	private Logger[] loggers;
	
	
	public CategoryManager(ICategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Categories categories){
		
		categoryDao.add(categories);
		for (Logger logger : loggers) { 
			logger.log(categories.getCategoryName());
		}
	}
}