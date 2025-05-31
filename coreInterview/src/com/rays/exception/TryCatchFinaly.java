package com.rays.exception;

public class TryCatchFinaly {

	public static void main(String[] args) {

		try {

			String name = null;

			System.out.println(name.length());
			//System.exit(0);
		} catch (NullPointerException e) {

			System.out.println(e);

			//System.exit(0);

		} finally {

			System.out.println("This is Finally Block");

		}

	}

}