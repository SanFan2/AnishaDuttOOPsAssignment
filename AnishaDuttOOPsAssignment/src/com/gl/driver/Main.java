package com.gl.driver;

import com.gl.data.*;

public class Main {
	
	

	public static void main(String[] args) {

		
		HRDepartment objectHr = new HRDepartment(); //className objectName = new className

		TechDepartment objectTDept = new TechDepartment();
		
		AdminDepartment objectADept = new AdminDepartment();
		
		
		
		// Admin Department
		// 3 Methods
		String adminStoreMethod1 = objectADept.departmentName();
		System.out.println("Welcome to " +adminStoreMethod1);

		String adminStoreMethod2 = objectADept.getTodaysWork();
		System.out.println(adminStoreMethod2);

		String adminStoreMethod3 = objectADept.getWorkDeadline();
		System.out.println(adminStoreMethod3);
		
		String superAdminStoreMethod1 = objectADept.isTodayAHoliday();
		System.out.println(superAdminStoreMethod1);
		
				
		// Line Break
		System.out.println(" ");
		
		//HR Dept
		//4 Methods
		String HrStore1 = objectHr.departmentName();
		System.out.println("Welcome to " +HrStore1);

		String HrStore2 = objectHr.doActivity();
		System.out.println(HrStore2);
		
		String HrStore3 = objectHr.getTodaysWork();
		System.out.println(HrStore3);
		
		String HrStore4 = objectHr.getWorkDeadline();
		System.out.println(HrStore4);
		
		String superAdminStoreMethod2 = objectADept.isTodayAHoliday();
		System.out.println(superAdminStoreMethod2);
		
		
		// Line Break
		System.out.println(" ");
		
		
		// Tech Department
		//4 Methods
		String TechStore1 = objectTDept.departmentName();
		System.out.println("Welcome to " +TechStore1);

		String TechStore2 = objectTDept.getTodaysWork();
		System.out.println(TechStore2);
		
		String TechStore3 = objectTDept.getWorkDeadline();
		System.out.println(TechStore3);
		
		String TechStore4 = objectTDept.getTechStackInformation();
		System.out.println(TechStore4);
		
		String superAdminStoreMethod3 = objectADept.isTodayAHoliday();
		System.out.println(superAdminStoreMethod3);
		
		
		
		// Object name for Tech Class
		//objectTDept
		
		//HrDepartment, TechDepartment, AdminDepartment
	}

}
