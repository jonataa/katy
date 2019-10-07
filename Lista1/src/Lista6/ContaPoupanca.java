package Lista6;

public class ContaPoupanca extends Conta{
	
	private double taxarendimentomes;
	private int diarendimento;
	
	ContaPoupanca(String nome, double saldo)
	{
		super(nome, saldo);
	}
	
	public void calcularNovoSaldo(double taxarendimentomes, int diarendimento)
	{
		double novosaldo = Math.pow(1+taxarendimentomes, diarendimento/30) * this.saldo;
		this.saldo = novosaldo;
		this.taxarendimentomes = taxarendimentomes;
		this.diarendimento = diarendimento;
	}
	
	public double getTaxarendimentomes()
	{
		return this.taxarendimentomes;
	}
	
	public int getDiarendimento()
	{
		return this.diarendimento;
	}
	
	public String toString()
	{
		return "Nome: " + this.nome + "\n" + "Saldo: " + this.saldo + "\n" + "Taxa rendimento mes: " + this.taxarendimentomes + "\n" + "Dia rendimento: " + this.diarendimento;
	}

}
