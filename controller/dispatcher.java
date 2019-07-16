/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaController;

/**
 *
 * @author isaacfuentes
 */
public class dispatcher {
    private Mexico Mexico;
	private Canada Canada;
	private USA USA;
	
	public dispatcher() {
		Mexico = new Mexico();
		Canada = new Canada();
		USA = new USA();
	}
	
	public void dispatch(String request) {
		
		if(request.equalsIgnoreCase("Mexico")) {
			Mexico.bio();
		}
		
		else if(request.equalsIgnoreCase("Canada")) {
			Canada.bio();
		}
		
		else {
			USA.bio();
		}
	}
}
