package School_Project;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Store_File_School {
	public static void main(String[] args)throws IOException,FileNotFoundException {
		
		
		
		ObjectOutputStream oos=new ObjectOutputStream(
				new FileOutputStream("Schoolfile.src"));
		
		School sch=new School("Pratik",101,"Kamalakanta","BBSR,Odisha",848008557L);
		
		oos.writeObject(sch);
		
		oos.close();
		oos.flush();
		
		System.out.println("Object written to file successfully");
		
	}

}
