package com.atmecs;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteFile
{
@SuppressWarnings("unchecked")
public static void main(String[] args) throws IOException 
{
Scanner scan= new Scanner(System.in);
JSONObject jo = new JSONObject();
System.out.println("Enter the firstname");
String firstname=scan.nextLine();
System.out.println("Enter the lastname");
String lastname=scan.nextLine();
System.out.println("Enter the age");
int age=scan.nextInt();
         
       // putting data to JSONObject 
       jo.put("firstName", firstname); 
       jo.put("lastName", lastname); 
       jo.put("age", age); 
         
       @SuppressWarnings("EmpDetails")
       Map map = new LinkedHashMap(4);
       scan.nextLine();
       System.out.println("Enter EmpId");
       String empid=scan.nextLine();
       System.out.println("Enter EMPROLE");
       String role=scan.nextLine();
       System.out.println("Enter EMPSKILL");
       String skill=scan.nextLine();
       map.put("EmpId " ,empid); 
       map.put("EMPROLE ",role); 
       map.put("EMPSKILL",skill);     
       jo.put("EmpId ", empid);
       jo.put("EmpROLE ", role);
       jo.put("EmpSKILL ",skill);
       
       System.out.println("Details recorded in the json file");
       // writing JSON to file:"JSONExample.json" in cwd 
       FileWriter pw = new FileWriter("C:\\Users\\saianusha.podichervu\\Desktop\\readfile.json",true); 
       pw.write(jo.toJSONString()); 
         
       pw.flush(); 
       pw.close(); 
   } 
}