package com.atmecs;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class ReadFile 
{
	public static void main(String[] args) throws Exception
	{
		Object obj = new JSONParser().parse(new FileReader("C:\\Users\\saianusha.podichervu\\Desktop\\readfile.json"));
		// typecasting obj to JSONObject
		JSONObject jo = (JSONObject) obj;

		// getting firstName and lastName
		String firstName = (String) jo.get("firstName");
		String lastName = (String) jo.get("lastName");

		System.out.println(firstName);
		System.out.println(lastName);

		// getting age
		long age = (Long) jo.get("age");
		System.out.println(age);

		// getting address
		Map address = ((Map) jo.get("address"));

		// iterating address Map
		Iterator<Map.Entry> itr1 = address.entrySet().iterator();
		while (itr1.hasNext()) {
			Map.Entry pair = itr1.next();
			System.out.println(pair.getKey() + " : " + pair.getValue());
		}

		// getting phoneNumbers
		JSONArray ja = (JSONArray) jo.get("phnno");

		// iterating phoneNumbers
		Iterator itr2 = ja.iterator();

		while (itr2.hasNext())
		{
			itr1 = ((Map) itr2.next()).entrySet().iterator();
			while (itr1.hasNext())
			{
				Map.Entry pair = itr1.next();
				System.out.println(pair.getKey() + " : " + pair.getValue());
			}
		}

		// writing JSON to file:"JSONExample.json" in cwd
		PrintWriter pw = new PrintWriter("C:\\Users\\saianusha.podichervu\\Desktop\\readfile.json");
		pw.write(jo.toJSONString());

		pw.flush();
		pw.close();
	}
}
