package Lista7;

public class VIP extends Ingresso {
	
	private double valorAdicional;
	
	VIP (double valor, double valorAdicional)
	{
		super(valor);
		this.valorAdicional=valorAdicional;
	}
	
	public double getValor()
	{
		return super.getValor() + this.valorAdicional;
	}
	
	public void setValorAdicional(double valorAdicional)
	{
		this.valorAdicional = valorAdicional;
	}
	
	public double getValorAdicional(double valorAdicional)
	{
		return this.valorAdicional;
	}

}