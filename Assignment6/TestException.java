package Assignment6;

import java.io.FileNotFoundException;
import java.io.IOException;
/*Problem: 
 * In a catch block handling multiple exceptions, it will result to compilation error 
 * to write child and parent exception in same catch with pipe. In this case,
 * FileNotFoundException is a child exception of IOException,
 * we could put them separate catch clauses or just catch the base exception.
 * 
 */
public class TestException {
	
	public static void main(String[] args) {
		try {
			testException();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void testException() throws IOException, FileNotFoundException{
		
	}

}
