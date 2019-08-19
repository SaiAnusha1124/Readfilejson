package com.atmecs;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class UpdateFile
{
	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) throws ParseException, IOException, Exception
	{
		
		String jsonMessage = "{\"firstName\":\"Arjun\",\"lastName\":\"Bunny\",\"EmpSKILL \":\"C\",\"EmpROLE \":\"Hr\",\"age\":23,\"EmpId \":\"1122\"}";
		System.out.println("Old value=" + jsonMessage);
		@Deprecated
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(jsonMessage);
		JSONObject jsonobj = (JSONObject) obj;
		jsonobj.put("firstName", "Indira");
		@SuppressWarnings("resource")
		FileWriter pw = new FileWriter("C:\\Users\\saianusha.podichervu\\Desktop\\readfile.json", true);
		pw.write(jsonobj.toJSONString());
		System.out.println("New value=" + jsonobj.toString());
	 pw.flush();
	 pw.close();
	}
}

