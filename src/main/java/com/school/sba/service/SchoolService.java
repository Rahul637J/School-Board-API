package com.school.sba.service;

import org.springframework.http.ResponseEntity;

import com.school.sba.requestdto.SchoolRequest;
import com.school.sba.responsedto.SchoolResponse;
import com.school.sba.util.ResponseStructure;

public interface SchoolService
{

	ResponseEntity<ResponseStructure<SchoolResponse>> saveSchool(int userId, SchoolRequest request);

	ResponseEntity<ResponseStructure<SchoolResponse>> deleteSchoolById(int schoolId);
	
}
