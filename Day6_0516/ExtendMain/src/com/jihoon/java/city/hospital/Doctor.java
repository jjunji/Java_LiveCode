package com.jihoon.java.city.hospital;

import com.jihoon.java.city.People;

public class Doctor extends People{

	public void diagnosis(Patient patient){
		System.out.println(patient.getName() + " 환자를 진찰한다.");
	}
	
}
