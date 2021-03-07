package Assignment6;

/*Problem:
 *  If there are multiple catch blocks, all catch blocks must be ordered 
 *  from most specific to most general, i.e. catch for a subclass exception 
 *  must be put before a catch for its superclass, otherwise the subclass
 *  exception will be unreachable. In this case, NumberFormatException is a subclass of Exception, 
 *  so it must come before Exception.
 */
public class ExceptionHandling {

	public static void main(String[] args) {
		try
		{
			int i = Integer.parseInt("abc");
			System.out.println(i);
		}catch(NumberFormatException ex)
		{
			ex.printStackTrace();		
		}catch(Exception ex)
		{
			System.out.println("This block handles all exception types");
		}
		
	}

}
