package com.mycompany.lab12task2ruqqia;
abstract class Seat {
public abstract double calculateSeatPrice(int seats); }
class BusinessClass extends Seat {
public double calculateSeatPrice(int numberofSeats) throws IllegalArgumentException {
double pricePerSeat = 10000; return seats * pricePerSeat;
} }
class FirstClass extends Seat {
public double calculateSeatPrice(int numberofSeats)throws IllegalArgumentException {
double pricePerSeat = 20000;
return seats * pricePerSeat; }
}
class EconomyClass extends Seat {
public double calculateSeatPrice(int numberofSeats)throws IllegalArgumentException {
double pricePerSeat = 30000;
return seats * pricePerSeat; }
}
public class Lab12task2ruqqia {
public static void main(String[] args) { Seat business = new BusinessClass(); Seat first = new BusinessClass();
Seat economy = new BusinessClass();
System.out.println("Business Class Price "+ business.calculateSeatPrice(3)); System.out.println("First Class Price "+ first.calculateSeatPrice(2)); System.out.println("Economy Class Price "+ economy.calculateSeatPrice(4)); }
}