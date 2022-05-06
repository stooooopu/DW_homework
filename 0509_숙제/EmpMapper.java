package com.example.first_spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.first_spring.vo.EmpVO;

@Mapper
public interface EmpMapper {
	
	// 문제 0.
	public List<EmpVO> getSalDeptno(@Param("sal") int sal);
	
	// 문제 1.
	public List<EmpVO> getNotMgr();
	
	// 문제 2.
	public List<EmpVO> getHiredateYear(String year);
	
	// 문제 3.
	public List<EmpVO> getMaxSal(String month);
	
	// 문제 4.
	public EmpVO getFirstHiredate(String job);
	
	// 문제 5.
	public EmpVO getEmpnoAllData(int empno);
}
