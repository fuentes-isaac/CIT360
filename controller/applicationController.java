/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaController;
import java.util.Scanner;
/**
 *
 * @author isaacfuentes
 */
public class applicationController {
    public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Choose Mexico, Canada or USA to learn about that country.");
		controller app = new controller();
		app.dispatchRequest(input.next());
	}
}
