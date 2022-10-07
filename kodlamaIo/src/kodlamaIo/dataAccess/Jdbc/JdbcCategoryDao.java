package kodlamaIo.dataAccess.Jdbc;

import kodlamaIo.dataAccess.interfaces.ICategoryDao;
import kodlamaIo.entities.Categories;

public class JdbcCategoryDao implements ICategoryDao {

	@Override
	public void add(Categories categories) {
		System.out.println("JDBC ile veritabanına eklendi");
		
	}

}
