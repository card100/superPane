import javax.swing.JOptionPane;

/* Henry Gruett
 * 2/1/2019
 * v0.2
 * Lets you make a pane quickly-er
 */
public class superPane {
	/* getInt(1);
	 * 
	 * Parameters: loop?
	 *             (0/1)
	 * Return: int
	 */
	public static int getInt(int loop) {
		boolean valid = false;
		int output = 0;
		String old = "";
		while (!valid){
			try{
				old = JOptionPane.showInputDialog(null, "Enter a number");
				output = Integer.parseInt(old);
				valid = true;
				return output;
			} catch (Exception e) {
				if (loop == 0){
					return 0;
				} else if (loop == 1){
					JOptionPane.showMessageDialog(null, "NaN");
					
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
}
