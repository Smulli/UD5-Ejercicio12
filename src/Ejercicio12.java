import javax.swing.JOptionPane;
public class Ejercicio12 {
	
	public static void main(String args[]) {
		
		String password = "Papuchi";
		
		//Esta variable del tipo booleana nos controlara que en caso de que acierte la condicion cambie.
		boolean enter = false;
		
		for (int i=0; i<3 && !enter;i++) {
			String pass = JOptionPane.showInputDialog("Introduzca una contraseña");{
				
				//Comprueba si coincide.
				if (pass.equals(password)) {
					JOptionPane.showMessageDialog(null, "Felicidades, papucho!");
					enter = true;
				}
			}
		}
	}

}
