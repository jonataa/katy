package Lista7Ex2;

public class Imovel {
	
	protected double preco;
	protected String endereco;
	
	Imovel()
	{
		
	}
	
	Imovel(double preco, String endereco)
	{
		this.preco = preco;
		this.endereco = endereco;
	}
	
	public void setPreco(double preco)
	{
		this.preco = preco;
	}
	
	public double getPreco()
	{
		return this.preco;
	}
	
	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}
	
	public String getEndereco()
	{
		return this.endereco;
	}

}
