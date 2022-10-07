package kodlamaIo.dataAccess.Hibernate;

import kodlamaIo.dataAccess.interfaces.ICategoryDao;
import kodlamaIo.entities.Category;

public class HibernateCategoryDao implements ICategoryDao {

	@Override
	public void add(Category categories) {
		System.out.println("Hibernate ile veritabanına eklendi");
		
	}

}
