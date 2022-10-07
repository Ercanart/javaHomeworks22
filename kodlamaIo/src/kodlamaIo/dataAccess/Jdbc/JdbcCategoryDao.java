package kodlamaIo.dataAccess.Jdbc;

import kodlamaIo.dataAccess.interfaces.ICategoryDao;
import kodlamaIo.entities.Category;

public class JdbcCategoryDao implements ICategoryDao {

	@Override
	public void add(Category categories) {
		System.out.println("JDBC ile veritabanına eklendi");
		
	}

}
