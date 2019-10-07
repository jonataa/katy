package Lista7Ex2;

public class Novo extends Imovel {
	
	private double valoradicional;
	
	
	Novo(double valoradicional)
	{
		this.valoradicional = valoradicional;
	}
	
	public void setValoradicional(double valoradicional)
	{
		this.valoradicional = valoradicional;
	}
	
	public double getValoradicional()
	{
		return this.valoradicional;
	}

	public double getPreco()
	{
		return this.preco + this.valoradicional;
	}
	
	public void imprimeAdicional()
	{
		System.out.println(this.valoradicional);
	}
}
