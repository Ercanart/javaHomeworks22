package kodlamaIo.dataAccess.Jdbc;

import kodlamaIo.dataAccess.interfaces.IEducatorDao;
import kodlamaIo.entities.Educators;

public class JdbcEducatorDao implements IEducatorDao {

	@Override
	public void add(Educators educators) {
		System.out.println("JDBC ile veritabanına eklendi");
		
	}

}
