package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.DAO;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO implements UserDAOInterface{

	private EntityManager entityManager;
	
	@Autowired
	public UserDAO(EntityManager entityManager){
	    this.entityManager = entityManager;
	}
	@Override
	public void createUser(String address, Integer emtId, String password, String sex, String username, LocalDate DOB, String fullname) {
		String hql ="INSERT INTO user(?, ?, ?, ?, ?, ?, ?)";
		Query query = entityManager.createQuery(hql);
		query.setParameter(0, address);
		query.setParameter(1, emtId);
		query.setParameter(2, password);
		query.setParameter(3, sex);
		query.setParameter(4, username);
		query.setParameter(5, DOB);
		query.setParameter(6, fullname);
		query.executeUpdate();
	}

	@Override
	public String readUser(String fullname, LocalDate DOB) {
		String hql = "SELECT username, password, emtid FROM user WHERE fullname = ? AND dob = ?";
		Query query = entityManager.createQuery(hql);
		query.setParameter(0, fullname);
		query.setParameter(1, DOB);
		String result = (String) query.getSingleResult();
		return result;
	}
	
	@Override
	public String readDemo(String fullname, LocalDate DOB) {
		String hql = "SELECT fullname, dob, sex, address FROM user Where fullname = ? AND dob = ?";
		Query query = entityManager.createQuery(hql);
		query.setParameter(0, fullname);
		query.setParameter(1, DOB);
		String result = (String) query.getSingleResult();		
		return result;
		
	}

	@Override
	public void updateUser(String address, String password, String sex, String username, LocalDate DOB, String fullname) {
		String hql = "UPDATE user SET fullname = ?, dob = ?, sex = ?, address = ? WHERE username = ? AND password = ?";
		Query query = entityManager.createQuery(hql);
		query.setParameter(0, fullname);
		query.setParameter(1, DOB);
		query.setParameter(2, sex);
		query.setParameter(3, address);
		query.setParameter(4, username);
		query.setParameter(5, password);
		query.executeUpdate();
		
	}

	@Override
	public void deleteUser(String username, String password) {
		String hql = "DELETE FROM user Where username = ? and password = ?";
		Query query = entityManager.createQuery(hql);
		query.setParameter(0, username);
		query.setParameter(1, password);
		query.executeUpdate();
		
		
	}

}
