package Lista7;

public class Ingresso {
	
	private double valor;
	
	Ingresso(double valor)
	{
		this.valor = valor;
	}
	
	public void setValor(double valor)
	{
		this.valor = valor;
	}
	
	public double getValor()
	{
		return this.valor;
	}
	
	public void imprimeValor()
	{
		System.out.println(this.valor);
	}

}
