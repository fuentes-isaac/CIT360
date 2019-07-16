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
public class controller {
	
	private final dispatcher dispatcher;
	
	public controller() {
		
		dispatcher = new dispatcher();
		
	}
	
	private boolean isAuthenticUser() {
		
		System.out.println("User is authenticated successfully.");
		return true;
	}
	
	private void trackRequest(String request) {
		
		System.out.println("Page Request: " + request);
		
	}
	
	public void dispatchRequest( String request ) {
		
		trackRequest(request);
		
		if(isAuthenticUser()) {
			dispatcher.dispatch(request);
		}
	}
}
