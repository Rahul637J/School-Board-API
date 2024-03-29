package com.school.sba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.sba.entity.AcademicProgram;
import com.school.sba.entity.School;

public interface AcademicProgramRepo extends JpaRepository<AcademicProgram, Integer>
{
	List<AcademicProgram> findAllByIsDelete(boolean b);

	List<AcademicProgram> findBySchool(School school);
}
