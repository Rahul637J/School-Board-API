package com.school.sba.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.school.sba.entity.Users;
import com.school.sba.enums.UserRole;
import com.school.sba.requestdto.AcademicProgramRequest;
import com.school.sba.responsedto.AcademicProgramResponse;
import com.school.sba.responsedto.UsersResponse;
import com.school.sba.util.ResponseStructure;

public interface AcademicProgramService 
{
	ResponseEntity<ResponseStructure<AcademicProgramResponse>> addAcademicProgram(int schoolId,
			AcademicProgramRequest request);

	ResponseEntity<ResponseStructure<List<AcademicProgramResponse>>> findAllAcademicProgram(int schoolId);

	ResponseEntity<ResponseStructure<AcademicProgramResponse>> assignTeachersAndStudent(int programId, int userId);

	ResponseEntity<ResponseStructure<AcademicProgramResponse>> deleteAcademicProgram(int academicProgramId);

}
