package service;

import java.util.List;

import exception.SystemException;
import pojo.EmployeePojo;
import pojo.MergedReimbursmentPojo;


public interface EmployeeService {
	EmployeePojo employeeInfo(int employeeId) throws SystemException;
	EmployeePojo employeeViewDetails(String employeeContact)throws SystemException;

	EmployeePojo login(String employeeContact, String employeePassword)throws SystemException;	

	MergedReimbursmentPojo submitReimbursementReq(MergedReimbursmentPojo pendingReimbursementPojo)throws SystemException; 
	
	MergedReimbursmentPojo viewReimbursementPendingReq(int reimbursementId)throws SystemException;

	MergedReimbursmentPojo viewReimbursementResolveReq(int reimbursementId)throws SystemException;
	
	EmployeePojo updateEmployeeInfo(EmployeePojo employeePojo)throws SystemException;

}
