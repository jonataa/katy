package Lista7Ex2;

public class Velho extends Imovel{

	private double desconto;
	
	
	Velho(double desconto)
	{
		this.desconto = desconto;
	}
	
	public void setDesconto(double desconto)
	{
		this.desconto = desconto;
	}
	
	public double getDesconto()
	{
		return this.desconto;
	}
	
	public double getPreco()
	{
		return this.preco - this.desconto;
	}
	
	public void imprimeDesconto()
	{
		System.out.println(this.desconto);
	}
	

}
