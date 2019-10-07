package Lista6;

import javax.swing.JOptionPane;

public class TesteConta {
	
	public static void main(String[] args)
	{
		ContaPoupanca cp = new ContaPoupanca("Katarina", 100.0);
		
		cp.sacar(5);
		cp.depositar(50);
		cp.calcularNovoSaldo(0.05, 30);

		JOptionPane.showMessageDialog(null, cp.toString());
		
		ContaEspecial ce = new ContaEspecial("Katarina", 40.00, 1234, 100.00);
		
		ce.sacar(50);
		JOptionPane.showMessageDialog(null, ce.toString());
		
		ce.depositar(60);
		
		JOptionPane.showMessageDialog(null, ce.toString());
		
		
		
	}
	
	

}
