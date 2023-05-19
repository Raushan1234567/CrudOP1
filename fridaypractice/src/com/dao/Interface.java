package com.dao;

import com.dto.Student;
import com.exception.Something;

public interface Interface {

	void adddata(Student a);

	void Delete(int roll) throws Something;

}
