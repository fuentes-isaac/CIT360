/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaThreads;
/**
 *
 * @author isaacfuentes
 */


public class javaRunnables implements Runnable {

    private String nombre;

    public javaRunnables(String nombre) {
        super();
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            System.out.println(nombre);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class javaThreadsAtomic {

    public static void main(String[] args) {

        Thread t1 = new Thread(new javaRunnables("work1"));
        t1.start();
        Thread t2 = new Thread(new javaRunnables("work2"));
        t2.start();
        Thread t3 = new Thread(new javaRunnables("work3"));
        t3.start();
    }
}
  
