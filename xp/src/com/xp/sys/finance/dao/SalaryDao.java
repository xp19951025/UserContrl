package com.xp.sys.finance.dao;

import java.util.List;

import com.xp.pojo.Salary;
import com.xp.pojo.SalaryChar;

public interface SalaryDao {

	//添加数据
	boolean addSalary(Salary salary)throws Exception;
	
	//查询所有
	List<Salary> querySalary(Salary salary)throws Exception;
	
	//图形报表数据
	List<SalaryChar> querySalaryChar()throws Exception;
}
