package kodlamaIo.dataAccess.Jdbc;

import kodlamaIo.dataAccess.interfaces.IEducatorDao;
import kodlamaIo.entities.Educator;

public class JdbcEducatorDao implements IEducatorDao {

	@Override
	public void add(Educator educators) {
		System.out.println("JDBC ile veritabanına eklendi");
		
	}

}
