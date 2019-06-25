
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jUnitTest;

/**
 *
 * @author isaacfuentes
 */
public class jUnitTest {
    //create a test that will find the bigger number entered from out
    //of 3 numbers.
    public int bigger_number(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (c > b) {
            return c;
        } else {
            return b;
        }
    }
}
