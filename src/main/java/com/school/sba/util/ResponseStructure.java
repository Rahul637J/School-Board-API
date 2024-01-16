package com.school.sba.util;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Setter
@Getter
public class ResponseStructure<T>
{
	private int status;
	private String msg;
	private T data;

	
}
