package com.journaldev.spring.service;

import java.util.List;

import com.journaldev.spring.hb.model.City;
import com.journaldev.spring.hb.model.District;
import com.journaldev.spring.hb.model.Person;
import com.journaldev.spring.hb.model.Region;
import com.journaldev.spring.hb.model.State;

public interface MasterService {
	//State
		public void addState(State p);
		public void updateState(State p);
		public List<State> listStates();
		public State getStateById(int id);
		public void removeState(int id);
		
		//District
		public void addDistrict(District p);
		public void updateDistrict(District p);
		public List<District> listDistricts();
		public District getDistrictById(int id);
		public void removeDistrict(int id);
		
		//City
		public void addCity(City p);
		public void updateCity(City p);
		public List<City> listCitys();
		public City getCityById(int id);
		public void removeCity(int id);
			
		//Region
		public void addRegion(Region p);
		public void updateRegion(Region p);
		public List<Region> listRegions();
		public Region getRegionById(int id);
		public void removeRegion(int id);

}
