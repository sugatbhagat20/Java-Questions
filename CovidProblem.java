package com.collections;

import java.util.*;

class Vaccine
{
	private int age;
	private float dosage;
	public Vaccine(int age) {
		
		this.age = age;
	}
	
	public Vaccine() {
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getDosage() {
		return dosage;
	}
	public void setDosage(float dosage) {
		this.dosage = dosage;
	}
	
	
}

class VaccinationCamp
{
	 
	 
	ArrayList<Vaccine> list = new ArrayList<>();
	
	void assignVaccine()
	
	{
		for(Vaccine v:list) {
		if(v.getAge()>=45)
		{
			v.setDosage(250);
		}
		else if(v.getAge()>=20)
		{
			v.setDosage(200);
		}
		else 	if(v.getAge()<20)
		{
		 v.setDosage(100);
		}
		}
	}
	
	float vaccineInjected()
	{
		int total_dosage=0;
		for(Vaccine item:list)
		{
			total_dosage+=item.getDosage();
		}
		return total_dosage;
	}
}

public class CovidProblem {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		VaccinationCamp vc = new VaccinationCamp();
		 vc.list.add(new Vaccine(49));
		 vc.list.add(new Vaccine(26));
		 vc.list.add(new Vaccine(19));
		 vc.assignVaccine();
		 System.out.println(vc.vaccineInjected());
		
		 

	}

}
