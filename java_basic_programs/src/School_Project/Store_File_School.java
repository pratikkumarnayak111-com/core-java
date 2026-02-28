package School_Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Store_File_School {
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args)throws IOException,FileNotFoundException, ClassNotFoundException {
		
		
		
		ObjectOutputStream oos=new ObjectOutputStream(
				new FileOutputStream("Schoolfile.src"));
		
		School sch=new School();
		System.out.println("Enter Student Name :");
		sch.setSname(scn.next());
		System.out.println("Enter Student Id :");
		sch.setSno(scn.nextInt());
		System.out.println("Enter Student Father Name:");
		sch.setSFname(scn.next());
		System.out.println("Enter Address :");
		sch.setAddress(scn.next());
		System.out.println("Enter Password Number:");
		sch.setSpassword(scn.nextLong());
		
		oos.writeObject(sch);
		
		oos.close();
		oos.flush();
		
		System.out.println("Data Store successfully");
		
		ObjectInputStream ois=new ObjectInputStream(
				new FileInputStream("Schoolfile.src"));
	
		School s2=(School) ois.readObject();
		
		ois.close();
		
		System.out.println("Data retrive successfully");
		System.out.println(s2);
		
	}

}
