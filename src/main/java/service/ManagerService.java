package service;

import java.util.List;

import exception.SystemException;
import pojo.EmployeePojo;
import pojo.ManagerPojo;
import pojo.MergedReimbursmentPojo;


public interface ManagerService {

		ManagerPojo fetchOneManager(String employeeContact)throws SystemException;
		
		ManagerPojo login(String managerContact, String managerPassword)throws SystemException;
		ManagerPojo managerViewinfo(String managerContact)throws SystemException;
		
		MergedReimbursmentPojo approveOrDeny(MergedReimbursmentPojo resolvedReimbursmentPojo)throws SystemException;
		
		MergedReimbursmentPojo fetchAPendingRequest(int reimbursementId) throws SystemException; 
		List<MergedReimbursmentPojo> fetchAllPendingReq()throws SystemException;
		 List<MergedReimbursmentPojo> fetchAllResolveReq()throws SystemException;
		 List<MergedReimbursmentPojo> viewReimbursementReq(int requestingEmployeeId)throws SystemException;
		List<EmployeePojo> fetchAllEmployee()throws SystemException;
	
	



}
