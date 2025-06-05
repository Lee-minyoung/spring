package com.example.demo.service;

import java.util.List;

public interface EmpService {
	
    public EmpVO getEmp();
    public List<EmpVO> getEmpList(EmpVO empVO);
    public void empInsert(EmpVO empVO);
	
	
}
