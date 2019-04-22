package com.goomo.JPA_Project.jpa;
//Repository
//Transaction

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.goomo.JPA_Project.Person;
@Repository
@Transactional 
public class PersonRepository {
  //connect to db
	@PersistenceContext 
	EntityManager entityManager;
	public List<Person> findAll()
	{
		 TypedQuery<Person> createNamedQuery = entityManager.createNamedQuery("Find All persion",Person.class);
		return createNamedQuery.getResultList();
	}
	public Person findById(int id)
	{						//Entity //primary key
		return entityManager.find(Person.class, id);
	}
	public Person update(Person person)
	{
		return entityManager.merge(person);
		
	}
	public Person insert(Person person)
	{
		return entityManager.merge(person);
		
	}
	public void deleteById(int id)
	{
			Person psrson = findById(id);
		 entityManager.remove(psrson);
		
	}
}
