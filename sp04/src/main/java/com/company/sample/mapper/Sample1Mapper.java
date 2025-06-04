package com.company.sample.mapper;

import org.apache.ibatis.annotations.Insert;

public interface Sample1Mapper {

	@Insert("insert into tbl_sample1 (col1) values (#{data} ) ")
	public int isertCol1(String data);
}
