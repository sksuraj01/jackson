package com.java.json;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ObjectMapper om=new ObjectMapper();
		
		String jsonString = "{\"name\": \"Jane Doe\",\"favoritegame\": \"Stardew Valley\",\"subscriber\": false}";

		try {
			
//convert json string to nodes which can be traversed			
JsonNode jnode=om.readTree(jsonString);

//convert json string to java object
Person person=om.readValue(jsonString, Person.class);
System.out.println(person);


Person person2=new Person();

person2.setFavoritegame("cricket");
person2.setName("Suraj Kumar");
person2.setSubscriber("awesome");


//convert java object to json
String content=om.writeValueAsString(person2);


System.out.println(content);


String filepath="target/newperson.json";


File file=new File(filepath);

//convert java object to json & write to a file
om.writeValue(file, person2);

System.out.println("content written to file "+filepath);

System.out.println(jnode.get("name"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


		
}
}
