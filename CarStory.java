package com.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



class Car
{
	 private String name;
	 private String carName;
	 private double price; 
	 public Car(String name, String carName, double price) {
		super();
		this.name = name;
		this.carName = carName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", carName=" + carName + ", price=" + price + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}

class CarImplementation
{
	double sumOfPrices(List<Car> carList)
	{
		return carList.stream().mapToDouble(Car::getPrice).reduce(0.0, (a, b) -> a + b);
	}
	
	 List<String> printName(List<Car> carList)
	 {
		return carList.stream().filter(car -> car.getPrice() > 25000)
				.map(Car::getCarName).collect(Collectors.toList());
	 }
	 double maxPrice(List<Car> carList)
	 {
		 return carList.stream().mapToDouble(Car::getPrice).max().orElse(0.0);
	 }
}

public class CarStory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Car> cars = Arrays.asList(
				 new Car("Sugat","Aston Martin",100000.01d),
				 new Car("Abhi","Porche",15000.50d),
				 new Car("Himan","Lambo",30000.99d),
				 new Car("Akash","Ferrari",50050.90d)
		        );
		
		CarImplementation c=new CarImplementation();
		System.out.println(c.sumOfPrices(cars));
		
	System.out.println(	c.printName(cars));
		System.out.println(c.maxPrice(cars));
		

	}

}
