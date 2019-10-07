package Lista6;

public class ContaEspecial extends Conta{
	
	protected double limite, limiteatual;
	
	ContaEspecial(String nome, double saldo, int num, double limite)
	{
		super(nome, saldo, num);
		this.limite = limite;
		this.limiteatual = limite;
	}
	
	public void sacar(int quantia)
	{
		if (this.saldo >= quantia)
		{
			this.saldo = (this.saldo - quantia);
			
		}
		else if (this.saldo < quantia)
		{
			double x = quantia - this.saldo;
			this.limiteatual = this.limiteatual - x;
			this.saldo=0;
		
		}
		else if (quantia > this.saldo + this.limiteatual)
		{
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void depositar(int valor)
	{
		if ((this.saldo >= 0) && (this.limiteatual==this.limite))
		{
			this.saldo = this.saldo + valor;
		}
		
		else if ((this.saldo==0) && (this.limiteatual < this.limite))
		{
			double y = valor - (this.limite - this.limiteatual);
			this.saldo = this.saldo + y;
			this.limiteatual = this.limite;
		}
	}
	
	public String toString()
	{
		return "Nome: " + this.nome + "\nSaldo: " + this.saldo + "\n" + "Numero da conta: " +this.num+ "\n" + "Limite atual: " +this.limiteatual + "\n" + "Limite: " +this.limite;
	}
	
	

}
