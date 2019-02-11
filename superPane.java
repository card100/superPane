/*                                     __________                         
  ______ __ __ ______    ____  _______ \______   \_____     ____    ____  
 /  ___/|  |  \\____ \ _/ __ \ \_  __ \ |     ___/\__  \   /    \ _/ __ \ 
 \___ \ |  |  /|  |_> >\  ___/  |  | \/ |    |     / __ \_|   |  \\  ___/ 
/____  >|____/ |   __/  \___  > |__|    |____|    (____  /|___|  / \___  >
     \/        |__|         \/                         \/      \/      \/ 
 */
import javax.swing.JOptionPane;

/* Henry Gruett
 * 2/1/2019
 * v1.1.1
 * Lets you make a pane quickly-er
 */
public class superPane {
	/* getInt(1, "Enter number", "Number not entered");
	 * 
	 * Parameters: loop?   main message      error message
	 *             (0/1)    String             string
	 * Return: int
	 */
	public static int getInt(int loop, String message, String errorMessage) {
		boolean valid = false;
		int output = 0;
		String old = "";
		while (!valid){
			try{
				old = JOptionPane.showInputDialog(null, message);
				output = Integer.parseInt(old);
				valid = true;
				return output;
			} catch (Exception e) {
				if (loop == 0){
					return 0;
				} else if (loop == 1){
					JOptionPane.showMessageDialog(null, errorMessage);	
				}
			}
		}
		return 0;
	}
	
	/* getString();
	 * 
	 * Parameters: message
	 * 
	 * Return: string
	 */
	public static String getString(String message) {
		String output = "0";
		String old = "";
		try{
			old = JOptionPane.showInputDialog(null, message);
			output = old;
			return output;
		} catch (Exception e) {
			return "error: "+e;
		}
	}
	
	/* getDouble(1, "Enter number", "Number not entered");
	 * 
	 * Parameters: loop?   main message      error message
	 *             (0/1)    String             string
	 * Return: double
	 */
	public static double getDouble(int loop, String message, String errorMessage) {
		boolean valid = false;
		double output = 0;
		String old = "";
		while (!valid){
			try{
				old = JOptionPane.showInputDialog(null, message);
				output =   Double.parseDouble(old);
				valid = true;
				return output;
			} catch (Exception e) {
				if (loop == 0){
					return 0;
				} else if (loop == 1){
					JOptionPane.showMessageDialog(null, errorMessage);	
				}
			}
		}
		return 0;
	}
	
	/* getOption("Choose a choice", "This is a title", myChoicesArray, 0);
	 * 
	 * Parameters: Message     Title     Choices    Default Choice
	 * 			   String      String    String[]   int 0 - arrayLength
	 * 
	 * Return: int
	 */
	public static int getOption(String message, String title, String[] choices, int piggyFav) {
		int output = JOptionPane.showOptionDialog(null, message, title, 0, 0, null, choices, choices[piggyFav]);
		return output;
	}
}
// the end...
