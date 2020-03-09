package com.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.spring.entity.Person;

@Repository
public class PersonDaoImp implements PersonDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void add(Person person) {
		em.persist(person);
	}

	@Override
	public List<Person> listPersons() {
		CriteriaQuery<Person> criteriaQuery = em.getCriteriaBuilder().createQuery(Person.class);
		// https://www.objectdb.com/java/jpa/query/criteria
		// Select * From person 
		Root<Person> root = criteriaQuery.from(Person.class);// range
		return em.createQuery(criteriaQuery).getResultList();
	}

}
