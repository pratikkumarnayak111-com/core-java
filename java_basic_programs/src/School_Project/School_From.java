package School_Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class School_From {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
			ObjectInputStream ois=new ObjectInputStream(
					new FileInputStream("Schoolfile.src"));
		
			School s2=(School) ois.readObject();
			
			ois.close();
			
			System.out.println("Object read from file");
			System.out.println(s2);
	}

}
