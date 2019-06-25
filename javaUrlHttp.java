/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaUrlHttp;
//Used for reading data to Strings
import java.io.BufferedReader;

import java.io.IOException;
//Use to read the actual content
import java.io.InputStream;
//reading data to characters
import java.io.InputStreamReader;
//Throw an expection if the URL is malformed
import java.net.MalformedURLException;
import java.net.URL;
//represent a connection between a Java application and a UR
import java.net.URLConnection;

/**
 *
 * @author isaacfuentes
 */
public class javaUrlHttp {

    public static void main(String[] args) {
        try {
            //Open the connection to a non secure site
            URL url = new URL("http://www.varonrojo.com");
            URLConnection conexion = url.openConnection();
            conexion.connect();

            // Retrive data (text and htmltags) from site 
            //by reading the information in it using the getInoutStream Method.
            InputStream is = conexion.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            char[] buffer = new char[1000];
            //create a loop to itinerate through all the site and get the data.
            int read;
            while ((read = br.read(buffer)) > 0) {
                //Print om the screen the information stored in the buffer.
                System.out.println(new String(buffer, 0, read));
            }
            //create a error catching in case URL is malformed
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}


