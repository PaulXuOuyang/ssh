package org.yuling.ssh.dao.person;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.yuling.ssh.entity.Person;

@Repository
public class PersonRepositoryImpl implements PersonRepository {

	@Autowired
    private SessionFactory sessionFactory;
	
	 public Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }
	
	public Person load(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Person get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void persist(Person entity) {
		// TODO Auto-generated method stub

	}

	public Long save(Person entity) {
//		getCurrentSession().beginTransaction();
		return (long)getCurrentSession().save(entity);
//		throw new RuntimeException("dfdff");
	}

	public void saveOrUpdate(Person entity) {
		// TODO Auto-generated method stub

	}

	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	public void flush() {
		// TODO Auto-generated method stub

	}

}
