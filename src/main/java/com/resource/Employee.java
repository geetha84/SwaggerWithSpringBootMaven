package com.resource;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Employee")
public class Employee {

	private long empId;
	private String empName;
	private String companyName;

	/**
	 * @return the empId
	 */
	@XmlElement(name = "empId")
	public long getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(long empId) {
		this.empId = empId;
	}

	/**
	 * @return the empName
	 */
	@XmlElement(name = "empName")
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the companyName
	 */
	@XmlElement(name = "companyName")
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
