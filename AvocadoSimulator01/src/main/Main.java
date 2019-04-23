/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package main;

import avocado.Avocado;

/***
 * Exercise our Avocado classes
 * @author nicomp
 *
 */
public class Main {
	enum myEnum {A,B,C,D};	// Demo of enumerated date type

	public static void main(String[] args) {
		//myEnum e = myEnum.A;
	//Declare and instantiate an Avocado object
		Avocado bob = new Avocado("green", Avocado.enumCondition.fresh, 100);
		
		
	}
}
