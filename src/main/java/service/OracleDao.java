package service;

import model.Bean;
import di.Dao;

public class OracleDao implements Dao{

	public void insert(Bean bean) {
		System.out.println("Oracle Dao Insert()"+bean);
	}

}
