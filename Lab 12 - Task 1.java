package com.mycompany.lab12task1ruqqia;
abstract class vehicle {
public abstract void start(); }
class Car extends vehicle {
private String model; Car (String model)
{
this.model=model; }
public void start() {
System.out.println(model + "Car is starting"); }
}
class Motorcycle extends vehicle {
private String brand; Motorcycle(String brand) {
this.brand= brand; }
public void start() {
System.out.println(brand + "Motorcycle is starting"); }
}
public class Lab12task1Ruqqia {
public static void main(String[] args) {
Car c = new Car ("Toyoto");
Motorcycle m = new Motorcycle("Honda"); c.start();
m.start(); }
}