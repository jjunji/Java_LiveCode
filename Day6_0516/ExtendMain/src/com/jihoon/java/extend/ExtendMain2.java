package com.jihoon.java.extend;

import java.util.ArrayList;

import com.jihoon.java.city.hospital.Doctor;
import com.jihoon.java.city.hospital.Hospital;
import com.jihoon.java.city.hospital.Nurse;
import com.jihoon.java.city.hospital.Patient;

public class ExtendMain2 {

	public static void main(String[] args) {
		// 병원을 하나 만들고

		// 의사를 3명

		// 간호사 6명 - 각각 다른 방향으로 한번씩 움직인다. (move 호출)

		// 환자 21명

		// 각 의사가 환자를 7명씩 진찰하는 프로그램을 작성하세요

		Hospital hospital = new Hospital();
		// hospital.doctor = 3;
		// hospital.nurse = 6;

		Doctor doctor_j = new Doctor();
		Doctor doctor_h = new Doctor();
		Doctor doctor_k = new Doctor();

		Nurse nurse[] = new Nurse[6];
		for(int i = 0 ; i < nurse.length ; i++){
			nurse[i] = new Nurse();
		}
		
		nurse[0].move("위");
		nurse[1].move("아래");
		nurse[2].move("오른쪽");
		nurse[3].move("왼쪽");
		nurse[4].move("대각선이동");
		nurse[5].move("뒤로");
		

		Patient patient[] = new Patient[21];
		
		for(int i=0; i < 21; i++){
			//patient[i].name = "patient "+ i;
			patient[i] = new Patient();
			//patient[i].name = "patient" + i;   // 아래와 차이점이 있는가
			patient[i].setName("patient"+(i+1));
		}
		
		
		for(int i=0; i < 7; i++){
			doctor_j.diagnosis(patient[i]);
		}
		
		for(int i=7; i < 14; i++){
			doctor_h.diagnosis(patient[i]);
		}
		
		for(int i=14; i < 21; i++){
			doctor_h.diagnosis(patient[i]);
		}
	}

}