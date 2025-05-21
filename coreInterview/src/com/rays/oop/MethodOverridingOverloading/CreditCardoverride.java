package com.rays.oop.MethodOverridingOverloading;

//Subclass
class CreditCardOverride extends PaymentOverriding {
 @Override
 public void processPayment(double amount) {
     System.out.println(" Processing credit card payment of " + amount + " with 2% bank fee.");
 }
}

