package kodlamaIo.dataAccess.Hibernate;

import kodlamaIo.dataAccess.interfaces.IEducatorDao;
import kodlamaIo.entities.Educator;

public class HibernateEducatorDao implements IEducatorDao {

	@Override
	public void add(Educator educators) {
		System.out.println("Hibernate ile veritabanına eklendi");
		
	}

}
