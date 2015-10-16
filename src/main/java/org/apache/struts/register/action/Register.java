package org.apache.struts.register.action;

import java.util.Date;

import org.apache.struts.register.model.Person;

import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Person personBean;

	private Date date;

	@Override
	public String execute() throws Exception {

		// call Service class to store personBean's state in database

		return SUCCESS;

	}

	@Override
	public void validate() {

		if (personBean.getFirstName().length() == 0) {

			addFieldError("personBean.firstName", "First name is required.");

		}

		if ((personBean.getEmail().length() < 3) || !personBean.getEmail().contains("@")
				|| !personBean.getEmail().contains(".")) {

			addFieldError("personBean.email", "A valid Email is required.");

		}

		if (personBean.getAge() < 18) {

			addFieldError("personBean.age", "Age is required and must be 18 or older");

		}

	}

	public Person getPersonBean() {

		return personBean;

	}

	public void setPersonBean(Person person) {

		personBean = person;

	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		System.out.println(">> " + date);
		this.date = date;
	}

}