package com.journaldev.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import com.journaldev.spring.dao.TraineeDAO;
import com.journaldev.spring.dao.UserDAO;
import com.journaldev.spring.hb.model.Trainee;

public class TraineeServiceImpl implements TraineeService {
	private TraineeDAO traineeDAO;
	
	
	
	public void setTraineeDAO(TraineeDAO traineeDAO) {
		this.traineeDAO = traineeDAO;
	}

	@Override
	@Transactional
	public void addTrainee(Trainee p) {
		// TODO Auto-generated method stub
		this.traineeDAO.addTrainee(p);
	}

	@Override
	@Transactional
	public void updateTrainee(Trainee p) {
		// TODO Auto-generated method stub
		this.traineeDAO.updateTrainee(p);
	}

	@Override
	@Transactional
	public List<Trainee> listTrainees() {
		// TODO Auto-generated method stub
		return this.traineeDAO.listTrainees();
	}

	@Override
	@Transactional
	public Trainee getTraineeById(int id) {
		// TODO Auto-generated method stub
		return this.traineeDAO.getTraineeById(id);
	}

	@Override
	@Transactional
	public void removeTrainee(int id) {
		// TODO Auto-generated method stub
		this.traineeDAO.removeTrainee(id);
	}

}
