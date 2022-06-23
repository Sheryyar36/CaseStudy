package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.DAO;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RecordDAO implements RecordDAOInterface{

	private EntityManager entityManager;
	
	@Autowired
	public RecordDAO(EntityManager entityManager){
	    this.entityManager = entityManager;	
	}
	
	@Override
	public void createRecord(LocalDate DOB, String fullname, String allergies, String history, String medications) {
	String hql = "INSERT INTO record (?, ?, ?, ?, ?)";
	Query query = entityManager.createQuery(hql);
	query.setParameter(0, DOB);
	query.setParameter(1, fullname);
	query.setParameter(2, allergies);
	query.setParameter(3, history);
	query.setParameter(4, medications);
	query.executeUpdate();
	}

	@Override
	public String readRecord(LocalDate DOB, String fullname) {
		String hql = "SELECT allergies, medications, history FROM record WHERE dob = ? AND fullname = ?";
		Query query = entityManager.createQuery(hql);
		query.setParameter(0, DOB);
		query.setParameter(1, fullname);
		String result = (String) query.getSingleResult();
		return result;
	}

	@Override
	public void updateRecord(LocalDate DOB, String fullname, String allergies, String history, String medications) {
		String hql = "UPDATE user SET allergies = ?, medications = ?, history = ? WHERE dob = ? and fullname = ?";
		Query query = entityManager.createQuery(hql);
		query.setParameter(0, allergies);
		query.setParameter(1, medications);
		query.setParameter(2, history);
		query.setParameter(3, DOB);
		query.setParameter(4, fullname);
		query.executeUpdate();
	}

	@Override
	public void deleteRecord(LocalDate DOB, String fullname) {
		String hql = "DELETE FROM record WHERE dob = ? and fullname = ?";
		Query query = entityManager.createQuery(hql);
		query.setParameter(0, DOB);
		query.setParameter(1, fullname);
		query.executeUpdate();
		
	}

}
