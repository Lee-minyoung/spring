package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.EmpMapper;
import com.example.demo.service.EmpService;
import com.example.demo.service.EmpVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmpServiceImpl implements EmpService{
	private EmpMapper empmapper;
	
    public EmpVO getEmp(EmpVO empVO) {
		return empVO;
	}
    public List<EmpVO> getEmpList(EmpVO empVO) {
		return empmapper.getEmpList();
	}
    
    
	@Override
	public EmpVO getEmp() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void empInsert(EmpVO empVO) {
		// TODO Auto-generated method stub
		
	}
//    public void empInsert(EmpVO empVO) {
//	}
}
