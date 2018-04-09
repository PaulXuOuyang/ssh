package org.yuling.ssh.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.yuling.ssh.dao.person.PersonRepository;
import org.yuling.ssh.entity.Person;

@Service
public class MainServiceImpl implements MainService {

	 @Autowired
    private PersonRepository personRepository;
	 
	public String test() {
		return "test";
	}

	@Transactional
	@Override
	@PostConstruct
	public Long savePerson(){
	   Person person = new Person();
	   person.setUsername("XRog1");
	   person.setPhone("18381005941");
	   person.setAddress("chenDu1");
	   person.setRemark("this is XRog1");
	   personRepository.save(person);
	   throw new RuntimeException("test");
   }

	
}
