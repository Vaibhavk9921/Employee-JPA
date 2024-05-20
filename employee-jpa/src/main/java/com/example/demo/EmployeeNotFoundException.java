package com.example.demo;

public class EmployeeNotFoundException extends RuntimeException
{
@Override
public String toString() {
	return "Employee Data Not Found!!!";
}

}
