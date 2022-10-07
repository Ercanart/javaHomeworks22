package kodlamaIo.business;
import java.util.List;
import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.interfaces.ICategoryDao;
import kodlamaIo.entities.Categories;

public class CategoryManager {
	private ICategoryDao categoryDao;
	private Logger[] loggers;
	List<Categories> category;
	
	public CategoryManager(ICategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Categories categories) throws Exception {
		
		categoryDao.add(categories);
		for (Logger logger : loggers) { 
			logger.log(categories.getCategoryName());
		}
	}
}