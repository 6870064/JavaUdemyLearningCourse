package com.javcode;

import com.javcode.StackQueue.Passenger;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        passengerProcessing();
    }

private static void passengerProcessing(){
        Stack<Passenger> bus = new Stack<>();
        Passenger passenger = new Passenger("Katerina", "Ivanova");
        bus.push(new  Passenger("Alex", "Vasko"));
        bus.push(new Passenger("Viktor", "Mikhailov"));
        bus.push(new Passenger("Dmitry", "Petrov"));
        bus.push(passenger);
        bus.push(new Passenger("Ivan", "Ivanov"));

    System.out.println("Passenger found at position "+bus.search(passenger));

    System.out.println("The last passenger is: " +bus.peek());
    while(!bus.empty()){
        System.out.println(" Passenger : "+bus.pop());
    }
}
}
