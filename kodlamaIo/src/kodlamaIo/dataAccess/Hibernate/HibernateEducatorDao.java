package kodlamaIo.dataAccess.Hibernate;

import kodlamaIo.dataAccess.interfaces.IEducatorDao;
import kodlamaIo.entities.Educators;

public class HibernateEducatorDao implements IEducatorDao {

	@Override
	public void add(Educators aducators) {
		System.out.println("Hibernate ile veritabanına eklendi");
		
	}

}
