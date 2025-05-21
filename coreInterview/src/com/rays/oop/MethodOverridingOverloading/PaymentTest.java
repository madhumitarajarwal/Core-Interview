package com.rays.oop.MethodOverridingOverloading;

//Test class
public class PaymentTest {
 public static void main(String[] args) {
	 PaymentOverriding processor = new CreditCardOverride();  
     processor.processPayment(2000.00);
 }
}
