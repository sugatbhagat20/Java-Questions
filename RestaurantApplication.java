package com.problems;

import java.util.ArrayList;
import java.util.List;

class Restaurant
{
	String name;
	String location;
	String cuisine;
	String rating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", location=" + location + ", cuisine=" + cuisine + ", rating=" + rating
				+ "]";
	}
	public Restaurant(String name, String location, String cuisine, String rating) {
		super();
		this.name = name;
		this.location = location;
		this.cuisine = cuisine;
		this.rating = rating;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
}

class DAOLayer
{
	
	Restaurant searchRestaurant( ArrayList<Restaurant> contacts,String info)
	{
		for(Restaurant item:contacts)
		{
			if(item.getName().equals(info)) {
				return item; 
			}
			
		}
		return null;
	}
	
	
	
	void printDetails(ArrayList<Restaurant> al)
	{
		for(Restaurant res:al)
		{
			System.out.println(res);
		}
	}
}

public class RestaurantApplication {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Restaurant> contacts=new ArrayList();
		DAOLayer d=new DAOLayer();
		contacts.add(new Restaurant("NH8","Indiranagar","Indian","3"));
		contacts.add(new Restaurant("Adigas","Bhartiya City","Chinese","4"));
		//d.printDetails(contacts);
		System.out.println(d.searchRestaurant(contacts, "NH8"));
		
		
	}

}
