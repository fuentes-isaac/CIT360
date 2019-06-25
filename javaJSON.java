package javaJSON;

import org.json.simple.JSONArray;
import org.json.JSONObject;
/**
 *
 * @author isaacfuentes
 */
public class javaJSON {
    public static void main(String args[]) {
		
		//creating JSON Array
		JSONArray ar=new JSONArray();
 
		JSONObject obj;
		
		//Creating and adding first JSON Object to JSON Array
		obj=new JSONObject();
		obj.put("name","One");
		ar.add(obj);
		
		//Creating and adding second JSON Object to JSON Array
		obj=new JSONObject();
		obj.put("name","Two");
		ar.add(obj);
 
		//Creating and adding third JSON Object to JSON Array
		obj=new JSONObject();
		obj.put("name","Three");
		ar.add(obj);
 
		
		//Retrieving JSON Objects from JSON Array
		for(int i=0;i<ar.size();++i) {
			obj=(JSONObject)ar.get(i);
			System.out.println(obj.get("name"));			
		}
	}
}
