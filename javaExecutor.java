/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

/**
 *
 * @author isaacfuentes
 */
public class javaExecutor {

    public static void main(String[] args) {
        Stream<String> flujo = Stream.of("exec1", "exec2", "exec3");
        ExecutorService servicio = Executors.newCachedThreadPool();

        flujo.map(t -> new javaRunnables(t)).forEach(servicio::execute);
    }
}
